package FUNDAMENTALS;
import  java.util.Scanner;
import java.lang.Math;
public class BonaryToDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		int n=scan.nextInt();
		int sum=0;
		int i=0;
		while(n>0) {
			int rem=n%10;
			if(rem==1) {
				sum+=Math.pow(2, i);
			}
			n=n/10;
			i++;
		}
		System.out.println(sum);

	}

}
