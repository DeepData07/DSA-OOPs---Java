
public class bitOperations {
	public static void main(String args[]) {
		getBit(15,2);
		System.out.println(setBit(10,2));
		System.out.println(clearBit(10,1));
		System.out.println(updateBit(10,1,1));
		System.out.println(clearIbits(10,2));
	}
	public static void getBit(int n, int i) {
		int bitMask = 1<<i;
		if((n & bitMask)==0) {
			System.out.println("ith bit is 0");
		}
		else {
			System.out.println("ith bit is 1");
		}
	}
	public static int setBit(int n, int i) {
		int bitMask = 1<<i;
		return n|bitMask;
	}
	public static int clearBit(int n, int i) {
		int bitMask = ~(1<<i);
		return n&bitMask;
	
	}
	public static int updateBit(int n, int i, int newBit) {
		if(newBit==0) {
			return clearBit(n,i);
		}
		else {
			return setBit(n,i);
		}
		
	}
	public static int clearIbits(int n, int i) {
		int bitMask = ((-1)<<i);
		return n&bitMask;
	}
}
