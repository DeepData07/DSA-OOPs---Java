// Revere the given number: -
public class Q4 {
    public static void main(String args[]) {
    	int n= 12345;
    	int reverse = 0;
    	while (n>0) {
    		int LD=n%10;
    		reverse = (reverse*10)+LD;
    		n=n/10;
    	}
    	System.out.println("reverse of the number is " + reverse);
    }
}
