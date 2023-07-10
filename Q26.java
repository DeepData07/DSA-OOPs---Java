// Sum of Max Sub array
public class Q26 {
	public static void maxSum(int numbers[]) {
		int Csum = 0;
		int Msum = Integer.MIN_VALUE;
		for(int i=0;i<numbers.length;i++) {
			int start = i;
			for(int j=i;j<numbers.length;j++) {
				int end =j;
				Csum=0;// VVVVVV IMP
				for (int k=start;k<=end;k++) {
					Csum=Csum+numbers[k];
				}
				System.out.println(Csum);
				if(Csum>Msum) {
					Msum=Csum;
				}
			}
		}
		System.out.println("Max sum is "+ Msum);
	}
	public static void main(String args[]) {
		int marks[]= {2,3,-1,54,23,0,12};
		maxSum(marks);
		
	}

}
