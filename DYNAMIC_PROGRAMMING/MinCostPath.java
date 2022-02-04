package DYNAMIC_PROGRAMMING;

public class MinCostPath {

	public static int minCost(int[][] arr,int i, int j, int[][]dp) {
		if(i==arr.length-1 && j==arr[0].length-1) {
			dp[i][j]=arr[i][j];
			return arr[i][j];
		}
		if(i>=arr.length || j>=arr[0].length) {
			return Integer.MAX_VALUE;
		}
		//int ans1=Integer.MAX_VALUE,ans2=Integer.MAX_VALUE,ans3=Integer.MAX_VALUE,ans;
		int ans1,ans2,ans3,ans;
		//if(i+1<arr.length) {
			if(dp[i+1][j]==Integer.MIN_VALUE) {
				ans1=minCost(arr, i+1, j,dp);// + arr[i][j];
				dp[i+1][j]=ans1;
			}else {
				ans1=dp[i+1][j];
			}
		//}
		//if(j+1<arr[0].length) {
			if(dp[i][j+1]==Integer.MIN_VALUE) {
				ans2=minCost(arr, i, j+1,dp);// + arr[i][j];
				dp[i][j+1]=ans2;
			}else {
				ans2=dp[i][j+1];
			}
		//}
		//if(i+1<arr.length && j+1<arr[0].length) {
			if(dp[i+1][j+1]==Integer.MIN_VALUE) {
				ans3=minCost(arr, i+1, j+1,dp);// + arr[i][j];
				dp[i+1][j+1]=ans3;
			}else {
				ans3=dp[i+1][j+1];
			}
		//}

		ans=Math.min(ans1, Math.min(ans2, ans3));
		return ans+arr[i][j];


	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = {
				{3, 4, 1, 2},
				{2, 1, 8, 9},
				{4, 7, 8, 1}};
		int[][] dp = new int[arr.length+1][arr[0].length+1];
		for(int i=0;i<dp.length;i++) {
			for(int j=0;j<dp[0].length;j++) {
				dp[i][j]=Integer.MIN_VALUE;
			}
		}
		System.out.println(minCost(arr,0,0,dp));

	}

}
