//print primes in a range
import java.util.Scanner;
public class Q13 {
	public static boolean isPrime(int n) {
		boolean isprime = true;
		if(n==1) {
			isprime = true;
		}
		else if (n==2) {
			isprime = true;
		}
		else {
			isprime = true;
			for(int i=2;i<=n-1;i++) {
				if(n%i==0) {
					isprime = false;
				}
			}
		}
		return isprime;
	}
	public static void primeRange(int n){
		for(int i=2;i<=n;i++) {
			if(isPrime(i)==true) {
				System.out.print(i+" ");
			}
		}
		System.out.println();
	}
	public static void main(String args[]) {
		System.out.println("enter the number");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(isPrime(n));
		primeRange(n);
	}

}

