package DYNAMIC_PROGRAMMING;

public class Knapsack010 {

	public static int Knapsack(int[] weights, int[] values, int maxWeight, int i) {
		if(i==weights.length)
			return 0;
		if(weights[i]>maxWeight) {
			return Knapsack(weights, values, maxWeight, i+1);
		}else {
			int res1=values[i] + Knapsack(weights, values, maxWeight-weights[i], i+1);
			int res2=Knapsack(weights, values, maxWeight, i+1);
			return Math.max(res1, res2);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4;
		int[] weights= {1, 2, 4, 5};
		int[]values= {5, 4, 8, 6};
		int maxWeight=5;
		System.out.println(Knapsack(weights,values,maxWeight,0));

	}

}
