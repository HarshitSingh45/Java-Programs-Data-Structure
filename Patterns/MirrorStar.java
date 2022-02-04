package Patterns;
import java.util.Scanner;
public class MirrorStar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int n= scan.nextInt();
		int i=1;
		while(i<=n) {
			int j=1;
			while(j<=(n-i)) {
				System.out.print(" ");
				j++;
			}
			int k=1;
			while(k<=i) {
				System.out.print("*");
				k++;
			}
			System.out.println();
			i++;
		}

	}

}
