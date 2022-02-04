package TWO_D_ARRAY;

public class Spiral {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr= {{1,2,3,4,4},{5,6,7,8,8},{9,10,11,12,12},{13,14,15,16,16}};
		spiral(arr);

	}
	public static void spiral(int[][] arr) {
		int n=arr.length;
		int m=arr[0].length;
		int i=0,j=0,it=0;
		int num=0;
		while(num<=m*n) {
			while(j<m-it) {
				System.out.print(arr[i][j]+" ");
				num++;
				if(num==m*n) {
					return;
				}
				j++;
			}
			i++;
			j--;
			while(i<n-it) {
				System.out.print(arr[i][j]+" ");
				num++;
				if(num==m*n) {
					return;
				}
				i++;
			}
			i--;
			j--;
			while(j>=it) {
				System.out.print(arr[i][j]+" ");
				num++;
				if(num==m*n) {
					return;
				}
				j--;
			}
			j++;
			i--;
			while(i>it) {
				System.out.print(arr[i][j]+" ");
				num++;
				if(num==m*n) {
					return;
				}
				i--;
			}
			i++;
			j++;
			it++;
		}
	}

}
