 //Print the reverse of the number
public class Q3 {
	public static void main(String args[]) {
		int n = 280119;
		while (n>0) {
			int last_digit = n%10;
			System.out.print(last_digit);// println likhte to har last digit next line me print hoti
			n = n/10;
		}
		
	}

}
