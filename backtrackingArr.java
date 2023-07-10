
public class backtrackingArr {
    public static void main(String args[]) {
    	int arr[] = new int[5];
    	backArr(arr,0,1);
    	print(arr);
    }
    public static void print(int arr[]) {
    	for(int i=0; i<arr.length;i++) {
    		System.out.print(arr[i]+" ");
    	}
    	System.out.println(" ");
    }
    public static void backArr(int arr[], int index, int value) {
    	if(index==arr.length) {
    		print(arr);
    		return;
    	}
    	arr[index]=value;
    	backArr(arr, index+1, value+1);
    	arr[index]=arr[index]-2;
    }
}
