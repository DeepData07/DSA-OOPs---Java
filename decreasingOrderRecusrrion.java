
public class decreasingOrderRecusrrion {
	public static void main(String args[]) {
		decOrder(10);
		incOrder(10);
		System.out.println(recurssion(5));
		System.out.println(sumNnatural(5));
		System.out.println(fibo(5));
		int arr[]= {1,2,3,4,5};
		System.out.println(sortedArrayYN(arr,0));
		System.out.println(firstOcc(arr,0,4));
		System.out.println(lastOcc(arr,4,0));
		System.out.println(optimizedPow(2,3));
	}
	public static void decOrder(int n) {
		if(n==1) {
			System.out.print(n);
			return;
		}
		System.out.print(n+" ");
		decOrder(n-1);
	}
	public static void incOrder(int n) {
		if(n==1) {
			System.out.print("1");
			return;
		}
		incOrder(n-1);
		System.out.print(n+" ");
		
	}
	public static int recurssion(int n) {
		if(n==0) {
			return 1;
		}
		int fact_1 = recurssion(n-1);
		int fact = n*fact_1;
		return fact;
	}
	public static int sumNnatural(int n) {
		if(n==1) {
			return 1;
		}
		int sum = n+sumNnatural(n-1);
		return sum;
	}
	public static int fibo(int n) { // time complexity 2^n
		if(n==0) {
			return 0;
		}
		else if(n==1) {
			return 1;
		}
		int fib = fibo(n-1)+fibo(n-2);
		return fib;
	}
	public static boolean sortedArrayYN(int arr[], int i) {
		if(arr[i]==arr.length-1) {
			return true;
		}
		if(arr[i]>arr[i+1]) {
			return false;
			
		}
		return sortedArrayYN(arr,i+1);
		
	}
	public static int firstOcc(int arr[], int i, int key) {
		if(arr[i]==key) {
			return i;
		}
		if (i==arr.length-1) {
			return -1;
		}
		return firstOcc(arr,i+1,key);
	}
	public static int lastOcc(int arr[], int key, int i) {
		if(i==arr.length) {
			return -1;
		}
		int isFound=lastOcc(arr,key,i+1);
		if(isFound==-1 && arr[i]==key) {
			return i;
		}
		return isFound;
	}
	public static int optimizedPow(int a, int n) {
		if(n==0) {
			return 1;
		}
		
		int half = optimizedPow(a,n/2);
		//*********
		//int halfsq= optimizedPow(a,n/2)*optimizedPow(a,n/2) ye kuni kra kuki isse bhi time complexity o(n) ati
		int halfsq = half*half;
		if(n%2!=0) {
			halfsq=a*halfsq;
		}
		return halfsq;
		
		
	}

}
