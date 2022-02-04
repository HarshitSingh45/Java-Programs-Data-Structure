package Patterns;

import java.util.Scanner;

public class AlphaStar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//		A
		//		BB
		//		C*C
		//		D**D
		//		E***E
		Scanner scan= new Scanner(System.in);
		int n=scan.nextInt();
		int i=1;
		while(i<=n) {
			int j=1;
			char ch=(char)('A'+i-1);
			while(j<=i) {
				if(j==1||j==i) {
					System.out.print(ch);
				}
				else {
					System.out.print("*");
				}
				j++;
			}
			System.out.println();
			i++;
		}

	}

}
