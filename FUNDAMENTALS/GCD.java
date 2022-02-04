package FUNDAMENTALS;

import java.util.Scanner;

public class GCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter two numbers");
		int a=scan.nextInt();
		int b=scan.nextInt();
		int smallest=0;
		int gcd=0;
		if(a==0) {
			gcd=b;
		}
		else if(b==0) {
			gcd=a;
			
		}
		else {
		    if(a<b) {
		    	smallest=a;
		    }else {
		    	smallest=b;
		    }
		
		
		for(int i=2; i<=smallest; i++) {
			if(a%i==0&&b%i==0) {
				gcd=i;
			}
		}
	}
		System.out.println(gcd);
	}

}
