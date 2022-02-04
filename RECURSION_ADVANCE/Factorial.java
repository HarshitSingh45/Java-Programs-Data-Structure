package RECURSION_ADVANCE;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=s.nextInt();
		factorial(n,1);

	}
	public static void factorial(int num, int ans) {
		if(num==0) {
			System.out.println(ans);
			return;
		}
		ans=ans*num;
		factorial(num-1, ans);
	}

}
