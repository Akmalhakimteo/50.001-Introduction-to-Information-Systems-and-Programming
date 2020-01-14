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
        deepPermute(in,0,in.length()-1);

    }
    
    

    private void deepPermute(String in2, int first, int last) {
		// TODO Auto-generated method stub
    	if(first==last) {
    		a.add(in2);
    	}
    	else {
    		for(int k = first;k<=last;k++) {
    			in2 = swap(in2,first,k);
    			deepPermute(in2, first+1, last);
    			in2 = swap(in2,first,k);
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
