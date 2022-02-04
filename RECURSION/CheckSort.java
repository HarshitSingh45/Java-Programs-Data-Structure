package RECURSION;

public class CheckSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,5,4};
		System.out.println(sorting(arr));

	}
	//THIS METHOD BASICALLY TESTS  FIRST TWO ELEMNTS AND PASS THE REMAINIG ARRAY INTO RECURSION
	public static boolean sorting(int[] arr) {
		int n=arr.length;
		//BASE CASE
		if(n==1)
			return true;
		//CHECK 1ST AND 2ND ELEMENT
		if(arr[0]>arr[1])
			return false;
		//CREATE A NEW ARRAY OF LENGTH-1 AND COPY ITS CONTENT
		int[] arr1=new int[n-1];
		for(int i=1;i<n;i++) {
			arr1[i-1]=arr[i];
		}
		//CALL RECURSION ON COPIED ARRAY
		boolean bool=sorting(arr1);
		return bool;
		
	}
}
