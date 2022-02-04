package GRAPHS;

import java.util.Scanner;

public class Codingninjas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int row=s.nextInt();
		int col=s.nextInt();
		String[] ar=new String[row];
		for(int i=0;i<row;i++) {
			ar[i]=s.next();
		}
		char[][] arr=new char[row][col];
		for(int i=0;i<row;i++) {
			String str=ar[i];
			for(int j=0;j<col;j++) {
				arr[i][j]=str.charAt(j);
			}
		}
		boolean[][] visited=new boolean[row][col];
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				if(arr[i][j]=='C') {
					visited[i][j]=true;
					int result=findString("ODINGNINJA",i,j,arr,visited);
					if(result==1) {
						System.out.println(result);
						return;
					}
					visited[i][j]=false;
				}
			}
		}
		System.out.println("0");

	}
	public static boolean helper(int r, int c, int i, int j) {
		if(i>=0 && i<r && j>=0 && j<c)
			return true;
		else
			return false;
	}
	public static int findString(String str, int i, int j,char[][] arr,boolean[][] visited) {
		if(str.length()==0)
			return 1;
		
		int r=arr.length;
		int c=arr[0].length;
		
		if(helper(r,c,i-1,j-1) && arr[i-1][j-1]==str.charAt(0) && !visited[i-1][j-1]) {
			visited[i-1][j-1]=true;
			int res=findString(str.substring(1), i-1, j-1, arr,visited);
			if(res==1)
				return 1;
			visited[i-1][j-1]=false;
		}
		if(helper(r,c,i-1,j) && arr[i-1][j]==str.charAt(0) && !visited[i-1][j]) {
			visited[i-1][j]=true;
			int res=findString(str.substring(1), i-1, j, arr,visited);
			if(res==1)
				return 1;
			visited[i-1][j]=false;
		}
		if(helper(r,c,i-1,j+1) && arr[i-1][j+1]==str.charAt(0) && !visited[i-1][j+1]) {
			visited[i-1][j+1]=true;
			int res=findString(str.substring(1), i-1, j+1, arr,visited);
			if(res==1)
				return 1;
			visited[i-1][j+1]=false;
		}
		if(helper(r,c,i,j-1) && arr[i][j-1]==str.charAt(0) && !visited[i][j-1]) {
			visited[i][j-1]=true;
			int res=findString(str.substring(1), i, j-1, arr,visited);
			if(res==1)
				return 1;
			visited[i][j-1]=false;
		}
		if(helper(r,c,i,j+1) && arr[i][j+1]==str.charAt(0) && !visited[i][j+1]) {
			visited[i][j+1]=true;
			int res=findString(str.substring(1), i, j+1, arr,visited);
			if(res==1)
				return 1;
			visited[i][j+1]=false;
		}
		if(helper(r,c,i+1,j-1) && arr[i+1][j-1]==str.charAt(0) && !visited[i+1][j-1]) {
			visited[i+1][j-1]=true;
			int res=findString(str.substring(1), i+1, j-1, arr,visited);
			if(res==1)
				return 1;
			visited[i+1][j-1]=false;
		}
		if(helper(r,c,i+1,j) && arr[i+1][j]==str.charAt(0) && !visited[i+1][j]) {
			visited[i+1][j]=true;
			int res=findString(str.substring(1), i+1, j, arr, visited);
			if(res==1)
				return 1;
			visited[i+1][j]=false;
		}
		if(helper(r,c,i+1,j+1) && arr[i+1][j+1]==str.charAt(0) && !visited[i+1][j+1]) {
			visited[i+1][j+1]=true;
			int res=findString(str.substring(1), i+1, j+1, arr,visited);
			if(res==1)
				return 1;
			visited[i+1][j+1]=false;
		}
		return 0;
	}

}
/*
Sample input
1 11
AJNINGNIDOC
OP - 1

SAMPLE INPUT
2 11
CXDXNXNXNXA
XOXIXGXIXJX
OP - 1

SAMPLE INPUT
4 4
CANI
OOJN
DDIG
JNIN
OP -1 

SAMPLE INPUT
5 5
DANDO
NNINJ
AXGJC
INJAA
CODDI
OP - 0
  */
