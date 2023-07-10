// Tae input from user till a multiple of 10 is printed: - Break
import java.util.*;
public class Q5 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Enter number: - ");
			int n = sc.nextInt();
			if(n%10==0) {
				System.out.println("Multiple of 10 is entered so loop ended");
				break;
			}
			System.out.println(n);
		}while(true);
	}

}