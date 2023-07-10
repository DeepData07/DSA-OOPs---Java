// Binary Search
import java.util.*;
public class Q22 {
	public static int BS(int numbers[],int key) {
		int start=0;
		int end=numbers.length-1;
		
		while(start<=end) {
			int mid=(start+end)/2;
			if(numbers[mid]==key) {
				return mid;
			}
			if(numbers[mid]>key) {
				end=mid-1;
			}
			else {
				start=mid+1;
			}
			
		}
		return -1;
	}
	public static void main(String args[]) {
		int number[]= {4,6,8,10,12,14};
		int key = 4;
		System.out.println("Key is at "+BS(number,key));
	}

}
