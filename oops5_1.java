
public class oops5_1 {
	public static void main(String args[]) {
		Animals o1 = new Animals();
		o1.eat();
	}

}
class Animals{
	void eat() {
		System.out.println("eats");
	}
}

class Dog extends Animals{
	void eat() {
		System.out.println("grass");
	}
}