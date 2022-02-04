package ARRAY;

import java.util.Scanner;

public class ArrangeArray1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=generateArray();
		printArray(arr);

	}
	public static int[] generateArray() {
		Scanner s =new Scanner(System.in);
		int n=s.nextInt();
		int arr[]=new int[n];
		if(n%2==0) {
			int val1=1;
			int val2=n;
			for(int i=0;i<=(n-1)/2;i++) {
				arr[i]=val1;
				val1+=2;
			}
			for(int i=n/2;i<n;i++) {
				arr[i]=val2;
				val2-=2;
			}
			
		}else {
			int val1=1;
			int val2=n-1;
			for(int i=0;i<=n/2;i++) {
				arr[i]=val1;
				val1+=2;
			}
			for(int i=(n+1)/2;i<n;i++) {
				arr[i]=val2;
				val2-=2;
			}
			
		}
		return arr;
	}
	public static void printArray(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+ " ");
		}
	}

}
