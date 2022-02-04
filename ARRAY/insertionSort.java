package ARRAY;

public class insertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {4,8,2,0,1,5,3,6,7};
		int[] arr1={4,8,2,0,1,5,3,6,7};
		insertionSorto(arr);
		System.out.println();
		insertionSort1(arr1);
	
		printArray(arr);
	}
	public static void printArray(int[] arr) {
		int n=arr.length;
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	public static void insertionSorto(int[] arr) {
		int n=arr.length;
		for(int i=0;i<n-1;i++) {
			for(int j=i;j>=0;j--) {
				if(arr[j+1]<arr[j]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
				else {
					continue;
				}
			}
		}
	}
	public static void insertionSort1(int[] arr) {
		int n=arr.length;
		for(int i=1;i<n;i++) {
			int temp=arr[i];
			int j=i-1;
			while(j>=0&&arr[j]>temp) {
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=temp;
		}
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
