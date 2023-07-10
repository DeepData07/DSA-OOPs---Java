// inheritance
public class OOPS5 {
	public static void main(String args[]) {
		fish shark = new fish();
		shark.eats();
	}

}

class Animal{
	int eyes;
	void eats() {
		System.out.println("Eats");
	}
	void breathes() {
		System.out.println("breathes");
	}
}

class fish extends Animal{
	int fings;
}
