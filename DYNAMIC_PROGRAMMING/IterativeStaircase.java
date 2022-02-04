package DYNAMIC_PROGRAMMING;

import java.util.Scanner;

public class IterativeStaircase {
	
	public static long staircase(int n) {
		if(n==0)
			return 0;
		if(n==1)
			return 1;
		if(n==2)
			return 2;
		if(n==3)
			return 4;
		long[] dp=new long[n+1];
		dp[0]=0;
		dp[1]=1;
		dp[2]=2;
		dp[3]=4;
		for(int i=4; i<dp.length; i++) {
			dp[i]=dp[i-1] + dp[i-2] + dp[i-3];
		}
		return dp[n];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		System.out.println(staircase(n));

	}

}
