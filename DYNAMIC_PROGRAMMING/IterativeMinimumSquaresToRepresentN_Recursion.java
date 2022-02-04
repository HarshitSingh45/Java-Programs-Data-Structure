package DYNAMIC_PROGRAMMING;

import java.util.Scanner;

public class IterativeMinimumSquaresToRepresentN_Recursion {

	public static int minSquares(int n) {
		if(n==0)
			return 0;
		if(n==1)
			return 1;
		
		int[]dp=new int[n+1];
		dp[0]=0;
		dp[1]=1;
		for(int j=2;j<dp.length;j++) {
			int min=Integer.MAX_VALUE;
			for(int i=1;i*i<=j; i++ ) {
				int res = dp[j-(i*i)];
				if(res<min)
					min=res;
			}
			dp[j]=min+1;
		}
		return dp[n];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		System.out.println(minSquares(n));

	}

}
