package RECURSION;

public class CheckSort1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,5};
		System.out.println(sorting(arr,0));

	}
	// WE PASS ARRAY AND STARTING INDEX OF ARRAY INTO fn 
	//BY THIS METHOD WE DONT NEED TO COPY THE ELEMNTS INTO NEW ARRAY
	//TRAVERSAL CAN BE DONE THROUGH SI
	public static boolean sorting(int[] arr,int si) {
		if(si==arr.length-1)
			return true;
		if(arr[si]>arr[si+1])
			return false;
		boolean bool=sorting(arr,si+1);
		return bool;
	}

}
