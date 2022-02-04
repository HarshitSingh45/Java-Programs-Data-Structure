package Patterns;
import java.util.Scanner;

public class TriangularStar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int n= scan.nextInt();
		int i=1;
		while(i<=n) {
			int j=1;
			while(j<=i) {
				System.out.print(j);
				j++;
			}
			System.out.println();
			i++;
		}
		
		int n1=scan.nextInt();
		int l=1;
		int p=1;
		while(l<=n1) {
			int m=1;
			while(m<=l) {
				System.out.print(p);
				p++;
				m++;
			}
			System.out.println();
			l++;
		}
		
		int n2=scan.nextInt();
		int a=1;
		while(a<=n2) {
			int b=1;
			int k=a;
			while(b<=a) {
				System.out.print(k);
				k--;
				b++;
			}
			System.out.println();
			a++;
		}
		
	}

}
