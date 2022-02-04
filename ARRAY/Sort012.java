package ARRAY;

public class Sort012 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,0,2,1,1,0,1,1,0};
		sorting(arr);
		printArray(arr);

	}
	public static void printArray(int[] arr) {
		int n=arr.length;
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	public static void sorting(int[] arr) {
		//function 
		int n=arr.length;
		int i=0,nt=n-1,nz=0;
		while(i<=nt) {
			if(arr[i]==1) {
				i++;
			}
			else if(arr[i]==0) {
				int temp=arr[i];
				arr[i]=arr[nz];
				arr[nz]=temp;
				i++;
				nz++;
			}
			else {
				int temp=arr[nt];
				arr[nt]=arr[i];
				arr[i]=temp;
				nt--;
			}
		}

	}

}
