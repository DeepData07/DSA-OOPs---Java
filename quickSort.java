
public class quickSort {
	public static void main(String args[]) {
		int arr[]= {6,3,9,8,2,5};
		quick(arr,0,arr.length-1);
		print(arr);
	}
	public static void print(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+ " ");
		}
		System.out.println();
	}
	public static void quick(int arr[], int si, int ei) {
	    if(si>=ei) {
	    	return;
	    }
		int pivotIdx=partition(arr, si, ei);//ye partiotn krdega, or pivot ko bhi sahi jagah ladega
	    //ab pivot ke left right me bhi recusively krdo dubara
	    quick(arr,si,pivotIdx-1);//left
	    quick(arr,pivotIdx+1,ei);//right
	}
	public static int partition(int arr[], int si, int ei) {
		int pivot = arr[ei];
		int i = si-1;
		for(int j=si;j<ei;j++) {
			if(arr[j]<=pivot) {
				i++;
				//swap
				int temp = arr[j];
				arr[j]=arr[i];
				arr[i]=temp;
			}
		}
		//pivot ko shi lane kelie
		int temp = pivot;
	    arr[ei]=arr[i];
	    arr[i]=temp;
	    return i;
	}

}
