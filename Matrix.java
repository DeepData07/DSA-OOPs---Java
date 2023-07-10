// 2d matrix
import java.util.*;
public class Matrix {
	public static void main(String args[]) {
		int mat[][]=new int [3][3];
		int row = mat.length;
		int col = mat[0].length;
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				mat[i][j]=sc.nextInt();
			}
		}
		for (int i = 0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.print(mat[i][j]+"  ");
			}
			System.out.println();
		}
	}

}
