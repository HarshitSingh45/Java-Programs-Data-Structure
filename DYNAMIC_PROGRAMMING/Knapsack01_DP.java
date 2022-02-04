package DYNAMIC_PROGRAMMING;

public class Knapsack01_DP {

	public static int Knapsack(int[] weights, int[] values, int maxWeight) {
		int[][] dp = new int[weights.length+1][maxWeight+1];
		
		for(int i=weights.length-1; i>=0; i--) {
			for(int j=0; j<=maxWeight; j++) {
				if(weights[i]>j) {
					dp[i][j]=dp[i+1][j];
				}else {
					int a = dp[i+1][j];
					int b = values[i] + dp[i+1][j-weights[i]];
					dp[i][j] = Math.max(a, b);
				}
			}
		}
		
//		for(int i=0; i<dp.length; i++) {
//			for(int j=0; j<dp[0].length; j++) {
//				System.out.print(dp[i][j]+" ");
//			}
//			System.out.println();
//		}
		return dp[0][maxWeight];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4;
		int[] weights= {1, 2, 4, 5};
		int[]values= {5, 4, 8, 6};
		int maxWeight=5;
		System.out.println(Knapsack(weights,values,maxWeight));

	}

}
