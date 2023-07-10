
public class nQueens {
	public static boolean isSafe(char board[][],int row,int col) {
		//vertical up
		for(int i=row-1;i>=0;i--) {
			if(board[i][col]=='Q') {
				return false;
			}
		}
		
		//diagonal left up
		for(int i=row-1,j=col-1; i>=0 && j>=0; i--,j--) {
			if(board[i][j]=='Q') {
				return false;
			}
		}
		
		//diagonal right up
		for(int i=row-1,j=col+1;i>=0 && j<board.length; i--,j++) {
			if(board[i][j]=='Q') {
				return false;
			}
		}
		return true;
	}
    public static void queens(char board[][], int row) {
    	if(row==board.length) {
    		print(board);
    		count++;
    		return;
    	}
		for(int j=0;j<board.length;j++) {
			if(isSafe(board,row,j)) {
				board[row][j]='Q';//queen bitha di
				queens(board,row+1);
				board[row][j]='x';//ab back track krte hue ek column se queen hta di jisse e row me do queen na ho
			}
		}
	}
	
    public static void print(char board[][]) {
    	System.out.println("-----------boards are----------");
    	for(int i=0;i<board.length;i++) {
    		for(int j=0;j<board.length;j++) {
    			System.out.print(board[i][j]+ " ");
    		}
    		System.out.println();
    	}
    }
    static int count =0;
	public static void main(String args[]) {

		int n =4;
		char board[][]=new char[n][n];
		for (int i=0; i<n;i++) {
			for(int j=0;j<n;j++) {
				board[i][j]='x';
			}
		}
		queens(board,0);
		System.out.println(count);
		
	}
	

}
