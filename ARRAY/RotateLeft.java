package ARRAY;

public class RotateLeft {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1 ,2, 3, 4, 5, 6, 7};
		rotateLeft(arr,4);
		printArray(arr);

	}
	public static void printArray(int[] arr) {
		int n=arr.length;
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	public static void rotateLeft(int[] arr,int d) {
		//function 
		int n=arr.length;
		int[] ar=new int[d];
		for(int i=0;i<d;i++) {
			ar[i]=arr[i];
		}
		int i=d;
		while(i<n) {
			arr[i-d]=arr[i];
			i++;
		}
		int j=0;
		for(int k=n-d;k<n;k++) {
			arr[k]=ar[j];
			j++;
		}
//		for(int j=0;j<d;j++) {
//			int temp=arr[0];
//			int i;
//			for(i=0;i<n-1;i++) {
//				arr[i]=arr[i+1];
//			}
//			arr[n-1]=temp;
//		}
	}

}
