package ARRAY;

public class Rotate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1, 3, 6, 11, 12, 17};
		rotate(arr,4);
		printArray(arr);

	}
	public static void printArray(int[] arr) {
		int n=arr.length;
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	public static void rotate(int[] arr,int d) {
		//function 
		int n=arr.length;
		int ar[]=new int[d];
		int i=n-d;
		int j=0;
		while(i<n) {
			ar[j]=arr[i];
			j++;
			i++;
		}
		int k=n-d-1;
		while(k>=0) {
			arr[k+d]=arr[k];
			k--;
		}
		for(int l=0;l<d;l++) {
			arr[l]=ar[l];
		}
	}

}
