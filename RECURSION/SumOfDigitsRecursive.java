package RECURSION;

import java.util.Scanner;

public class SumOfDigitsRecursive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		System.out.println(sumOf(n));

	}
	public static int sumOf(int n) {
		if(n==0)
			return 0;
		return n%10+sumOf(n/10);
	}

}
