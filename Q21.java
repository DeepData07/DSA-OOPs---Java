//Largest number in array
import java.util.*;
public class Q21 {
	public static int LargestN(int numbers []) {
		int largest=Integer.MIN_VALUE;
		for (int i=0;i<numbers.length;i++) {
			if(numbers[i]>largest) {
				largest=numbers[i];
			}
		}
		return largest;
	}
	public static void main(String args[]) {
		int numbers[]= {23,43,1,65,3,67};
		System.out.println("Largest is :- "+LargestN(numbers));
	}

}
