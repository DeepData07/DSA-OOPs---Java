
public class binaryString {
	public static void main(String args[]) {
		binaryString(3,0,new String(""));
	}
	public static void binaryString(int n, int lastdigit, String str) {
		if(n==0) {
			System.out.println(str);
			return;
		}
		else if(lastdigit==0) {
			binaryString(n-1,0,str+="0");
			binaryString(n-1,1,str+="1");
		}
		else {
			binaryString(n-1,1,str+="1");
		}
	}

}
