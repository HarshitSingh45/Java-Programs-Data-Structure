package RECURSION;

import java.util.Scanner;

public class Power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int x=s.nextInt();
		int n=s.nextInt();
		System.out.println(power(x,n));

	}
	public static int power(int x, int n) {
		if(n==0)
			return 1;
		int result=x*power(x,n-1);
		return result;
	}

}
