package ARRAY;

public class PassingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3};
		Inc(arr);
		pri(arr);

	}
	public static void Inc(int[] arr1) {
		//arr1=new int[5];
		int n=arr1.length;
		for(int i=0;i<n;i++) {
			arr1[i]+=1;;
			//System.out.println(arr1[i]);
		}
	}
		
	public static void pri(int[] arr) {
		int n=arr.length;
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]);
		}
	}

}
