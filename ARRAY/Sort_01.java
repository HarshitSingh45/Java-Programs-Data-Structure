package ARRAY;

public class Sort_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1, 0, 1, 1, 0, 1, 0, 1};
		sort(arr);

	}
	public static void sort(int[] arr) {
		int n=arr.length;
		int i=0,j=n-1;
		while(i<j) {
			if(arr[i]==1&&arr[j]==0) {
				int temp=arr[j];
				arr[j]=arr[i];
				arr[i]=temp;
				i++;
				j--;
			}else if(arr[i]==0&&arr[j]==0) {
				i++;
			}else if(arr[i]==1&&arr[j]==1) {
				j--;
			}else {
				i++;
				j--;
			}
		}
		for(int k=0;k<arr.length;k++) {
			System.out.print(arr[k]+" ");
		}
	}

}
