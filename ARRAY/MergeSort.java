package ARRAY;

import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1= {1,3,5,7,9};
		int[] arr2= {2,4,6,8};
		int[] output=mergeSort(arr1,arr2);
		printArray(output);
	}
	public static void printArray(int[] output) {
		int n=output.length;
		for(int i=0;i<n;i++) {
		System.out.print(output[i]+" ");
		}
	}
	public static int[] mergeSort(int[] arr,int[] arr1) {
		Arrays.sort(arr);
		Arrays.sort(arr1);
		int n=arr.length;
		int m=arr1.length;
		int[] merge=new int[n+m];
		int i=0,j=0,k=0;
		while(i<n&&j<m) {
			if(arr[i]<=arr1[j]) {
				merge[k]=arr[i];
				k++;
				i++;
			}else {
				merge[k]=arr1[j];
				j++;
				k++;
			}
		}
		while(i<n) {
			merge[k]=arr[i];
			k++;
			i++;
		}
		while(j<m) {
			merge[k]=arr1[j];
			k++;
			j++;
		}
		return merge;
	}

}
