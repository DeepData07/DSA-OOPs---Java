// Palindrome
import java.util.*;
public class Q16 {
	public static boolean isPalindrome(int n) {
		int palindrome = n;
		int reverse = 0;
		while(palindrome!=0) {
			int remainder_LD = palindrome%10;
			reverse = reverse*10+remainder_LD;
			palindrome=palindrome/10;
		}
		if(n==reverse) {
			System.out.println("is a palindrome");
			return true;
		}
		System.out.println("is not a palindrome");
		return false;
	}
	public static void main(String args[]) {
		System.out.println("Enetr the number");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		isPalindrome(n);
 
	}

}
