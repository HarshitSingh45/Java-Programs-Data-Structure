package RECURSION_ADVANCE;

public class SubsetsSumToK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,5,6,7,8,9};
		
		//int[][] ar=subsetSumToK(arr,0,5);
		int[][] ar=subsetsSumK(arr, 5, 0);
		for(int i=0;i<ar.length;i++) {
			for(int j=0;j<ar[i].length;j++) {
				System.out.print(ar[i][j]+" ");
			}
			System.out.println();
		}
	}
	/*public static int[][] subsetArray(int[] arr, int si){
		if(si==arr.length) {
			int[][] output=new int[1][];
			output[0]= new int[1];
			output[0][0]=0;
			return output;
		}
		int[][] output=subsetArray(arr, si+1);
		int[][] newOutput=new int[output.length * 2][];
		for(int i=0; i<output.length; i++) {
			for(int j=0;j<output[i].length; j++) {
				newOutput[i][j]=output[i][j];
			}
		}
		for(int i=output.length; i<newOutput.length; i++) {
			int temp[] = new int[output[i-output.length].length+1];
			for(int j=0; j<output[i-output.length].length; j++) {
				temp[j]=output[i-output.length][j];
			}
			temp[temp.length-1]=arr[si];
			newOutput[i]=temp;
		}
		return newOutput;
	}*/
	
	/*public static int[][] subsetSumToK(int[] arr, int si, int k){
		if(k==0) {
			return new int[1][0];
		}
		if(si==arr.length) {
			return new int[0][0];
		}
		int n=arr[si];
		int[][] op=subsetSumToK(arr, si+1, k);
		int[][] op1=subsetSumToK(arr, si+1, k-n);
		
		int[][] ans= new int[op.length + op1.length][];
		int m=0;
		for(int i=0;i<op.length; i++) {
			ans[m]=op[i];
			m++;
		}
		for(int i=0;i<op1.length;i++) {
			ans[m]=new int[op1[i].length + 1];
			ans[m][0]=n;
			for(int j=0; j<op1[i].length; i++) {
				ans[m][j+1] = op1[i][j];
			}
			m++;
		}
		return ans;
	}*/
	 public static int[][] subsetsSumK(int[] input, int p, int start) {
	        if (start == input.length) {
	            if (p == 0) {
	                return new int[1][0];
	            }
	            else {
	                return new int[0][0];
	            }
	        }
	        int cn=input[start];
	        int[][] smallans1=subsetsSumK(input, p,start+1);
	        int[][] smallans2=subsetsSumK(input, p-cn, start+1);

	        int[][] myans=new int[smallans1.length+smallans2.length][];
	        int k=0;
	        for(int i=0;i<smallans1.length;i++){
	            myans[k]=smallans1[i];
	            k++;
	        }
	        for(int i=0;i<smallans2.length;i++){
	            myans[k]=new int[smallans2[i].length+1];
	            myans[k][0]=cn;
	            for(int j=0;j<smallans2[i].length;j++){
	                myans[k][j+1]=smallans2[i][j];
	            }
	            k++;
	        }
	        return myans;
	    }
}
