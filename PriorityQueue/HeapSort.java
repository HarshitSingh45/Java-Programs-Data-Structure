package PriorityQueue;

import java.util.Scanner;

public class HeapSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		heap(arr);
		for(int i:arr) {
			System.out.print(i+" ");
		}

	}
	public static void heap(int[] arr) {
		int n=arr.length;
		for(int i=0;i<n;i++) {
			insert(arr,i);
		}
		for(int i=0;i<n;i++) {
			arr[n-1-i]=remove(arr,n-i);
		}
	}
	private static void insert(int[] arr, int i) {
		int ci=i;
		int pi=(ci-1)/2;
		while(ci>0) {
			if(arr[ci]<arr[pi]) {
				int temp=arr[ci];
				arr[ci]=arr[pi];
				arr[pi]=temp;
				ci=pi;
				pi=(ci-1)/2;
			}else {
				return;
			}
		}
	}
	private static int remove(int[] arr,int hsize) {
		int temp=arr[0];
		int ci=hsize-1;
		arr[0]=arr[ci];
		hsize--;
		int pi=0;
		int lci=2*pi+1;
		int rci=2*pi+2;
		while(lci<hsize) {
			if(arr[pi]>arr[lci] || arr[pi]>arr[rci]) {
				int min;
				int ind;
				if(arr[lci]<arr[rci]) {
					min=arr[lci];
					ind=lci;
				}else {
					min=arr[rci];
					ind=rci;
				}
				arr[ind]=arr[pi];
				arr[pi]=min;
				pi=ind;
				lci=2*pi+1;
				rci=2*pi+2;
			}else {
				return temp;
			}
		}
		return temp;
	}

}
