import java.util.*;
public class stringSubstring {
	public static void main(String args[]) {
		String str = "Hello World";
		System.out.println(sub(str,0,5));
		// or
		System.out.println(str.substring(0,5));
	}
	public static String sub(String str, int si, int ei) {
		String newStr="";
		for (int i=si;i<ei;i++) {
			newStr = newStr+str.charAt(i);
		}
		return newStr;
	}

}
