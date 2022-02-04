package Patterns;
import java.util.Scanner;
public class OddSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//		1357
		//		3571
		//		5713
		//		7135
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int i=1;
		while(i<=n) {
			int j=1;
			int p=2*i-1;
			while(j<=n-i+1) {
				System.out.print(p);
				p+=2;
				j++;
			}
			int k=1;
			int t=1;
			while(k<=i-1) {
				System.out.print(t);
				t+=2;
				k++;
			}
			System.out.println();
			i++;
		}

	}

}
