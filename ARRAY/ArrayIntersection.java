package ARRAY;

public class ArrayIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {2,6,8,5,4,3};
		int[] arr1= {2,3,4,7};
		intersection(arr,arr1);
	}
	public static void intersection(int[] arr,int[] arr1) {
		int n=arr.length;
		int m=arr1.length;
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				if(arr[i]==arr1[j]) {
					System.out.print(arr[i]+" ");
					arr[j]=Integer.MIN_VALUE;
					break;
				}
			}
		}
	}

}
