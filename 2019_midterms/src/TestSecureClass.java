//***[QUESTION 3]*********
// ***ATTENTION*****
// >>>>click BUILD, followed by RUN button in Vocareum to execute main() 
//CODE IN THIS FILE IS FOR YOUR INFO
//YOU DO NOT NEED TO EDIT THIS FILE

public class TestSecureClass {
    public static void main(String[] args) {
 
 
        SecureClass c1, c2, c3, c4;
        c1 = SecureClass.requestInstance("hello");
        System.out.println(c1);
 
        c2 = SecureClass.requestInstance("iHateJava");
        System.out.println(c2);
 
        c3 = SecureClass.requestInstance("iLoveMath");
        System.out.println(c3);
 
        c4 = SecureClass.requestInstance("iHateJava");
        System.out.println(c4);
 
 
        System.out.println(c2 == c4);
 
 
 
/*
result:
 
null
I am an instance of SecureClass
null
I am an instance of SecureClass
false
 
 
 */
 
 
    }
}