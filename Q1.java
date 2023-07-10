// Sum of first n natural numbers:- WHILE LOOPS
import java.util.*;
public class Q1 {
	public static void main(String args[]) {
		System.out.println("Enter n");
		int n;
		int sum=0;
		int counter=1;
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		while(counter<=n) {
			sum=sum+counter;
			//System.out.println("The sum is" + sum); - ye line run krte to har baar sum krke ye print krte rehta, isliye better to run it outside loop
			counter++;
		}
		System.out.println("The sum is " + sum);
		
		
	}

}
