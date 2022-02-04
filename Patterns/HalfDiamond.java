package Patterns;
import java.util.Scanner;
public class HalfDiamond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//		FOR N=3
		//		*
		//		*1*
		//		*121*
		//		*12321*
		//		*121*
		//		*1*
		//		*
		//		
		//		FOR N=5
		//		*
		//		*1*
		//		*121*
		//		*12321*
		//		*1234321*
		//		*123454321*
		//		*1234321*
		//		*12321*
		//		*121*
		//		*1*
		//		*
//		Scanner scan=new Scanner(System.in);
//		int n=scan.nextInt();
//		int i=1;
//		int temp=0;
//		while(i<=n+1) {
//			if(i==1) {
//				System.out.print("*");
//			}
//			else {
//				System.out.print("*");
//				int j=1;
//				while(j<=i-1) {
//					System.out.print(j);
//					j++;
//					
//				}
//				int k=i-2;
//				while(k>=1) {
//					System.out.print(k);
//					k--;
//				}
//				System.out.print("*");
//			}
//			System.out.println();
//			i++;
//		}
//		int j=1;
//		if(n==0) {
//			System.out.println("*");
//		}
//		while(j<=n) {
//			if(j==n) {
//				System.out.print("*");
//			}
//			else {
//				System.out.print("*");
//				int k=1;
//				while(k<=n-j) {
//					System.out.print(k);
//					k++;
//				}
//				int m=n-j-1;
//				while(m>=1) {
//					System.out.print(m);
//					m--;
//				}
//				
//				
//				System.out.print("*");
//			}
//			System.out.println();
//			j++;
//		}
		
		
		//BETTER APPROACH
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int i=1;
		System.out.println("*");
		while(i<=n) {
			System.out.print("*");
			int j=1;
			while(j<=i) {
				System.out.print(j);
				j++;
			}
			int n1=1;
			int p=i-1;
			while(n1<=i-1) {
				System.out.print(p);
				p--;
				n1++;
			}
			System.out.print("*");
			System.out.println();
			i++;
		}
		int d=1;
		while(d<=n-1) {
			int j=1;
			System.out.print("*");
			while(j<=n-1-d+1) {
				System.out.print(j);
				j++;
			}
			int n1=1;
			int p=n-1-d;
			while(n1<=n-1-d) {
				System.out.print(p);
				p--;
				n1++;
			}
			System.out.print("*");
			System.out.println();
			d++;
		}
		System.out.println("*");

	}

}
