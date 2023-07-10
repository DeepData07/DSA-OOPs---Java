
public class subsetBack {
    public static void main(String args[]) {
        String str = "abc";
        back(str,"",0);
    }
    public static void back(String str, String ans, int i) {
    	//base
    	if(i==str.length()) {
    		System.out.println(ans);
    		return;
    	}
    	//recursion
    	
    	//yes
    	back(str,ans+str.charAt(i),i+1);
    	//no
        back(str,ans,i+1);
    }
}
