// prime number- again because its used as a helper function in lot of questions
import java.util.*;
public class Q12 {
	public static boolean isPrime(int n) {
		boolean prime = true;
		if(n==1) {
			prime = true;
		}
		else if (n==2) {
			prime = true;
		}
		else {
			for(int i=1;i<=n-1;i++) {
				if(n%i==0) {
					prime = false;
				}
			}
		}
		return prime;
	}
	public static void main(String args[]) {
		System.out.println("enter the number");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(isPrime(n));
	}

}
