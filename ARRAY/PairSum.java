package ARRAY;

public class PairSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,3,6,2,5,4,3,2,4};
		int x=7;
		pairsum(arr,x);
	}
	public static void pairsum(int[] arr,int x) {
		int n=arr.length;
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(arr[i]+arr[j]==x) {
					System.out.println(arr[i]+"+"+arr[j] +"="+x);
				}
			}
		}
	}

}
