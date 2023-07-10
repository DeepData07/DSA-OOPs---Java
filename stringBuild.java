// append function of stringbuilder
public class stringBuild {
	public static void main (String args[]) {
		StringBuilder sb = new StringBuilder("");
		for(char ch='a'; ch <='z';ch++) {
			sb.append(ch);
			//time complexity O(26)
			// agar string use krte to a fr a copy hoke ab, then ab copy hoke abc..... O(26*n^2)
		}
		System.out.println(sb);
	}

}
