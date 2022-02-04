package RECURSION_ADVANCE;

public class PrintSubsetSumToK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,5};
		int[] pass= {};
		printSubsetSumK(arr,0,5,pass);

	}
	public static void printSubsetSumK(int[] arr, int si, int k, int[] ans) {
		if(k==0) {
			for(int i:ans)
				System.out.print(i+" ");
			System.out.println();
			return;
		}
		if(si==arr.length)
			return;
		
		printSubsetSumK(arr, si+1, k, ans);
		int[] temp =new int[ans.length+1];
		for(int i=0; i<ans.length; i++) {
			temp[i] = ans[i];
		}
		temp[temp.length-1]=arr[si];
		
		printSubsetSumK(arr, si+1, k-arr[si], temp);
	}

}
