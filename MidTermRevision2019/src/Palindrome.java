
public class Palindrome {
	 public static boolean isPalindrome (char[] S) {
		 if(S.length==0||S.length==1) {
			 return true;
		 }
		 if(S[0]!=S[S.length-1]) {
			 return false;
		 }
		 else {
			 char [] newS = new char[S.length-2];
			 for(int i=1;i<=S.length-2;i++) {
				 newS[i-1]=S[i];
			 }
			 return isPalindrome(newS);
		 }
		 
	 }
	 
	 public static void main(String[] args) {
		System.out.println(isPalindrome("aaa".toCharArray()));
	}
}
