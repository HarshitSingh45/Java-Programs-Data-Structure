package STRINGS;

public class ReverseWoedWise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Harshit Singh";
		String str2=reverse(str);
		System.out.println(str2);

	}
	public static String reverse(String str) {
		String word="";
		String pass="";
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)!=' ') {
				word=str.charAt(i)+word;
				if(i==str.length()-1) {
					pass+=word;
				}
			}else {
				pass+=word+" ";
				word="";
			}
		}
		
		return pass;
	}
}
