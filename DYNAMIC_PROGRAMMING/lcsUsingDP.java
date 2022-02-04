package DYNAMIC_PROGRAMMING;

public class lcsUsingDP {

	public static int lcs(String s, String t, int i, int j, int[][] dp) {
		if(i==s.length() || j==t.length())
			return 0;
		if(s.charAt(i)==t.charAt(j)) {
			if(dp[i+1][j+1]==-1) {
				int res=lcs(s,t,i+1,j+1,dp);
				dp[i+1][j+1]=res;
				return 1+res;
			}
			else {
				return 1+dp[i+1][j+1];
			}
		}else {
			int n,m;
			if(dp[i][j+1]==-1) {
				n=lcs(s,t,i,j+1,dp);
				dp[i][j+1]=n;
			}else {
				n=dp[i][j+1];
			}
			if(dp[i+1][j]==-1) {
				m=lcs(s,t,i+1,j,dp);
				dp[i+1][j]=m;
			}else {
				m=dp[i+1][j];
			}
			return Math.max(n, m);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="adebc";
		String t="dcadb";
		int[][] dp=new int[s.length()+1][t.length()+1];
		for(int i=0;i<dp.length;i++) {
			for(int j=0;j<dp[0].length;j++) {
				dp[i][j]=-1;
			}
		}
		System.out.println(lcs(s,t,0,0,dp));

	}

}
