package STRINGS;

public class RemoveConsecutiveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Input String: "aaaa"
//		Expected Output: "a"
//
//	    Input String: "aabbbcc"
//		Expected Output: "abc"
		
		String str= "aaabbbccddd";
		String str1=dupli(str);
		System.out.println(str1);

	}
	public static String dupli(String str) {
		String pass="";
		char ch='\0';
		for(int i=0;i<str.length();i++) {
			if(ch!=str.charAt(i)) {
				ch=str.charAt(i);
				pass+=ch;
			}
		}
		return pass;
	}
	
//	public static String dupli(String str) {
//		String rev="";
//		char ch=str.charAt(0);
//		rev+=ch;
//		int i=0;
//		int j=1;
//		while(i<str.length()&&j<str.length()) {
//			if(str.charAt(i)==str.charAt(j)) {
//				j++;
//			}
//			else {
//				i=j;
//				rev+=str.charAt(i);
//				j++;
//			}
//		}
//		return rev;
//	}

}
