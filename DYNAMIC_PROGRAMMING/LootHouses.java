package DYNAMIC_PROGRAMMING;

public class LootHouses {

	public static int maxMoneyLooted(int[] house, int si, int[] dp) {
		if(si==house.length-1)
			return house[si];
		int num1=house[si];
		int num2;
		int max1=Integer.MIN_VALUE;
		int max2=Integer.MIN_VALUE;
		for(int i=si+2; i<house.length; i++) {
			int res;
			if(dp[i]==-1) {
				res=maxMoneyLooted(house, i, dp);
				dp[i]=res;
			}else {
				res=dp[i];
			}
			if(res>max1)
				max1=res;
		}
		max1 +=house[si];
		if(si+1<house.length)
			max2=maxMoneyLooted(house, si+1, dp);
		//int max2=Integer.MIN_VALUE;
//		if(si+1<house.length) {
//			num2=house[si+1];
//			for(int i=si+3; i<house.length; i++) {
//				int res;
//				if(dp[i]==-1) {
//					res=maxMoneyLooted(house, i, dp);
//					dp[i]=res;
//				}else
//					res=dp[i];
//
//				if(res>max2)
//					max2=res;
//			}
//			max2 +=house[si+1];
//		}
		int max=Math.max(max1, max2);
		return max;

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] house= {10, 2, 30, 20, 3, 50};
		int[]dp=new int[house.length];
		for(int i=0;i<dp.length;i++) {
			dp[i]=-1;
		}
		System.out.println(maxMoneyLooted(house,0, dp));

	}

}
