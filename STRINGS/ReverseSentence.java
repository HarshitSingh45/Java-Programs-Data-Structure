package STRINGS;

public class ReverseSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Welcome to coding ninjas";
		String str1=reverse(str);
		System.out.println(str1);
	}
	public static String reverse(String str) {
		String word="";
		String pass="";
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)!=' ') {
				word+=str.charAt(i);
				if(i==str.length()-1) {
					pass=word+pass;
				}
			}else {
				pass=" "+word+pass;
				word="";
			}
		}
		
		return pass;
	}

}
