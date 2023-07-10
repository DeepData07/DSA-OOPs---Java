// optimized bubble sort
public class SORT2 {
	public static void main(String args[]) {
		int arr[]= {1,2,3,4};
		BubbleSort(arr);
		PrintArr(arr);
	}
	
	public static void BubbleSort(int arr[]) {
		for(int turn=0; turn<arr.length-1;turn++) {
			boolean swap = false;
			for(int j=0;j<arr.length-1-turn;j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					swap = true;
				}
			}
			if(swap=false) {
				break;
			}
		}
	}
	public static void PrintArr(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+"   ");
				
		}
		System.out.println();
	}
	

}


