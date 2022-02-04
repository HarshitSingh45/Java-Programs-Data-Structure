package DYNAMIC_PROGRAMMING;

public class Knapsack01 {

	public static int knapsack(int[] weights, int[] values, int n, int maxWeight, int i, int sum, int sumValues) {
		if(i==weights.length)
			return sumValues;
		if(sum + weights[i]>maxWeight){
            int ans=knapsack(weights, values, n, maxWeight, i+1, sum, sumValues);
			return Math.max(sumValues,ans);
        }
		else {
			int ans1=knapsack(weights, values, n, maxWeight, i+1, sum + weights[i], sumValues + values[i]);
			int ans2=knapsack(weights, values, n, maxWeight, i+1, sum, sumValues);
			return Math.max(ans1, ans2);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4;
		int[] weights= {1, 2, 4, 5};
		int[]values= {5, 4, 8, 6};
		int maxWeight=5;
		System.out.println(knapsack(weights,values,n,maxWeight,0,0,0));

	}

}
