package RECURSION;

import java.util.Scanner;

public class Print__ONEtoN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		print(n);
		System.out.println();
		print1(n);

	}
	public static void print(int n) {
		if(n==0) {
			return;
		}
		print(n-1);
		System.out.print(n+" ");
	}
	public static void print1(int n) {
		if(n==0)
			return;
		System.out.print(n+" ");
		print1(n-1);
	}

}
