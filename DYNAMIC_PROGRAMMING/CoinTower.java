package DYNAMIC_PROGRAMMING;

import java.util.Scanner;

public class CoinTower {

	public static String coinTowerWinner(int n, int x, int y, int flag, String[] dp) {
		if(n==0) {
			if(flag==1) {
				return "Whis";
			}else 
				return "Beerus";
		}
		String s,z;
		if(flag==1) {
			s="Beerus";
			z="Whis";
			flag=0;
		}else {
			s="Whis";
			z="Beerus";
			flag=1;
		}
			


		String ans1="",ans2="",ans3="";
		if(n>=x) {
			if(dp[n-x]==null) {
				ans1=coinTowerWinner(n-x, x, y, flag,dp);
				//dp[n-x]=ans1;
			}
			else {
				ans1=dp[n-x];
			}
		}
		if(n>=y) {
			if(dp[n-y]==null) {
				ans2=coinTowerWinner(n-y, x, y, flag,dp);
				//dp[n-y]=ans2;
			}
			else {
				ans2=dp[n-y];
			}
		}
		if(dp[n-1]==null) {
			ans3=coinTowerWinner(n-1, x, y, flag,dp);
			//dp[n-1]=ans3;
		}
		else {
			ans3=dp[n-1];
		}
		
		if(ans1==z || ans2==z || ans3==z) {
			dp[n]=s;
			return s;
			}
		else {
			dp[n]=z;
			return z;
		}



	}
	public static String coinTowerWinner(int n, int x, int y, int flag) {
		if(n==0) {
			if(flag==1) {
				return "Whis";
			}else 
				return "Beerus";
		}
		if(flag==1) {
			flag=0;
		}else
			flag=1;


		String ans1,ans2,ans3;
		if(n>=x) {
			ans1=coinTowerWinner(n-x, x, y, flag);
			return ans1;
		}
		else if(n>=y) {
			ans2=coinTowerWinner(n-y, x, y, flag);
			return ans2;
		}else {
			ans3=coinTowerWinner(n-1, x, y, flag);
			return ans3;
		}

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		int x=s.nextInt();
		int y=s.nextInt();
		String[] dp=new String[n+1];
		
		System.out.println(coinTowerWinner(n,x,y,1));
		System.out.println(coinTowerWinner(n,x,y,1,dp));

	}

}
