package term4ISTD;
import java.util.*;


public class Pset1 {	
	
	public static boolean isAllCharacterUnique(String sIn) {
		final int MAX_CHAR = 256;
		
		if(sIn.length()>MAX_CHAR) {
			return false;
		}
		
		boolean [] chars = new boolean[MAX_CHAR];
		Arrays.fill(chars, false);
		
		for(int f=0;f<sIn.length();f++){
			int index = (int)sIn.charAt(f);
			if(chars[index] == true) {
				return false;
			}
			chars[index] = true;
		} 
		return true;
	}
	
	public static void main(String[] args) {
		System.out.println(isAllCharacterUnique("abcdefgha"));
		System.out.println(Pset1.isPermutation("@ab", "a@b"));
		System.out.println(Pset1.isPermutation("abcd", "bcdA"));
		System.out.println(Pset1.isPermutation("mikahlamka", "akmalhakim"));

		
		
	}
	
	
	public static boolean isPermutation(String sIn1, String sIn2) {
		
		if(sIn1.length()!=sIn2.length()) {
			return false;
		}
		final int MAX_CHAR = 256;
		
		int [] chars1 = new int[MAX_CHAR];
		Arrays.fill(chars1, 0);
		for(int i=0;i<sIn1.length();i++) {
			int index = (int)sIn1.charAt(i);
			chars1[index]+=1;
		}
		int [] chars2 = new int[MAX_CHAR];
		Arrays.fill(chars2, 0);
		for(int i=0;i<sIn1.length();i++) {
			int index = (int)sIn2.charAt(i);
			chars2[index]+=1;
		}
		for(int i=0;i<chars2.length;i++) {
			if(chars1[i]!=chars2[i]) {
				return false;
			}
	//todo: add your implementation				
	}
	return true;
	
}
	
}
