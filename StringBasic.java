import java.util.*;
public class StringBasic {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String name;
		name=sc.nextLine();
		System.out.println(name.length());
		String first = "sheldon";
		String last = "cooper";
		String full = first + " " + last;
		System.out.println(full);
	}

}
