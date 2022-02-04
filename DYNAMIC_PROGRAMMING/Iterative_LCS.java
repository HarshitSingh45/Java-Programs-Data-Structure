package DYNAMIC_PROGRAMMING;

public class Iterative_LCS {

	public static int lcs(String s, String t) {
		int[][] dp=new int[s.length()+1][t.length()+1];
		for(int i=s.length()-1;i>=0;i--) {
			for(int j=t.length()-1;j>=0;j--) {
				if(s.charAt(i)==t.charAt(j)) {
					dp[i][j] = 1+ dp[i+1][j+1];
				}else {
					dp[i][j] = Math.max(dp[i+1][j], dp[i][j+1]);
				}
			}
		}
		return dp[0][0];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="adebc";
		String t="dcadb";
		System.out.println(lcs(s,t));

	}

}
