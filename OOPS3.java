// Types of cons.
// Cons overloading
public class OOPS3 {
	public static void main(String args[]) {
		dCons o1 = new dCons();
		
		dCons o2 = new dCons("CR7");
		System.out.println(o2.name);
		
		dCons o3 = new dCons(03);
		System.out.println(o3.roll);
	}

}
 class dCons{
	 String name;
	 int roll;
	 
	 dCons(){
		 System.out.println("non parametrized cons");
	 }
	 
	 dCons(String name){
		 this.name = name;
	 }
	 
	 dCons(int roll){
		 this.roll = roll;
	 }
 }
