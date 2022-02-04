package GRAPHS;

import java.util.Scanner;

public class codingninja {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int r=s.nextInt();
		int c=s.nextInt();
		String str[]=new String[r];
		for(int i=0;i<r;i++) {
			str[i]=s.next();
		}
		char[][] arr=new char[r][c];
		for(int i=0;i<r;i++) {
			String st=str[i];
			for(int j=0;j<c;j++) {
				arr[i][j]=st.charAt(j);
			}
		}
		boolean[][] visited=new boolean[r][c];
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				if(arr[i][j]=='C') {
					int res=findString("ODINGNINJA",arr,visited,i,j,r,c);
					if(res==1) {
						System.out.println(res);
						return;
					}
				}
			}
		}
		System.out.println("0");
	}
	public static int findString(String str,char[][] arr, boolean[][] visited, int i, int j, int r, int c) {
		if(str.length()==0)
			return 1;
		if(visited[i][j])
			return 0;
		visited[i][j]=true;
		int count=0;
		int[] dx= {-1,-1,-1,0,0,1,1,1};
		int[] dy= {-1,0,1,-1,1,-1,0,1};
		for(int k=0;k<8;k++) {
			int x=i + dx[k];
			int y=j + dy[k];
			boolean isValid=helper(x,y,r,c);
			if(isValid && arr[x][y]==str.charAt(0) && !visited[x][y]) {
				count=findString(str.substring(1), arr, visited, x, y, r, c);
				if(count==1)
					return 1;
				visited[x][y]=false;
			}
		}
		return 0;
	}
	public static boolean helper(int i, int j, int r, int c) {
		if(i>=0 && i<r && j>=0 && j<c){
			return true;
		}
		return false;
	}

}
