package STRINGS;

import java.util.Scanner;

public class PalindromeCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		boolean p=palindrome(str);
		System.out.println(p);

	}
	public static boolean palindrome(String str) {
		String rev="";
		// BOTH FOR LOOPS ARE RIGHT;
//		for(int i=str.length()-1;i>=0;i--) {
//			rev+=str.charAt(i);
//		}
		
		
//		for(int i=0;i<str.length();i++) {
//			rev=str.charAt(i)+rev;
//		}
		
		int s=0;
		int l=str.length()-1;
		while(s<=l) {
			if(str.charAt(s)!=str.charAt(l)) {
				return false;
			}
			s++;
			l--;
		}
		return true;
//		if(str.equals(rev)) {
//			return true;
//		}
//		return false;
	}

}
