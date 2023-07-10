// print sum of even and odd integers
import java.util.*;
public class Q8 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int number;
		int choice;
		int evenSum=0;
		int oddSum=0;
		do {
			number = sc.nextInt();
			if (number%2==0) {
				evenSum=evenSum+number;
			}
			else {
				oddSum=oddSum+number;
			}
			System.out.println("1-for continue, 0-for discontinue");
			choice = sc.nextInt();
		}while(choice==1);
		System.out.println("even sum is "+evenSum);
		System.out.println("odd sum is"+oddSum);
	}
	

}
