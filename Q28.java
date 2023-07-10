// Kadanes max sub array sum
// if all elemnts are negative then ????
import java.util.*;
public class Q28 {
	public static void kadane(int numbers[]){
		int cs =0;
		int max=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;
		for(int i=0;i<numbers.length;i++) {
				cs = cs+numbers[i];
				if(cs<0) {
					cs=0;
				}
				max=Math.max(cs, max);
			}
			System.out.println("max sum is "+ max);
		}
	public static void main(String args[]) {
		int numbers[] = {-2,-3,4,-1,-2,1,5,-3};
		kadane(numbers);
	}

}
