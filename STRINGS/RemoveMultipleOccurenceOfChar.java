package STRINGS;

public class RemoveMultipleOccurenceOfChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str ="aaabbccddaa";
		char ch='a';
		String result=removeAllOccurrencesOfChar(str,ch);
		System.out.println(result);
	}
	public static String removeAllOccurrencesOfChar(String str, char ch) {
		// Your code goes here
		String result="";
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)!=ch) {
				result+=str.charAt(i);
			}
		}
		return result;
	}

}
