package TWO_D_ARRAY;

public class SineWave {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr= {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
		sineWave(arr);

	}
	public static void sineWave(int[][] arr) {
		int n=arr.length;
		if(n==0) {
			return;
		}
		int m=arr[0].length;
		for(int j=0;j<m;j++) {
			
			if(j%2==0) {
				for(int i=0;i<n;i++) {
					System.out.print(arr[i][j]+" ");
				}
				
			}else {
				for(int i=n-1;i>=0;i--) {
					System.out.print(arr[i][j]+" ");
				}
				
			}
		}
	}

}
