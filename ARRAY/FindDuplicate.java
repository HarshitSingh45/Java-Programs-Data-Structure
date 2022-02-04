package ARRAY;

public class FindDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {3,4,5,6,7,8,6,9};
		int n=findDup(arr);
		System.out.println(n);
	}
	public static int findDup(int[] arr) {
		int n=arr.length;
		int x=0;
		for(int i=0;i<n;i++) {
			x=arr[i];
			int count=0;
			for(int j=0;j<n;j++) {
				if(j==i) {
					continue;
				}
				if(arr[j]==x) {
					count =1;
					break;
				}
			}
			if(count==1) {
				break;
			}
		}
		return x;
	}

}
