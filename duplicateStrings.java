
public class duplicateStrings {
	public static void main(String args[]) {
		String str = "appnnacollege";
		removeDup(str, 0, new StringBuilder(""), new boolean [26]);
	}
	public static void removeDup( String str, int index, StringBuilder newStr, boolean map[]) {
		// base
		if(index==str.length()) {
			System.out.println("The final string is"+ " "+newStr);
			return ;
		}
		//kaam
		char current = str.charAt(index);
		if(map[current-'a']==true) {
			removeDup(str, index+1, newStr, map);
		}
		else {
			map[current-'a']=true;
			removeDup(str, index+1, newStr.append(current), map );
		}
	}

}
