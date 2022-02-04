package RECURSION_ADVANCE;

import java.util.Scanner;

public class KeypadCode1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=s.nextInt();
		keypad(n,"");

	}
	public static void keypad(int num, String output) {
		if(num==0) {
			System.out.println(output);
			return;
		}
		int n=num%10;
		String s= StringAssociatedWithDigit(n);
		for(int i=0;i<s.length();i++) {
			keypad(num/10,s.charAt(i) + output);
		}
	}
	
	public static String StringAssociatedWithDigit(int n) {
		if(n==2)
			return "abc";
		if(n==3)
			return "def";
		if(n==4)
			return "ghi";
		if(n==5)
			return "jkl";
		if(n==6)
			return "mno";
		if(n==7)
			return "pqrs";
		if(n==8)
			return "tuv";
		if(n==9)
			return "wxyz";
		else
			return "";
			
	}

}
