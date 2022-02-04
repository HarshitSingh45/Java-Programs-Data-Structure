package RECURSION_ADVANCE;

import java.util.ArrayList;

public class SubsequencesOfString1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="abc";
		subsequence(str,"");

	}
	public static void subsequence(String str,String output) {
		if(str.length()==0) {
			System.out.println(output);
			return;
		}
		subsequence(str.substring(1), output);
		subsequence(str.substring(1), output+str.charAt(0));
	}

}
