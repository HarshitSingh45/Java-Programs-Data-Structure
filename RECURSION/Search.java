package RECURSION;

public class Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,5};
		System.out.println(search(arr,0));

	}
	public static int search(int[] arr,int x) {
		int n=arr.length;
		if(arr.length==0) 
			return -1;
		if(arr[0]==x)
			return 0;

		int[] arr1=new int[n-1];
		for(int i=1;i<n;i++) {
			arr1[i-1]=arr[i];
		}
		//boolean found=true;
		int found=search(arr1,x);
		if(found==-1)
			return -1;
		else
		 return found+1;
	
	}

}
