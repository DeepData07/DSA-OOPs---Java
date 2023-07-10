
public class firendPair {
	public static void main(String args[]) {
		System.out.println(friendPair(3));
	}
	public static int friendPair(int n) {
		if(n==1 || n==2) {
			return n;
		}
		int single = friendPair(n-1);
		int pair = (n-1)*friendPair(n-2);
		int total = single+pair;
		return total;
	}

}
