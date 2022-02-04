package RECURSION;

public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input= {7,3,5,1,7,4,9,3,2,0,8,7,5,7,3,8};
		quickSort(input);
		print(input);

	}
	public static void print(int[] arr) {
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
	}
	public static int partition(int[] a,int si,int ei) {
		int temp=a[si],count=0;
		for(int i=si+1;i<=ei;i++) {
			if(a[i]<temp)
				count++;
		}
		int pivot =si+count;
		a[si]=a[pivot];
		a[pivot]=temp;
		int i=si,j=ei;
		while(i<pivot&&j>pivot) {
			if(a[i]<a[pivot]) {
				i++;
			}else if(a[j]>=a[pivot]) {
				j--;
			}
			else{
				int tem=a[i];
				a[i]=a[j];
				a[j]=tem;
				i++;
				j--;
			}
		}
		return pivot;
	}
    
    public static void quickSort(int[] arr, int si, int ei) {
        // your code goes here
        if(si>=ei)
            return;
        int pivot=partition(arr,si,ei);
        quickSort(arr,si,pivot-1);
        quickSort(arr,pivot+1,ei);

    }

    public static void quickSort(int[] input) {
        /* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * No need to print or return the output.
		 * Taking input and printing output is handled automatically.
		 */
        quickSort(input, 0, input.length - 1);

    }


}
