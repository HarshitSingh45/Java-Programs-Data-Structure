package RECURSION_ADVANCE;

public class printSubsetOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3};
		int[] pass = {};
		printSubset(arr,0,pass);
		System.out.println(" returning subset");
		System.out.println();
		int[][] ans = subset(arr,0);
		for(int i=0; i<ans.length; i++) {
			for(int j=0;j<ans[i].length; j++) {
				System.out.print(ans[i][j]+" ");
			}
			System.out.println();
		}

	}
	public static int[][] subset(int[] arr, int si){
		if(si==arr.length) {
			return new int[1][0];
		}
		
		int[][] ans1= subset(arr, si+1);
		int[][] ans2 = subset(arr, si+1);
		
		int k=0;
		int[][] ans=new int[ans1.length + ans2.length][];
		for(int i=0; i<ans1.length; i++) {
			ans[k] = ans1[i];
			k++;
		}
		for(int i=0;i<ans2.length; i++) {
			ans[k] = new int[ans2[i].length +1];
			ans[k][0]=arr[si];
			for(int j=0; j<ans2[i].length; j++) {
				ans[k][j+1]=ans2[i][j];
			}
			k++;
		}
		return ans;
	}
	public static void printSubset(int[] arr, int si, int[] ans) {
		if(si==arr.length) {
			for(int i:ans) {
				System.out.print(i+" ");
			}
			System.out.println();
			return;
		}
		printSubset(arr, si+1, ans);
		int[] temp=new int[ans.length+1];
		for(int i=0; i<ans.length; i++) {
			temp[i] = ans[i];
		}
		temp[temp.length-1] = arr[si];
		printSubset(arr, si+1, temp);
	}

}
