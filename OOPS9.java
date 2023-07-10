// static key word
// static can be made any - method, variable, class
public class OOPS9 {
	public static void main(String args[]) {
		student s1 = new student();
		s1.name = "SDPS";
		
		student s2 = new student();
		System.out.println(s2.name);
	}

}
 class student{
	 int roll;
	 static String name;
	 static String schoolName;
	 
	 void setschoolName(String name) {
		 this.name = name;
	 }
	 
	 String getschoolName() {
		 return this.name;
	 }
 }