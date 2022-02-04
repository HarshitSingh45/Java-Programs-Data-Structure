package RECURSION;

import java.util.Scanner;

//a. The string begins with an 'a'
//b. Each 'a' is followed by nothing or an 'a' or "bb"
//c. Each "bb" is followed by nothing or an 'a'

public class PRACTICE {

	public static void main(String[] args) {
		int[][] arr= {{30, 20, 53, 14},{1,2,3,4},{2,3,4,5}};
		printArray(arr);
	}
	public static void printArray(int[][] arr) {
		for(int i=0;i<arr.length;i++) {
			print(arr[i],arr.length-i);
			//System.out.println();
		}
	}
	public static void print(int[] arr,int n) {
		if(n==0)
			return;
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		print(arr, n-1);
	}

}
