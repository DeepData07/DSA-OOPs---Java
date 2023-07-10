// Linear search
public class Q20 {
	public static int LS(int numbers[], int key) {
		for(int i=0;i<numbers.length;i++) {
			if(numbers[i]==key) {
				return i;
			}
		}
		return -1;
	}
	public static void main(String args[]) {
		int numbers[]= {1,2,3,4,5,6,7,8,9};
		int key = 6;
		int index=LS(numbers,key);
		if(index==-1) {
			System.out.println("Key is wrong");
		}
		else {
			System.out.println("Index is :- "+index);
		}
	}

}
