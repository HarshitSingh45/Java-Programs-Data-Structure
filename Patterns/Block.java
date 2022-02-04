package Patterns;

import java.util.Scanner;

public class Block {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int n= scan.nextInt();
		int i=1;
		while(i<=n) {
			int j=1;
			while(j<=n) {
				System.out.print(i);
				j++;
			}
			System.out.println();
			i++;
		}
		
		int n1=scan.nextInt();
		int l=1;
		while(l<=n1) {
			int m=1;
			while(m<=n1) {
				System.out.print(m);
				m++;
			}
			System.out.println();
			l++;
		}
		
		int n2=scan.nextInt();
		int a=1;
		while(a<=n2) {
			int b=n2;
			while(b>=1) {
				System.out.print(b);
				b--;
			}
			System.out.println();
			a++;
		}

	}

}
