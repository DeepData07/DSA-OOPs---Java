// Copy constructor
public class OOPS4 {
	public static void main(String args[]) {
		Student s1 = new Student();
		s1.name = "Adi";
		s1.roll = 67;
		s1.pass = "abs";
		Student  s2 = new Student(s1);// here we initialise copy cons.
		s2.pass = "SSS";
	}

}

class Student{
	String name;
	int roll;
	String pass;
	
	Student (){
		
	}
	
	Student (Student s1){// copy constructor
		this.name = s1.name;
		this.roll = s1.roll;
	}
}
