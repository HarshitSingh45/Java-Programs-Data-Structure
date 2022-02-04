package ARRAY;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {4,8,2,0,1,5,3,6,7};
		fun(arr);
		printArray(arr);

	}
	public static void printArray(int[] arr) {
		int n=arr.length;
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	public static void fun(int[] arr) {
		//function 
	}

}
