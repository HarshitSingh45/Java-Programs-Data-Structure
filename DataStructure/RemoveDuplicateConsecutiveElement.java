package DataStructure;

import java.util.ArrayList;

public class RemoveDuplicateConsecutiveElement {

	public static void main(String[] args) {
		int[] arr= {10,10,20,20,20,30,40};
		ArrayList<Integer> result=removeduplicateconsecutiveelement(arr);
		for(int i:result)
			System.out.println(i);
	}
	public static ArrayList<Integer> removeduplicateconsecutiveelement(int[] arr){
		ArrayList<Integer> result=new ArrayList<Integer>();
		result.add(arr[0]);
		for(int i=1;i<arr.length;i++) {
			if(arr[i]!=arr[i-1])
				result.add(arr[i]);
		}
		return result;
	}

}
