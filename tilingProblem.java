
public class tilingProblem {
	public static void main(String args[]) {
		System.out.println(tilingP(3));
	}
	public static int tilingP(int n) {
		if(n==0 || n==1) {
			return 1;
		}
		//choices
		//1 - vertical
		int vertical = tilingP(n-1);
		
		//2 - horizontal
		int hori = tilingP(n-2);
		 int total = vertical + hori;
		 return total;
	}

}
