// inbuld sort
import java.util.*;
public class SORT5 {
	public static void main(String arr[]) {
		Integer array[]= {5,4,1,3,2};
		Arrays.sort(array,1,5);
		Arrays.sort(array,Collections.reverseOrder());
		PrintArr(array);
		
		
	}
	public static void PrintArr(Integer array[]) {
		for(Integer i=0;i<array.length;i++) {
			System.out.print(array[i]+" ");
		}
		System.out.println();
	}

}
