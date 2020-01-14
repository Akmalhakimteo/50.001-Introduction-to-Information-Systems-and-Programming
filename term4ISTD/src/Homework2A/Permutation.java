package Homework2A; //RMB TO DELETE

import java.util.ArrayList;

public class Permutation {
    private final String in;
    private ArrayList<String> a = new ArrayList<String>();
    // additional attribute if needed



    Permutation(final String str){
        in = str;
        // additional initialization if needed
        
        
    }
        

    public void permute(){
        // produce the permuted sequence of 'in' and store in 'a', recursively
//    	a.add(String.valueOf(in.charAt(0)));
    	deepPermute(in, 0, in.length()-1); //start recursion
    }
    	
    private void deepPermute(String stringhere, int left_index, int right_index) {
    	if(left_index==right_index) { //base case if same 
    		System.out.println("stringhere is:" + stringhere);
    		System.out.println("a before" + a);
    		a.add(stringhere);
    		System.out.println("a after" + a);
    	}
    	else {
    		for(int k = left_index; k<= right_index ; k++) {
    			stringhere =  swap(stringhere,left_index,k);
    			deepPermute(stringhere, left_index + 1, right_index); //recurse
    			stringhere = swap(stringhere,left_index,k); 
    		}
    	}
    }
    	
    	
    	
    	
    	
    	
    
    private String swap(String ch, int i , int j) {
    	char [] ch_inArray = ch.toCharArray();
    	char temp = ch_inArray[i];
    	ch_inArray[i] = ch_inArray[j];
    	ch_inArray[j] = temp;
    	return String.valueOf(ch_inArray);
    	
    }
    
    

    public ArrayList<String> getA(){
        return a;
    }
    
    
    
    public static void main(String[] args) {
		ArrayList<String> v;
		Permutation p = new Permutation("hat");
		p.permute();
		v = p.getA();
		System.out.println(v);
	}
}
