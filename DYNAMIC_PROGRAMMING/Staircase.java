package DYNAMIC_PROGRAMMING;

import java.util.Scanner;

public class Staircase {

	public static long staircase(int n, long[]dp) {
		if(n==0)
			return 0;
		if(n==1)
			return 1;
		if(n==2)
			return 2;
		if(n==3)
			return 4;
		long one,two,three,ans;
		// if taken only one step
		if(dp[n-1]==-1) {
			one=staircase(n-1, dp);
			dp[n-1]=one;
		}else {
			one=dp[n-1];
		}
		// if two steps are taken
		if(dp[n-2]==-1) {
			two=staircase(n-2, dp);
			dp[n-2]=two;
		}else {
			two=dp[n-2];
		}
		// if three steps are taken
		if(dp[n-3]==-1) {
			three=staircase(n-3, dp);
			dp[n-3]=three;
		}else {
			three=dp[n-3];
		}
		ans=one+two+three;
		return ans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		long[] dp=new long[n+1];
		for(int i=0;i<dp.length;i++) {
			dp[i]=-1;
		}
		System.out.println(staircase(n,dp));

	}

}
