//Arrays
import java.util.*;
public class Q18 {
	public static void main(String args[]) {
		int marks[]=new int[10];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter marks of maths");
		marks[0]=sc.nextInt();
		System.out.println("Enter marks of physics");
		marks[1]=sc.nextInt();
		System.out.println("Enter marks of chem");
		marks[2]=sc.nextInt();
		System.out.println("marks of maths - "+marks[0]);
		System.out.println("marks of physics - "+marks[1]);
		System.out.println("marks of chem - "+marks[2]);
		System.out.println(marks);
		marks[2]=29;// - updation
		marks[1]=marks[1]+3;//aise elemnts pe operation bhi lga sakte hai
		System.out.println("length is "+marks.length);
	}

}
