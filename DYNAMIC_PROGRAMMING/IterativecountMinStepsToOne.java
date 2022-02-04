package DYNAMIC_PROGRAMMING;

import java.util.Scanner;

public class IterativecountMinStepsToOne {

	public static int countMinSteps(int n) {
		if(n==1)
			return 0 ;
		if(n==2)
			return 1;
		if(n==3)
			return 1;
		int[] dp =new int[n+1];
		dp[1]=0;
		dp[2]=1;
		dp[3]=1;
		for(int i=4;i<dp.length;i++) {
			if(dp[i]%3==0) {
				dp[i]=dp[i/3]+1;
				continue;
			}
			if(dp[i]%2==0) {
				dp[i]=dp[i/2]+1;
				continue;
			}
			else {
				dp[i]=dp[i-1]+1;
			}
		}
		return dp[n]+1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		System.out.println(countMinSteps(n));

	}

}
