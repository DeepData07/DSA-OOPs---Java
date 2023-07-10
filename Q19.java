// Update an array entry using function arguments + array uses call by refrence
import java.util.*;
public class Q19 {
	public static void arrUp(int marks[]) {
		for (int i=0;i<marks.length;i++) {
			marks[i]=marks[i]+1;
		}
	}
	public static void main(String args[]) {
		int marks[]= {1,2,3};
		arrUp(marks);
		for(int i=0;i<marks.length;i++) {
			System.out.println("output is "+marks[i]);
		}
		System.out.println();
	}

}
