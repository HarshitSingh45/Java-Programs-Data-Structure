package Patterns;
import java.util.Scanner;
public class Diamond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int i=1;
		int n1=n/2+1;
		int n2=n1-1;
		while(i<=n1) {
			int sp=1;
			while(sp<=n1-i) {
				System.out.print(" ");
				sp++;
			}
			int st=1;
			while(st<=2*i-1) {
				System.out.print("*");
				st++;
			}
			System.out.println();
			i++;
		}
		int j=n2;
		while(j>=1) {
			int sp=1;
			while(sp<=n2-j+1) {
				System.out.print(" ");
				sp++;
			}
			int st=1;
			while(st<=2*j-1) {
				System.out.print("*");
				st++;
			}
			System.out.println();
			j--;
		}

	}

}
