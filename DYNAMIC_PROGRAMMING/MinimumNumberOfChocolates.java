package DYNAMIC_PROGRAMMING;

public class MinimumNumberOfChocolates {

	public static int getMin(int arr[], int N){
		int[] dp= new int[N];
		dp[0]=1;
		for(int i=1; i<arr.length; i++) {
			if(arr[i]>arr[i-1]) {
				dp[i]=1+dp[i-1];
			}else {
				dp[i]=1;
			}
		}
		for(int i=arr.length-2; i>=0; i--) {
			if(arr[i]>arr[i+1] && dp[i]<=dp[i+1]) {
				dp[i]=1+dp[i+1];
			}
		}
		
		int ans=0;
		for(int i=0; i<dp.length; i++) {
			ans+=dp[i];
		}
		return ans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {2,3,8,1,5,4,6,7};
		System.out.println(getMin(arr, arr.length));

	}

}
