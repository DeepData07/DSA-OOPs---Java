// Advance patterns
import java.util.*;
public class Q17 {
	public static void hollow(int total_Row, int total_Col) {
		for(int i=1;i<=total_Row;i++) {// no of lines ke lie
			for(int j=1;j<=total_Col;j++) {//for coloumns
				//(i,j) matrix ke elements
				if(i==1||i==total_Row||j==1||j==total_Col) {//boundary condition
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}

			}
			System.out.println();//har second loop ke baad next line pe ajae jsse

		}
		
	}
	public static void main(String args[]) {
		hollow(5,4);
	}
	

}
