package OPTIMAL;

import java.util.Arrays;

public class FindDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {0, 7, 2, 5, 4, 7, 1, 3, 6};
		int du=dupli(arr);
		System.out.println(du);

	}
	public static int dupli(int[] arr) {
		Arrays.sort(arr);
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]==arr[i+1]) {
				return arr[i];
			}
		}
		return -1;
	}

}
