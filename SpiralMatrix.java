// spiral matrix
public class SpiralMatrix {
	public static void main(String args[]) {
		int mat[][]= {{1,2,3,4},
				      {5,6,7,8},
				      {9,10,11,12},
				      {13,14,15,16}};
		SpiralPrint(mat);
	}
	public static void SpiralPrint(int mat[][]) {
		int startRow = 0;
		int startCol = 0;
		int endRow = mat.length-1;
		int endCol = mat[0].length-1;
		while(startRow<=endRow && startCol<=endCol) {
			// top - i.e row same, col ek ek badh ra hai
			for(int j = startCol;j<=endCol;j++) {
				System.out.print(mat[startRow][j]+" ");
			}
			//right
			for(int i=startRow+1;i<=endRow;i++) {
				System.out.print(mat[i][endCol]+" ");
			}
			//bottom
			for(int j = endCol-1;j>=startCol;j--) {//j greater than hai + j-- hai
				if(startRow==endRow) {
					break;
				}
				System.out.print(mat[endRow][j]+" ");
			}
			//left
			for(int i=endRow-1;i>=startRow+1;i--) {//i greater than hai + i-- hai
				if(startCol==endCol) {
					break;
				}
				System.out.print(mat[i][startCol]+" ");
			}
			startRow++;
			startCol++;
			endRow--;
			endCol--;
		}
		System.out.println();
	}

}
