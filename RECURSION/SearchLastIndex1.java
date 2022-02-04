package RECURSION;

public class SearchLastIndex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,5,4,3};
		System.out.println(searching(arr,-3,0));

	}
	// IN THIS METHOD WE FIND LAST OCCURENCE OF REQUIRED DIGIT
	//FIRST WE CHECK IN THE SUBSEQUENT ARRAY THEN WE CHECK INITIAL POSITION
	
	public static int searching(int[] arr,int x,int si) {
		if(si==arr.length)
			return -1;
		int n=searching(arr,x,si+1);
		if(n==-1) {
			if(arr[si]==x)
				return si;
		}
		return n;
	}

}
