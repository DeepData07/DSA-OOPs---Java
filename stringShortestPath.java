import java.util.*;
public class stringShortestPath {
	public static void main(String args[]) {
		String str = "WNEENESENNN";
		System.out.println(findPath(str));
	}
	public static float findPath(String str) {
		int x=0;
		int y=0;
		for(int i=0;i<str.length(); i++) {
			char dir = str.charAt(i);
			if (dir == 'E') {
				x++;
			}
			else if (dir == 'W') {
				x--;
			}
			else if (dir == 'N') {
				y++;
			}
			else {
				y--;
			}
		}
		int x2=x*x;// x2-x1 ka whole square hota hai pr x1 to zero hai islye direct x2 ka square leliya
		int y2=y*y;
		return (float)Math.sqrt(x2+y2);
	}

}
