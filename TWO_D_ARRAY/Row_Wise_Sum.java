package TWO_D_ARRAY;

public class Row_Wise_Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr= {{1,2,3,4},{2,3,4,5},{3,4,5,6}};
		rowSum(arr);

	}
	public static void rowSum(int[][] arr) {
		int n=arr.length;
		int m=arr[0].length;
		for(int i=0;i<n;i++) {
			int sum=0;
			for(int j=0;j<m;j++) {
				sum+=arr[i][j];
			}
			System.out.println("Sum of "+i+" th row is "+sum);		
		}
	}

}
