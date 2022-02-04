package Patterns;
import java.util.Scanner;
public class SumPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int i=1;
		
		while(i<=n) {
			int sum=0;
			int j=1;
			while(j<=i) {
				if(j==1) {
					System.out.print("1");
					sum+=j;
				}
				else {
					System.out.print("+");
					System.out.print(j);
					sum+=j;
				}
				j++;
			}
			System.out.print("=");
			System.out.print(sum);
			System.out.println();
			i++;
		}

	}

}
