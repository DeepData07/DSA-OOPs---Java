
public class rotatedSortedsearch {
	public static void main(String args[]) {
		int arr[]= {4,5,6,7,0,1,2};
		int target =0;
		int tarIdx = search(arr, target, 0, arr.length-1);
		System.out.println(tarIdx);
	}
	public static int search(int arr[],int target, int si, int ei) {
		if(si>ei) {
			return -1;
		}
		int mid = si+(ei-si)/2;
		if(arr[mid] == target) {
			return mid;
		}
		else {
			//mid on L1
			if(arr[si]<=arr[mid]) {
				// case a: left on L1
				if(arr[si]<=target && target<=arr[mid]) {
					return search(arr,target,si,mid);
				}
				//case b: right on l1 
				else {
					return search(arr, target, mid+1,ei);
				}
			}
			//else means on L2
			else {
				//case c: l2 ke right pr
				if(target>=arr[mid] && target<=arr[ei]) {
					return search(arr,target,mid+1,ei);
				}
				//case d: l2 ke left pr
				else {
					return search(arr,target,si,mid-1);
				}
				
			}
		}
	}
	

}
