// Prefix max sub array sum
public class Q27 {
	public static void preSum(int numbers[]) {
		int mSum=Integer.MIN_VALUE;
		int cSum=0;
		int pre[]=new int[numbers.length];
		pre[0]=numbers[0];
		for(int i=1;i<pre.length;i++) {
			pre[i]=pre[i-1]+numbers[i];
			
		}
		for(int k=0;k<numbers.length;k++) {
			int start =k;
			for(int j=k;j<numbers.length;j++) {
				int end=j;
				cSum = start == 0 ? pre[end] : pre[end] - pre[start-1];
				if(cSum>mSum) {
					mSum=cSum;
				}
			}
		}
		System.out.println("Max sum is "+ mSum);
	}
	public static void main(String args[]) {
		int marks[] = {2,3,-1,54,23,0,12};
		preSum(marks);
	}

}
