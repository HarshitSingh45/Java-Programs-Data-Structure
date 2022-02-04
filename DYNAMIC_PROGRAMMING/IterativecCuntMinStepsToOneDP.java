package DYNAMIC_PROGRAMMING;

import java.util.Scanner;

public class IterativecCuntMinStepsToOneDP {

	public static int countSteps(int n) {
		if(n==1) {
			return 0;
		}
		int[] dp=new int[n+1];
		dp[1]=0;
		for(int i=2; i<dp.length; i++) {
			int ans1,ans2=Integer.MAX_VALUE, ans3=Integer.MAX_VALUE, ans;
			ans1=dp[i-1];
			if(i%2==0) {
				ans2=dp[i/2];
			}
			if(i%3==0) {
				ans3=dp[i/3];
			}
			ans=Math.min(ans1, Math.min(ans2, ans3));
			dp[i]=ans+1;
			//System.out.println(dp[i]);
		}
		return dp[n];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		System.out.println(countSteps(n));

	}

}
