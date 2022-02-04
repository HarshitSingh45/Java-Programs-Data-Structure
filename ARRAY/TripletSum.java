package ARRAY;

public class TripletSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {2 ,-5, 8, -6, 0, 5, 10, 11, -3};
		int x=10;
		tripletSum(arr,x);
	}
	public static void tripletSum(int[] arr,int x) {
		int n=arr.length;
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				for(int k=j+1;k<n;k++) {
					if(arr[i]+arr[j]+arr[k]==x) {
						System.out.println(arr[i]+"+"+arr[j]+"+"+arr[k]+"="+x);
					}
				}
			}
		}
	}

}
