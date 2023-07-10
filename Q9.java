// factorial
import java.util.*;
public class Q9 {
	public static void main(String args[]) {
		int fact=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("enetr the number");
		int n = sc.nextInt();
		for (int i=1; i<=n; i++) {
			fact=fact*i;
		}
		System.out.println("fact is "+fact);
	}

}
