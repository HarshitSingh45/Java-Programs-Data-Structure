package Patterns;
import java.util.Scanner;
public class InterestingPattern {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		E
//		DE
//		CDE
//		BCDE
//		ABCDE
		Scanner scan=new Scanner(System.in);
		int n= scan.nextInt();
		int i=1;
		int p=n;
		while(i<=n) {
		
			char ch=(char)('A'+p-1);
			int j=1;
			while(j<=i) {
				System.out.print(ch);
				ch=(char)(ch+1);
				j++;
			}
			System.out.println();
			p--;
			i++;
		}
		
//		Scanner scan= new Scanner(System.in);
//		int n=scan.nextInt();
//		int i=n;
//		while(i>=1) {
//			int j=1;
//			char ch=(char)('A'+i-1);
//			while(j<=n-i+1) {
//				System.out.print(ch);
//				ch=(char)(ch+1);
//				j++;
//			}
//			System.out.println();
//			i--;
//		}

	}

}
