package InnerClass;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;


public class TestOuterClass {
	 public static void main (String[] args){

//		 checkValidString("-1.0");
//		 }
//	 static boolean checkValidString(String string) {
//		Double x = Double.valueOf(string);
//		if(x<0) throw new IllegalArgumentException("Negative numbers are not valid inputs");
//		return true;
		//Instantiate OuterClass
		 OuterClass outerClass = new OuterClass();
		 //Instantiate the InnerClass
		 OuterClass.InnerClass innerClass = outerClass.new InnerClass();
		 //Show that InnerClass can access variables in OuterClass
		 innerClass.innerPrintA();
		 //Show that InnerClass stores a reference to OuterClass 
		 innerClass.giveBackOuter();
		 
		 
		 
		
	}
		

}
