package DYNAMIC_PROGRAMMING;

public class IterativeMinCost {

	public static int minCost(int[][] arr) {
		if(arr.length==0)
			return 0;
		
		int m=arr.length;
		int n=arr[0].length;
		// dp array
		int[][] dp=new int[m+1][n+1];
		for(int i=0;i<dp.length;i++) {
			for(int j=0;j<dp[0].length;j++) {
				dp[i][j]=Integer.MAX_VALUE;
			}
		}
		//Inital initialization
		dp[m-1][n-1]=arr[m-1][n-1];
		for(int i=m-1;i>=0;i--) {
			for(int j=n-2;j>=0;j--) {
				int a=dp[i+1][j];
				int b=dp[i][j+1];
				int c=dp[i+1][j+1];
				int ans = Math.min(a, Math.min(c, b));
				dp[i][j]=arr[i][j]+ans;
			}
		}
		return dp[0][0];
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = {
				{3, 4, 1, 2},
				{2, 1, 8, 9},
				{4, 7, 8, 1}};
		System.out.println(minCost(arr));

	}

}
