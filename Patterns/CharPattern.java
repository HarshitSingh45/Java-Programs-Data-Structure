package Patterns;
import java.util.Scanner;
public class CharPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		//BLOCK CHARACTER PATTERN
		int n= scan.nextInt();
		int i=1;
		while(i<=n) {
			int j=1;
			while(j<=n) {
				char p=(char)('A'+j-1);
				System.out.print(p);
				j++;
			}
			System.out.println();
			i++;
		}
		
		//TRIANGULAR PATTERN OF CHARACTERS
		int n1= scan.nextInt();
		int a=1;
		while(a<=n1) {
			int j=1;
			while(j<=a) {
				char p=(char)('A'+j-1);
				System.out.print(p);
				j++;
			}
			System.out.println();
			a++;
		}

	}

}
