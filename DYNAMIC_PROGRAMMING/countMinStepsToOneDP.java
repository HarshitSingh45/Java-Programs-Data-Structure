package DYNAMIC_PROGRAMMING;

import java.util.Scanner;

public class countMinStepsToOneDP {

	public static int countSteps(int n, int[]dp) {
		if(n==1) {
			dp[1]=0;
			return 0;
		}
		int ans1,ans2=Integer.MAX_VALUE,ans3=Integer.MAX_VALUE,ans;
		if(dp[n-1]==-1) {
			ans1=countSteps(n-1, dp);
			dp[n-1]=ans1;
		}else {
			ans1=dp[n-1];
		}
		if(n%2==0) {
			if(dp[n/2]==-1) {
				ans2=countSteps(n/2, dp);
				dp[n/2]=ans2;
			}else {
				ans2=dp[n/2];
			}
		}
		if(n%3==0) {
			if(dp[n/3]==-1) {
				ans3=countSteps(n/3, dp);
				dp[n/3]=ans3;
			}else {
				ans3=dp[n/3];
			}
		}
		ans=Math.min(ans1, Math.min(ans2, ans3));
		dp[n]=ans;
		return ans+1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int[] dp=new int[n+1];
		for(int i=0; i<dp.length; i++) {
			dp[i]=-1;
		}
		System.out.println(countSteps(n,dp));

	}

}
