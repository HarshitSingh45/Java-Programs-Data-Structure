package DYNAMIC_PROGRAMMING;

import java.util.Scanner;

public class MinimumSquaresToRepresentN_Recursion {

	public static int minSquares(int n, int[] dp) {
		if(n==0)
			return 0;
		if(n==1)
			return 1;
		dp[0]=0;
		dp[1]=1;
		int min = Integer.MAX_VALUE;
		for(int i=1; i*i<=n; i++) {
			int res;
			if(dp[n-(i*i)]==-1) {
				res=minSquares(n-(i*i),dp);
				if(res<min)
					min=res;
			}else {
				res=dp[n-(i*i)];
				if(res<min)
					min=res;
			}
		}
		dp[n]=min+1;
		return dp[n];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		int[] dp=new int[n+1];
		for(int i=0; i<dp.length;i++) {
			dp[i]=-1;
		}
		System.out.println(minSquares(n,dp));

	}

}
