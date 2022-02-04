package RECURSION_ADVANCE;

public class FindMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {6,0,5,3,9,2,-1};
		findMin(arr,0,Integer.MAX_VALUE);
	}
	public static void findMin(int[] arr, int si, int min) {
		if(si==arr.length) {
			System.out.println(" Minimum value is "+min);
			return;
		}
		if(arr[si]<min)
			min=arr[si];
		findMin(arr, si+1, min);
	}
}
