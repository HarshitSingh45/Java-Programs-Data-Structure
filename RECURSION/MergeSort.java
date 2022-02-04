package RECURSION;

public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {4,3,5,2,6,1,9,0,4,3,7,8};
		merge(arr);
		print(arr);

	}
	public static void merge(int[] arr) {
		if(arr.length==1)
			return;
		int mid=arr.length/2;
		int[] a=new int[mid];
		int[] b=new int[arr.length-mid];
		for(int i=0;i<arr.length;i++) {
			if(i<mid)
				a[i]=arr[i];
			else
				b[i-mid]=arr[i];
		}
		merge(a);
		merge(b);
		sort(a,b,arr);
		
	}
	public static void sort(int[] a,int[] b,int[] result) {
		int n=a.length;
		int m=b.length;
		int i=0,j=0,k=0;
		while(i<n&&j<m) {
			if(a[i]<b[j]) {
				result[k]=a[i];
				i++;
				k++;
			}else {
				result[k]=b[j];
				j++;
				k++;
			}
		}
		while(i<n) {
			result[k]=a[i];
			i++;
			k++;
		}
		while(j<m) {
			result[k]=b[j];
			j++;
			k++;
		}
	}
	public static void print(int[] arr) {
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
	}

}
