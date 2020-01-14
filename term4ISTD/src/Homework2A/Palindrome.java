package Homework2A;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Palindrome {
    public static boolean isPalindrome (char[] S) {
    	if(S.length==1 || S.length==0) {
    		return true;
    	}
    	
    	if(S[0]!=S[S.length-1]) {
    		return false;
    	}
    	else {
    			char [] S1 = new char [S.length-2];
    			for(int i =1 ; i<=S.length-2; i++) {
    				S1[i-1] = S[i];
    			}
    		
    		return isPalindrome(S1);
    	}
 }

		

	
	public static void main(String[] args) {
		char [] S = {'a','b','c','d','e'};
		System.out.println(isPalindrome(S));
	}
	
}
