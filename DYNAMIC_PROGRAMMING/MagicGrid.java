package DYNAMIC_PROGRAMMING;

public class MagicGrid {

	public static int get(int[][] arr, int[][]dp, int x, int y) {
		if(x==arr.length-1 && y==arr[0].length-1) {
			return 1;
		}
		if(x>=arr.length || y>=arr[0].length) {
			return Integer.MAX_VALUE;
		}
		int ans1,ans2,ans;

		if(dp[x+1][y]==-1) { 
			int a = get(arr, dp, x+1, y);
			dp[x+1][y]=a;
			if(x+1<arr.length) {
				ans1=a-arr[x+1][y];
			}else {
				ans1=a;
			}
		}else {
			ans1=dp[x+1][y]-arr[x+1][y];
		}

		if(dp[x][y+1]==-1) {
			int a = get(arr, dp, x, y+1);
			dp[x][y+1]=a;
			if(y+1<arr[0].length) {
				ans2=a-arr[x][y+1];
			}else {
				ans2=a;
			}
		}else {
			ans2=dp[x][y+1]-arr[x][y+1];
		}
		if(ans1<=0)
			ans1=Integer.MAX_VALUE;
		if(ans2<=0)
			ans2=Integer.MAX_VALUE;
		return Math.min(ans1, ans2);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr= {{0, -2, -3, 1},{-1, 4, 0, -2},{1, -2, -3, 0}};
		int[][] dp=new int[arr.length+1][arr[0].length+1];
		for(int i=0;i<dp.length;i++) {
			for(int j=0;j<dp[0].length;j++) {
				dp[i][j]=-1;
			}
		}
		System.out.println(get(arr,dp,0,0));

	}

}
