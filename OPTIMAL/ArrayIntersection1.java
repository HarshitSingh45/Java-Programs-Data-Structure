package OPTIMAL;

import java.util.Arrays;

public class ArrayIntersection1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// BY SORTING ONLY 1 ARRAY
		
		int[] arr= {3,6,3,2,4,3,2,1};
		int[] arr1= {2,3,3,1,3};
		
		intersection(arr,arr1);

	}
	public static void intersection(int[] arr,int[] arr1) {
		
		Arrays.sort(arr1);
		if(arr.length<arr.length) {
			Arrays.sort(arr);
			for(int i=0;i<arr1.length;i++) {
				int temp =arr1[i];
				BinarySearch(temp,arr);
			}
		}
		else {
			Arrays.sort(arr1);
			for(int i=0;i<arr.length;i++) {
				int temp =arr[i];
				BinarySearch(temp,arr1);
			}
		}
	}
	public static void BinarySearch(int x, int[] arr) {
    	//Your code goes here
        int s=0;
        int e=arr.length-1;
        int mid=0;
        while(s<=e){
            mid=(s+e)/2;
            if(x==arr[mid]) {
                System.out.print(x+' ');
                arr[mid]=Integer.MAX_VALUE;
                return;
            }
            else if(arr[mid]<x){
                s=mid+1;
            }
            else{
                e=mid-1;
            }
        }
       // return -1;
    }

}
