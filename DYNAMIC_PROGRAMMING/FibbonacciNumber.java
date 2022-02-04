package DYNAMIC_PROGRAMMING;

import java.util.Scanner;

public class FibbonacciNumber {
	
	// Time complexity is O(n) if solved through dynamic programming
	
	public static int fibb(int n, int[]dp) {
		// BASE CASE
		if(n==0 || n==1) {
			return n;
		}
		int ans1, ans2;
		// check the value of n-1 in array
		if(dp[n-1]==-1) {
			ans1=fibb(n-1, dp);
			dp[n-1]=ans1;
		}else {
			ans1=dp[n-1];
		}
		// check the value of n-2 in array
		if(dp[n-2]==-1) {
			ans2=fibb(n-2, dp);
			dp[n-2]=ans2;
		}else {
			ans2=dp[n-2];
		}
		// return the n th fibb number
		int ans=ans1+ans2;
		return ans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		// create an array to store the ans of every subproblem
		int[] dp=new int[n+1];
		for(int i=0;i<dp.length;i++) {
			//Assign each index pos with -1
			// if at any index value is -1 -- means its value is not yet calculated, we need to calculate
			dp[i]=-1;
		}
		System.out.println(fibb(n,dp));

	}

}
