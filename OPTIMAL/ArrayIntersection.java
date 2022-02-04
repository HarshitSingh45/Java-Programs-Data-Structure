package OPTIMAL;

import java.util.Arrays;

public class ArrayIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// BY SORTING BOTH THE ARRAYS
		int[] arr= {2,3,4,5,6,8};
		int[] arr1= {2,3,4,7};
		Arrays.sort(arr);
		Arrays.sort(arr1);
		
		intersection(arr,arr1);

	}
	public static void intersection(int[] arr,int[] arr1) {
		int i=0,j=0;
		while(i<arr.length&&j<arr1.length) {
			if(arr[i]<arr1[j]) {
				i+=1;
			}
			else if(arr1[j]<arr[i]) {
				j+=1;
			}
			else {
				System.out.print(arr[i]+" ");
				i++;
				j++;
			}
		}
	}

}
