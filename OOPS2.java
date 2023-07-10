// Constructors
public class OOPS2 {
	public static void main(String args[]) {
		cons o1 = new cons();// This line will create a default cons.
		
		cons1 o2 = new cons1("ABC");
		System.out.println(o2.name);
		
	}

}

class cons {
	String name;
	cons() {
		// This is a default constructor
		// Agar ham koi object bnate hai bina cont. define kre, to aisa hi background me java automatic hojata hai
		// Default constructor se ham initialise ni kr sakte kuch
	}
}

class cons1 {
	String name;
	cons1(String name){
		this.name = name;
	}
}
