package OPTIMAL;

import java.util.Arrays;

public class UniqueElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {2, 3, 3, 3, 6, 2};
		int uni=unique(arr);
		System.out.println(uni);

	}
	public static int unique(int[] arr) {
		Arrays.sort(arr);
		for(int i=0;i<arr.length-1;i++) {
			if(i==0) {
				if(arr[i]!=arr[i+1]) {
					return arr[i];
				}
			}
			else {
				if(arr[i]!=arr[i-1]&&arr[i]!=arr[i+1]) {
					return arr[i];
				}
			}
		}
		return arr[arr.length-1];
	}

}
