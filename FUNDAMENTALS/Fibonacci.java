package FUNDAMENTALS;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0;
		int b=1;
		int c=0;
		int n=100;
		System.out.print(a+ " "+b);
		while(b<n) {
			c=a+b;
			if(c>100) {
				break;
			}
			System.out.print(" " +c+ " ");
			a=b;
			b=c;
		}
	}
}
