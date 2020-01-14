import java.util.ArrayList;



public class isAllCharUnique {
	public static boolean isUnique(String here) {
		ArrayList<Character> checker = new ArrayList<Character>();
		for(int i=0;i<here.length();i++) {
			if(checker.contains(here.charAt(i))) {
				return false;
			}
			else {
				checker.add(here.charAt(i));
			}
		}
		return true;
	}
	
	public static boolean isPermutation(String str1, String str2) {
		if(str1.length()!=str2.length()) {
			return false;
		}
		int ascii1 = 0;
		for(int i=0;i<str1.length();i++) {
			ascii1 += (int) str1.charAt(i);	
		}
		int ascii2 = 0;
		for(int k=0;k<str1.length();k++) {
			ascii2 += (int) str2.charAt(k);
		}
		return ascii1==ascii2;
		
		
	}
	
	
	
	
	
	public static void main(String[] args) {
		System.out.println(isUnique("adil"));
		System.out.println(isUnique("abcdefghijklmnopqrstuvABC"));
		System.out.println(isUnique("abcdefgghijklmnopqrstuvABC"));
		System.out.println(isPermutation("@ab", "a@b"));
		System.out.println(isPermutation("abcd", "bcdA"));
	}
}
