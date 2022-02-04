package DYNAMIC_PROGRAMMING;

import java.util.Scanner;

public class ByteLandian {

	public static long maxConversion(long n) {
		if(n==0)
			return 0;
		if(n==1)
			return 1;
		int length=(int) (n+1);
		long[] dp=new long[length];
		dp[0]=0;
		dp[1]=1;
		for(int i=2; i<dp.length; i++) {
			long one,two,three,conv,ans;
			one=(long) Math.floor(i/2);
			two=(long) Math.floor(i/3);
			three=(long) Math.floor(i/4);
			ans=dp[(int) one] + dp[(int) two] + dp[(int) three];
			if(ans>i) {
				dp[i]=ans;
			}else {
				dp[i]=i;
			}	
		}
		return dp[(int) n];
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		long n=s.nextInt();
		System.out.println(maxConversion(n));

	}

}
