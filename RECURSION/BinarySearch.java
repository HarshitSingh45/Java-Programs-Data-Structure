package RECURSION;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,5,6,7,8,9};
		System.out.println(search(arr,4,0,arr.length-1));

	}
	public static int search(int[] arr,int x,int si,int ei) {
		if(si>ei)
			return -1;
		int mid=(si+ei)/2;
		if(arr[mid]==x)
			return mid;
		else if(arr[mid]>x)
			return search(arr,x,si,mid-1);
		else
			return search(arr,x,mid+1,ei);
	}

}
