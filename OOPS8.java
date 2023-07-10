// multiple inheritance using interface
public class OOPS8 {
	public static void main(String args[]) {
		bear b1 = new bear();
		b1.eatsgrass();
	}

}

interface herbivore{
	void eatsgrass();
}

interface carnivore{
	void eatsflesh();
}

class bear implements herbivore, carnivore{
	public void eatsgrass() {
		System.out.println("is a herbivore");
	}
	
    public void eatsflesh() {
    	System.out.println("is a carnivore");
	}
}