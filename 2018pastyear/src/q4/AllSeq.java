package q4;


import java.util.ArrayList;
import java.util.Arrays;


//starting code


public class AllSeq {
	public ArrayList<String> combine1;
	
    public static void main(String[] args) {
        String[] s = {"p", "q"};
        System.out.println(compAllSeq(s, 3));

        String[] s2 = {"1", "2", "3", "4"};
        System.out.println(compAllSeq(s2, 1));


    }


    public static ArrayList<String> compAllSeq(String[] s, int k){
    //TODO: implement recursive method to compute all possible sequences of length k
    if(k==1) {
    	System.out.println("base case:"+Arrays.asList(s));
    	return new ArrayList<String>(Arrays.asList(s));
    }
    else {
    	ArrayList<String> l = compAllSeq(s, k-1);
    	
    	ArrayList<String> l1 = new ArrayList<>();
    	for(String str:l) {
    		for(String ch:s) {
    			String str1 = ch + str;
    			l1.add(str1);
    		}	
    	}
    	System.out.println("interim case:"+l1);
    	return l1;
    }
    	
    }
}

