// abstraction - using abstract class
public class OOPS6 {
	public static void main(String args[]) {
		dog d1 = new dog();
		d1.walk();
		
		chicken c1 = new chicken();
		c1.walk();
	}

}
 abstract class animal {
	 void eat() {
		System.out.println("eats"); 
	 }
	 abstract void walk();
 }
 
 class dog extends animal{
	void walk() {
		System.out.println("walks o n 4 legs");
	}
 }

 class chicken extends animal{
	void walk() {
		System.out.println("walks o n 4 legs");
	}
 }