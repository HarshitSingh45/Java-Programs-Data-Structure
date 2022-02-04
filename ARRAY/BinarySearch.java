package ARRAY;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,5,6,7,8,9};
		int n=search(arr,9);
		System.out.println(n);
	}
	public static int search(int[] arr,int key) {
		int s=0,e=arr.length-1,mid=0;
		while(s<=e) {
			mid=(s+e)/2;
			if(arr[mid]==key) {
				return mid;
			}else if(arr[mid]>key) {
				e=mid-1;
			}else {
				s=mid+1;
			}
		}
		return -1;

	}

}
