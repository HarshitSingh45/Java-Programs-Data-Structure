package RECURSION;

public class Sum0fArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,5,6,};
		int n=arr.length;
		int sum=sum(arr);
		System.out.println(sum);
		System.out.println(power(arr,0));

	}
	public static int power(int[] arr,int si) {
		if(si==arr.length)
			return 0;
		return arr[si]+power(arr,si+1);
	}
	public static int sum(int[] arr) {
		int n=arr.length;
		if(n==1) {
			return arr[0];
		}
		
		int[] arr1=new int[n-1];
		for(int i=1;i<n;i++) {
			arr1[i-1]=arr[i];
		}
		int sum=arr[0]+sum(arr1);
		return sum;
		
	}

}
