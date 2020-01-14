package Homework2A;

import java.util.ArrayList;

public class permutationtry {
	
	public ArrayList<String> permute(String str) {
		if(str.length()==2) {
			return str;
		}
		else {
			for (char loopingthru:str.toCharArray()) {
				return String.valueOf(loopingthru) + permute(str.substring(1));
			}
			return null;
		}
		
		
	}
	
	public static void main(String[] args) {
		System.out.println("ABCD");
	}
	
}
