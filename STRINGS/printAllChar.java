package STRINGS;

public class printAllChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="HarshitSingh";
		printChar(str);

	}
	public static void printChar(String str) {
		for(int i=0;i<str.length();i++) {
			System.out.println(str.charAt(i));
		}
	}

}
