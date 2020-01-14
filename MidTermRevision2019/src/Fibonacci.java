
public class Fibonacci {
	
	
    public static String fibonacci( int n ){
    	String here = "0,1";
    	int first = 0;
    	int second = 1;
    	for(int i=0;i<n-2;i++) {
    		int third = first + second;
    		here = here  + "," + String.valueOf(third);
    		first = second;
    		second = third;
    		
    		
    	}
    	return here;
    	
    }
    
    public static void main(String[] args) {
		System.out.println(fibonacci(5));
	}
}
