package ARRAY;

import java.util.Scanner;

public class LargestElement {
	
	public static int[] takeInput() {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
			}
		return arr;
	}
	
	public static int findMax(int[] arr) {
		int n=arr.length;
		int max=0;
		for(int i=0;i<n;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		return max;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=takeInput();
		int max=findMax(arr);
		System.out.println(max);

	}

}
