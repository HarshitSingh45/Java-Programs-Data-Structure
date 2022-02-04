package STRINGS;

public class ReverseWordAndSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Harshit Singh";
		String str1=compress(str);
		System.out.println(str1);
	}
	public static String compress(String str) {
		String word="";
		String pass="";
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)!=' ') {
				word=str.charAt(i)+word;
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
