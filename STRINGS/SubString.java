package STRINGS;

public class SubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Harshit Singh";
		sub(str);

	}
	public static void sub(String str) {
    	for(int st=0;st<str.length();st++) {
			String rev="";
			for(int i=st;i<str.length();i++) {
				rev+=str.charAt(i);
				System.out.print(rev+"  ");
			}
			System.out.println();
		}
	}

}
