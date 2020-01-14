//***[QUESTION 3]*********

public class SecureClass {
 
    private static String passwd= "iHateJava";
    
    public static SecureClass requestInstance(String passwdIn){
    	if(passwdIn==passwd){
    		return new SecureClass();
    	}
    	else {
    		return null;
    	}
    }
	@Override
    public String toString(){
        return "I am an instance of SecureClass";
    }
 
    //TODO: finish the code for SecureClass
}