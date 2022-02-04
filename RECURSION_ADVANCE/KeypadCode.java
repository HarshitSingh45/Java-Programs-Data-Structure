package RECURSION_ADVANCE;

import java.util.ArrayList;
import java.util.Scanner;

public class KeypadCode {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the keypad number");
		int n=s.nextInt();
		ArrayList<String> ret=new ArrayList<String>();
		ret=returnKeypadStrings(n);
		for(String i:ret)
			System.out.println(i);

	}
	public static ArrayList<String> returnKeypadStrings(int n){
		ArrayList<String> arr=new ArrayList<String>();
		if(n==0 || n==1) {
			arr.add("");
			return arr;
		}
		ArrayList<String> ret=new ArrayList<String>();
		ret=returnKeypadStrings(n/10);
		String s=StringAssociatedWithDigit(n%10);
		for(int i=0;i<s.length();i++) {
			for(int j=0;j<ret.size();j++) {
				String output=ret.get(j)+s.charAt(i);
				arr.add(output);
			}
		}
		return arr;
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
