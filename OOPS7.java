//Interface
public class OOPS7 {
	public static void main(String args[]) {
		queen q1 = new queen();
		q1.move();
	}

}
 interface chessplayer{
	 void move();
 }
 
 class queen implements chessplayer{
	 public void move() {// imp all these function should be public
		 System.out.println("In all direction");
	 }
 }

 class rook implements chessplayer{
	 public void move() {
		 System.out.println("only staright");
	 }
 }