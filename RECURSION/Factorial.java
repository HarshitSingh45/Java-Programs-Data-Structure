package RECURSION;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		System.out.println(fact(n));

	}
	public static int fact(int n) {
		if(n==0) {
			return 1;
		}
		int factorial = n*fact(n-1);
		return factorial;
	}

}
