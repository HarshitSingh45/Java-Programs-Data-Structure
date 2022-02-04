package RECURSION_ADVANCE;

public class PrintPermutationOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="abcd";
		printPermutatedString(str,"");

	}
	public static void printPermutatedString(String str, String output) {
		if(str.length()==0) {
			System.out.println(output);
			return;
		}
		for(int j=0;j<str.length();j++) {
			if(j==0) {
				String fin=str.substring(1);
				printPermutatedString(fin, output+str.charAt(j));
				continue;
			}
			if(j==str.length()-1) {
				String p=str.substring(0, j);
				printPermutatedString(p, output+str.charAt(j));
				break;
			}
			String p1=str.substring(0, j);
			String p2=str.substring(j+1);
			String fin=p1+p2;
			printPermutatedString(fin, output+str.charAt(j));
		}
			

	}

}
