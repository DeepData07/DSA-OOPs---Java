// class and objects
// Access modifier
//get set and this
public class OOPs1 {
	public static void main(String args[]) {
		Pen p1 = new Pen(); // constructor
		p1.change("Blue");
		System.out.println(p1.colour);
		// or
		p1.colour = "Yellow";
		System.out.println(p1.colour);
		Bank Acc1 = new Bank();
		Acc1.setPassword("Hii");
	}

}

class Pen{
	String colour;
	int tip;
	void change(String newColour) {
		colour = newColour;
	}
	
}

class Bank{
	public String name;
	private String password;
	String getName() { //getter
		return this.name;
	}
	void setPassword(String newPassword) { //setter
		this.password = newPassword;
	}
}