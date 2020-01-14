package term4ISTD;
import java.lang.Math;

public class PrimeNumberChecker {
	public static int isPrime(int num) {
		for (int i=2; i < (int) Math.sqrt(num) ; i++ ) {
			if(num%i==1) {
				return 0;
			}
		}
		return 1;
	}
	
//	public static void main(String[] args) {
//		System.out.println(isPrime());
//	}

}
