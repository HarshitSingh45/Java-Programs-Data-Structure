package STRINGS;

import java.util.Scanner;

public class input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		
		//TYPE INPUT HARSHIT 25
		String str=s.next();
		int n=s.nextInt();
		System.out.println(str+" "+str.length()+" "+n);
		
		
		//TYPE INPUT HARSHIT 95 97 98
		String name=s.next();
		int m1=s.nextInt();
		int m2=s.nextInt();
		int m3=s.nextInt();
		System.out.println(name+" "+m1+" "+m2+" "+m3);
		
		//TYPE INPUT HARSHIT 95 97 98 ENTER 91 92
		String name1=s.next();
		int m0=s.nextInt();
		s.nextLine();
		int m00=s.nextInt();
		int m000=s.nextInt();
		int m4=s.nextInt();
		System.out.println(name1+" "+m0+" "+m00+" "+m000);
		
	}

}
