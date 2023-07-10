 //Array pairs
public class Q24 {
	public static void pairs(int numbers[] ) {
		for(int i =0;i<numbers.length;i++) {
			int current=numbers[i];
			for(int j=i+1;j<numbers.length;j++) {
				System.out.print("("+current+","+j+")");
			}
			System.out.println();
		}
	}
	public static void pairs2(int numbers[] ) {
		for(int i =0;i<numbers.length;i++) {
			int current=numbers[i];
			for(int j=i+1;j<numbers.length;j++) {
				System.out.print("("+current+","+numbers[j]+")");// logic is different here only
			}
			System.out.println();
		}
	}
	public static void main(String args[]) {
		
		int numbers[]= {1,2,3,4,5,6};
		pairs(numbers);
		pairs2(numbers);
	}

}
