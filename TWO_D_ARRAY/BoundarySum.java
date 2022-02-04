package TWO_D_ARRAY;

public class BoundarySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr= {{1,2,3},{4,5,6},{7,8,9}};
		boundarySum(arr);

	}
	public static void boundarySum(int[][] arr) {
		int n=arr.length;
		if(n==0) {
			return;
		}
		int m=arr[0].length;
		int i=0,j=0;
		int sum=0;
		while(i<n) {
			j=0;
			while(j<m) {
				sum+=arr[i][j];
				arr[i][j]=0;
				j++;
			}
			i+=n-1;
		}
		//i=0;
		j=0;
		while(j<m) {
			i=0;
			while(i<n) {
				sum+=arr[i][j];
				arr[i][j]=0;
				i++;
			}
			j+=m-1;
		}
		for(i=0;i<n;i++) {
			for(j=0;j<m;j++) {
				if(i==j) {
					sum+=arr[i][j];
					arr[i][j]=0;
				}
				else if(i+j==n-1) {
					sum+=arr[i][j];
					arr[i][j]=0;
				}
			}
		}
		System.out.println(sum);
	}

}
