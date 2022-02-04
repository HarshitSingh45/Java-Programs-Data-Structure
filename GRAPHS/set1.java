package GRAPHS;

import java.util.Arrays;
import java.util.Scanner;


public class set1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int r=s.nextInt();
		int c=s.nextInt();
		char[][] arr=new char[r][c];
		for(int i=0;i<r;i++) {
			String str=s.next();
			for(int j=0;j<c;j++) {
				arr[i][j]=str.charAt(j);
			}
		}
		boolean[][] visited=new boolean[r][c];
		boolean res=false;
		for(int i=0;i<r;i++) {
			if(res==true)
				break;
			for(int j=0;j<c;j++) {
				boolean res1=isvalid(i,j+1,r,c);
				boolean res2=isvalid(i+1,j,r,c);
				if(res1 && res2 && arr[i][j]==arr[i][j+1] && arr[i][j]==arr[i+1][j]) {
					visited[i][j]=true;
					res=cd(arr,visited,i,j+1,i+1,j);
					if(res) {
						System.out.println(res);
						return;
					}
//						break;
					visited[i][j]=false;
					visited[i][j+1]=false;
				}
			}
		}
		System.out.println("false");
	}
	public static boolean isvalid(int i, int j, int r, int c) {
		if(i<0 || i>=r || j<0 || j>=c)
			return false;
		return true;
	}
	public static boolean cd(char[][] arr,boolean[][] visited,int ci, int cj, int ti, int tj) {
		visited[ci][cj]=true;
		
		int[] dx= {-1,0,0,1};
		int[] dy= {0,-1,1,0};
		for(int i=0;i<4;i++) {
			int x=ci+dx[i];
			int y=cj+dy[i];
			boolean valid=isvalid(x,y,arr.length,arr[0].length);
			if(valid && !visited[x][y] && arr[x][y]==arr[ci][cj]) {
				if(x==ti && y==tj)
					return true;
				boolean res=cd(arr, visited, x, y, ti, tj);
				if(res)
					return true;
				visited[x][y]=false;
			}
		}
		return false;
	}
	
}
