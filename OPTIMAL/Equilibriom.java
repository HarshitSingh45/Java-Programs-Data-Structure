package OPTIMAL;

public class Equilibriom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,-1,4};
		int index=equil(arr);
		System.out.println(index);

	}
	public static int equil(int[] arr) {
		int ls=0,rs=0;	
		for(int i=1;i<arr.length;i++) {
			rs+=arr[i];
		}
		for(int i=0;i<arr.length;i++) {
			if(i==0) {
				if(i==rs) {
				return 0;
				}
			}
			else {
				ls+=arr[i-1];
				rs-=arr[i];
				if(ls==rs) {
					return i;
				}
			}
		}
		return -1;
	}

}
