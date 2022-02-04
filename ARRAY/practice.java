package ARRAY;

import java.util.Arrays;
import java.util.Scanner;

import java.util.Scanner;
import java.util.Scanner;
public class practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int k=s.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		int max=sub(arr,k);
		System.out.println(max);
	}
	public static int sub(int[] arr,int k) {
		Arrays.sort(arr);
		int n=arr.length;
		int sum=0;
		int j=n-1;
		for(int i=0;i<k;i++) {
			sum+=arr[j-i];
			//j--;
		}
		return sum;
	}
	
}

