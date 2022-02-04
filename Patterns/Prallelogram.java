package Patterns;
import java.util.Scanner;
public class Prallelogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int n= scan.nextInt();
		int i=1;
		while(i<=n) {
			int sp=1;
			while(sp<=i-1) {
				System.out.print(" ");
				sp++;
			}
			int st=1;
			while(st<=n) {
				System.out.print("*");
				st++;
			}
			System.out.println();
			i++;
		}

	}

}
