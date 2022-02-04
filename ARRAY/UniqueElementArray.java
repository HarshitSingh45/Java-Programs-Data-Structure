package ARRAY;

public class UniqueElementArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {3,5,4,3,4};
		int n=findUnique(arr);
		System.out.println(n);

	}
	public static int findUnique(int[] arr){
		//Your code goes here
		int n=arr.length;
		int x=0;

		for(int i=0;i<n;i++) {
			int count=0;
			x=arr[i];
			for(int j=0;j<n;j++) {
				if(j==i) {
					continue;
				}
				if(x==arr[j]) {
					count=1;
				}
			}
			if(count==0) {
				break;
			}
		}
		return x;

	}

}



