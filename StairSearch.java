// search in sorted 
public class StairSearch {
	public static void main(String args[]) {
		int mat[][]= {{10,20,30,40},
			      {15,27,33,41},
			      {16,28,34,43},
			      {17,29,37,47}};
		int key = 29;
		search(mat,key);
	}
	public static boolean search(int mat[][], int key) {
		int row = 0;
		int col = mat[0].length-1;
		while(row<mat.length && col>=0) {
			if(mat[row][col]==key) {
				System.out.println("Key is at "+ row + ","+ col);
				return true;
			}
			else if(key>mat[row][col]) {
				row++;
			}
			else {
				col--;
			}
			
		}
		System.out.println("no such key");
		return false;
	}

}
