// binary to decimal
import java.util.*;
public class Q14 {
	public static void binDec(int n) {
		int power = 0;
		int decimal =0;
		while(n>0) {
			int LD = n%10;
			decimal = decimal+(LD*(int)Math.pow(2, power));//VVV imp - Math.pow always take double type input, so type cast it to int
			power++;
			n=n/10;
		}
		System.out.println("Answer is "+decimal);
	}
	public static void main(String args[]) {
		System.out.println("Enter the binary digit ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		binDec(n);
	}
}
