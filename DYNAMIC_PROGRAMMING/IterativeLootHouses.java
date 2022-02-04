package DYNAMIC_PROGRAMMING;

public class IterativeLootHouses {

	public static int maxMoneyLooted(int[] house) {
		if(house.length==1)
			return house[0];
		if(house.length==2)
			return Math.max(house[0], house[1]);
		int[]dp=new int[house.length];
		for(int i=0;i<dp.length;i++) {
			dp[i]=-1;
		}
		dp[0]=house[0];
		dp[1]=Math.max(house[0], house[1]);
		
		for(int i=2; i<dp.length; i++) {
			dp[i]=Math.max(dp[i-2] + house[i], dp[i-1]);
		}
		return dp[dp.length-1];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] house= {10, 2, 30, 20, 3, 50};
		System.out.println(maxMoneyLooted(house));

	}

}
