//Selection sort
public class Sort3 {
	public static void main(String args[]) {
		int arr[]= {5,4,1,3,2};
		SelectionSort(arr);
	}
	public static void SelectionSort(int arr[]){
		for (int i=0;i<arr.length-1;i++) {// to count turn
			int min = i;//jis postion pe hai vo hi min haii manlo
			for(int j =i+1;j<arr.length;j++) {// unsorted array ke lie
				if(arr[min]>arr[j]) {//jo current postion hai min agar vo bache hue unsorted array se badi hai to unka address swap krali hamne
					min=j;
				}
				
			}
			// ab swap ham bahar vale loop mne krenge
			int temp = arr[min];
			arr[min]=arr[i];
			arr[i]=temp;
		}
		for(int i =0;i<arr.length;i++) {
			System.out.print(arr[i]+"  ");
		}
		System.out.println();
		
	}
	
}

