package RECURSION;

public class Search1 {
	// RETURN THE INDEX FOR THE FIRST TIME OCCURING OF A NUMBER IN AN ARRAY

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,5};
		//we pass array, searching element & starting index of array
		System.out.println(searching(arr,9,0));

	}
	public static int searching(int[] arr,int x,int si){
		//HANDLING BASE CASE
		if(si==arr.length)
			return -1;
		//CHECKING AT SI
		if(arr[si]==x)
			return si;
		//RECURSION
		int index=searching(arr,x,si+1);
		return index;
	}

}
