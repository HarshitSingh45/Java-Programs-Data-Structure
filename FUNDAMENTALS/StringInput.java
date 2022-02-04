package FUNDAMENTALS;

import java.util.Scanner;

public class StringInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan=new Scanner(System.in);
        String str=scan.nextLine();
        
        char ch=str.charAt(0);
        System.out.println(str);
       
        System.out.println(ch);
	}

}
