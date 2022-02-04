package RECURSION;

public class SearchLastIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,4,5};
		System.out.println(searching(arr,4));

	}
	public static int searching(int[] arr,int x) {
		if(arr.length==0)
			return -1;
		int[] arr1=new int[arr.length-1];
		for(int i=1;i<arr.length;i++) {
			arr1[i-1]=arr[i];
		}
		int n=searching(arr1,x);
		if(n==-1) {
			if(arr[0]==x)
				return 0;
			else
				return -1;
		}
		return n+1;		
	}

}
