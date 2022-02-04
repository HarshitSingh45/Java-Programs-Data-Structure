package ARRAY;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {4,7,3,9,2,5,10,54,1,98,0,27};
		sorting(arr);
	}
	public static void sorting(int[] arr) {
		int n=arr.length;
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		for (int i=0;i<n-1;i++) {
			int min=Integer.MAX_VALUE;
			int minInd=-1;
			for(int j=i;j<n;j++) {
				if(arr[j]<min) {
					min=arr[j];
					minInd=j;
				}
			}
			arr[minInd]=arr[i];
			arr[i]=min;;
		}
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		
	}

}
