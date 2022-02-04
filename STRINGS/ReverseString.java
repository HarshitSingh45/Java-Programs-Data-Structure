package STRINGS;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		String str=s.nextLine();
		reverseString(str);

	}
	public static void reverseString(String str) {
		String str1="";
		for(int i=str.length()-1;i>=0;i--) {
			str1+=str.charAt(i);		
		}
		System.out.println(str1);
	}

}
