// Bubble sort
public class Sort1 {
	public static void main(String args[]) {
		int arr[]= {5,4,2,3,1};
		BubbleSort(arr);
		PrintArr(arr);
	}
	
	public static void BubbleSort(int arr[]) {
		for(int turn=0; turn<arr.length-1;turn++) {
			for(int j=0;j<arr.length-1-turn;j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
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

