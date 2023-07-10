
public class mergeSort {
	public static void main(String args[]) {
		int arr[]= {6,3,9,5,2,8};
		devide(arr,0,arr.length-1);
		printArr(arr);
	}
	public static void printArr(int arr[]) {
		for (int i=0; i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	public static void devide(int arr[], int si, int ei) {
		if(si>=ei) {
			return;
		}
		int mid = si+(ei-si)/2;
		//left
		devide(arr,si,mid);
		//right
		devide(arr,mid+1,ei);
		merge(arr,si,mid,ei);
	}
	public static void merge(int arr[],int si,int mid, int ei) {
		int temp[] = new int[ei-si+1];// vv imp
		int i = si; //left part iteration
		int j = mid+1;//right part iteration
		int k = 0; //temp part iteration
		while(i<=mid && j<=ei) {
			if(arr[i]<arr[j]) {
				temp[k]=arr[i];
				i++;
				k++;
			}
			else {
				temp[k]=arr[j];
				j++;
				k++;
			}
		}
		// agar sirf left part ya right part bacha to
		//1-left part
		while(i<=mid) {
			temp[k++]=arr[i++];
		}
		//2-right part
		while(j<=ei) {
			temp[k++]=arr[j++];
		}
		
		//copy to original arr
		for( k=0,  i=si; k<temp.length; k++, i++) {
			arr[i]=temp[k];
		}
	}

}
