package GRAPHS;

import java.util.Scanner;

public class largestpiec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		int[][] arr=new int[n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				arr[i][j]=s.nextInt();
			}
		}
		int res=0;
		boolean[][] visited=new boolean[n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(arr[i][j]==1 && !visited[i][j]) {
					res=Math.max(res, countOne(arr,visited,i,j));
				}
			}
		}
		System.out.println(res);
	}
	public static int countOne(int[][] arr, boolean[][] visited, int i, int j) {
		visited[i][j]=true;
		int count=1;
		int[] dx= {-1,0,0,1};
		int [] dy= {0,-1,1,0};
		for(int k=0;k<4;k++) {
			int x=i+dx[k];
			int y=j+dy[k];
			boolean isvalid=helper(x,y,arr.length);
			if(isvalid && arr[x][y]==1 && !visited[x][y]) {
				count=count + countOne(arr, visited, x, y);
			}
		}
		return count;
	}
	public static boolean helper(int i, int j, int n) {
		if(i>=0 && i<n && j>=0 && j<n)
			return true;
		return false;
	}

}

/*
 SAMPLE INPUT 1
 2
1 1
0 1
OP -3

 SAMPLE INPUT 2
 3
1 0 0
0 1 0
0 1 0
OP - 2
  */
