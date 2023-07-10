// calculate binaomial coefficient-functions
import java.util.*;
public class Q11 {
	public static int fact(int n) {
		int f =1;
		for (int i=1;i<=n;i++) {
			f=f*i;
		}
		return f;
	}
	public static int bcf(int n, int r) {
		int fact_n = fact(n);
		int fact_r = fact(r);
		int fact_nr = fact(n-r);
		int result = fact_n/(fact_r*fact_nr);
		return result;
	}
	public static void main(String args[]) {
		System.out.println("factorial is:- ");
		System.out.println(fact(4));
		System.out.println("binomial coefficient is:- ");
		System.out.println(bcf(5,2));
	}
	

}
