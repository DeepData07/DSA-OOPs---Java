// patterns
public class Q10 {
	public static void main(String args[]) {
	char ch='A';
		for (int line=1; line<=4;line++) {
			for(int i=1; i<=4-line+1;i++) {
				System.out.print(i);
			}
			System.out.println();
		}
		for(int n=1;n<=4;n++) {
			for (int z=1;z<=n;z++) {
				System.out.print(ch);
				ch++;
			}
			System.out.println();
		}
	}

}
