package GRAPHS;

import java.util.Scanner;

public class ConnectingDots {

	public static boolean isValid(int i, int j, int r, int c) {
		if(i>=0 && i<r && j>=0 && j<c)
			return true;
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int r=s.nextInt();
		int c=s.nextInt();
		String[] str=new String[r];
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
				char x=arr[i][j];
				if(isValid(i,j+1,r,c) && arr[i][j+1]==x && isValid(i+1,j,r,c) && arr[i+1][j]==x) {
					visited[i][j]=true;
					boolean result=findCycle(i,j+1,arr,visited,i+1,j);
					if(result) {
						System.out.println(result);
						return;
					}
					visited[i][j]=false;
					visited[i][j+1]=false;
				}
			}
		}
		System.out.println("false");
	}
	public static boolean findCycle(int i, int j, char[][] arr, boolean[][] visited, int oi, int oj) {
		visited[i][j]=true;
		int[] dx= {-1,0,0,1};
		int[]dy= {0,-1,1,0};
		for(int k=0;k<4;k++) {
			int x=i+dx[k];
			int y=j+dy[k];
			boolean check=isValid(x, y, arr.length, arr[0].length);
			if(check && !visited[x][y] && arr[x][y]==arr[i][j]) {
				if(x==oi && j==oj) {
					return true;
				}
				boolean result= findCycle(x, y, arr, visited, oi, oj);
				if(result)
					return true;
				visited[x][y]=false;
			}
		}
		return false;
	}

}
/*
 SAMPLE INPUT 1
 3 4
AAAA
ABCA
AAAA
OP TRUE

SAMMPLE INPUT 2
4 4
YYYR
BYBY
BBBY
BBBY
OP TRUE

SAMPLE INPUT 3
7 6
AAAAAB
ABBBAB
ABAAAB
ABABBB
ABAAAB
ABBBAB
AAAAAB
OP TRUE

SAMPLE INPUT 4
2 2
AA
AB
OP FALSE
 */

