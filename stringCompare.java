import java.util.*;
public class stringCompare {
	public static void main(String args[]) {
		String s1 = "Maverick";
		String s2 = "Maverick";
		String s3 = "MAVERICK";
		String s4 = new String("Maverick");
		if (s1==s2) {
			System.out.println("same");
		}
		else {
			System.out.println("not same");
		}
		if (s1==s3) {
			System.out.println("same");
		}
		else {
			System.out.println("not same");
		}if (s1==s4) {
			System.out.println("same");
		}
		else {
			System.out.println("not same");
		}
		if (s1.equals(s4)) {
			System.out.println("same");
		}
		else {
			System.out.println("not same");
		}
	}

}
