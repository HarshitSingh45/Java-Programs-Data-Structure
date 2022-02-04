package RECURSION;

import java.util.Scanner;

public class fibonnaci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		//N-th Fibpnnaci number
		System.out.print(fib(n));

	}
	public static int fib(int n) {
		if(n==1||n==2) {
			return 1;
		}
		int fib1=fib(n-1);
		int fib2=fib(n-2);
		int result=fib1+fib2;
		return result;
	}

}
