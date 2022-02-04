package GRAPHS;

import java.util.Scanner;

public class LargestPiece {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		int[][] arr=new int[n][n];
		boolean[][] visited =new boolean[n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				arr[i][j]=s.nextInt();
			}
		}
		int max=0;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(!visited[i][j] && arr[i][j]==1) {
					int result=countOne(visited,arr,i,j);
					if(result>max) {
						max=result;
					}
				}
			}
		}
		System.out.println(max);
	}

	public static boolean helper(int r, int c, int i, int j) {
		if(i>=0 && i<r && j>=0 && j<c)
			return true;
		return false;
	}
	public static int countOne(boolean[][] visited, int[][] arr, int i, int j) {
		int r=arr.length;
		int c=arr.length;
		visited[i][j]=true;
		int flag=0;
		int res=1;
		if(helper(r,c,i-1,j) && !visited[i-1][j] && arr[i-1][j]==1) {
			flag=1;
			res+=countOne(visited, arr, i-1, j);
		}
		if(helper(r,c,i,j-1) && !visited[i][j-1] && arr[i][j-1]==1) {
			flag=1;
			res+=countOne(visited, arr, i, j-1);

		}
		if(helper(r,c,i,j+1) && !visited[i][j+1] && arr[i][j+1]==1) {
			flag=1;
			res+=countOne(visited, arr, i, j+1);

		}
		if(helper(r,c,i+1,j) && !visited[i+1][j] && arr[i+1][j]==1) {
			flag=1;
			res+=countOne(visited, arr, i+1, j);

		}
		if(flag==0)
			return 1;
		return res;
	}
}

/*
SAMPLE INPUT
3
1 0 0
0 1 0
0 1 0
OP =2

SAMPLE INPUT
2
1 1
0 1
OP=3

 */
