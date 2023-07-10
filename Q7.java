// Check whether the given number is prime or not
import java.util.*;
public class Q7 {
	public static void main(String args[]) {
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n==2) {
			System.out.println("Its a prime number");
		}
		else {
			boolean isPrime = true;
			for(int i=2; i<=Math.sqrt(n); i++) {
				if(n%i==0) {
					isPrime=false;
				}
			}
			if(isPrime == true) {
				System.out.println("Number is prime");
			}
			else {
				System.out.println("not a prime");
			}
		}
		
	}
	

}
