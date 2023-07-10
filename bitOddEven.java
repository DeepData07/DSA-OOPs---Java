
public class bitOddEven {
	public static void main(String args[]) {
		evenOdd(3);
		evenOdd(4);
	}
	public static void evenOdd(int n) {
		int bitMask = 1;
		if((n & bitMask)==0) {
			System.out.println("even");
		}
		else {
			System.out.println("odd");
		}
	}

}
