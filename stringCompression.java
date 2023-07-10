
public class stringCompression {
	public static void main(String args[]) {
		String str = "aaabbbbgggffdddd";
		System.out.println(comp(str));
	}
	public static String comp(String str) {
		StringBuilder NewStr = new StringBuilder("");
		for(int i=0;i<str.length();i++) {
			Integer count =1;
			while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)) {
				count++;
				i++;
			}
			NewStr.append(str.charAt(i));
			if(count>1) {
				NewStr.append(count.toString());
			}
		}
		return NewStr.toString();
	}

}
