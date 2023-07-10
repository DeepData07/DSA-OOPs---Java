//decimal to binary
import java.util.*;
public class Q15 {
	public static void decBin(int n) {
		int pow =0;
		int binNo=0;
		while(n>0){
			int remainder=n%2;
			binNo=binNo+(remainder*(int)Math.pow(10, pow));
			pow++;
			n=n/2;
		}
		System.out.println("Answer is "+binNo);
	}
	public static void main(String args[]) {
		System.out.println("Enter the decimal no");
		Scanner sc=new Scanner(System.in);
		int n =sc.nextInt();
		decBin(n);
	}

}
