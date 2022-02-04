package GRAPHS;

import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.HashMap;

//0 1 2 4 3 6 5 7 
//8 9 
//0 1 3 5 2 4 6 7 
//8 9 
public class graphpractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
//		int n=s.nextInt();
//		int e=s.nextInt();
//		int[][] adjmat=new int[n][n];
//		for(int i=0;i<e;i++) {
//			int v1=s.nextInt();
//			int v2=s.nextInt();
//			adjmat[v1][v2]=1;
//			adjmat[v2][v1]=1;
//		}

//		dfs(adjmat);
//		bfs(adjmat);
//		boolean[] visited=new boolean[adjmat.length];
//		System.out.println(haspathbfs(adjmat,visited, 0, 9));
//		System.out.println(getpathbfs(adjmat, visited, 0, 7));
//		System.out.println(numofcomponents(adjmat));
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
		System.out.println(codingninja(arr));

	}


	public static void dfs(int[][] adjmat) {
		boolean[] visited=new boolean[adjmat.length];
		for(int i=0;i<visited.length;i++) {
			if(!visited[i]) {
				dfstraversal(adjmat,visited,i);
				System.out.println();
			}
		}
	}
	public static void dfstraversal(int[][] adjmat, boolean[]visited, int currvertex) {
		visited[currvertex]=true;
		System.out.print(currvertex+" ");
		for(int i=0;i<adjmat.length;i++) {
			if(adjmat[currvertex][i]>0 && !visited[i]) {
				dfstraversal(adjmat, visited, i);
			}
		}
	}
	public static void bfs(int[][] adjmat) {
		boolean[] visited=new boolean[adjmat.length];
		for(int i=0;i<visited.length;i++) {
			if(!visited[i]) {
				bfstraversal(adjmat,visited,i);
				System.out.println();
			}
		}
	}
	public static void bfstraversal(int[][] adjmat, boolean[] visited, int currvertex) {
		Queue<Integer> q=new LinkedList<Integer>();
		q.add(currvertex);
		visited[currvertex]=true;
		while(!q.isEmpty()) {
			int vertex=q.poll();
			System.out.print(vertex+" ");
			for(int i=0;i<adjmat.length;i++) {
				if(adjmat[vertex][i]>0 && !visited[i]) {
					q.add(i);
					visited[i]=true;
				}
			}
		}	
	}
	public static boolean haspathdfs(int[][]adjmat, boolean[]visited, int v1, int v2) {
		if(v1==v2)
			return true;
		visited[v1]=true;
		for(int i=0;i<visited.length;i++) {
			if(adjmat[v1][i]>0 && !visited[i]) {
				boolean res=haspathdfs(adjmat, visited, i, v2);
				if(res)
					return true;
			}
		}
		return false;
	}
	public static boolean haspathbfs(int[][]adjmat, boolean[] visited, int v1, int v2) {
		if(v1==v2)
			return true;
		Queue<Integer> q=new LinkedList<Integer>();
		q.add(v1);
		visited[v1]=true;
		while(!q.isEmpty()) {
			int ver=q.poll();
			for(int i=0;i<visited.length;i++) {
				if(adjmat[ver][i]>0 && !visited[i]) {
					if(i==v2)
						return true;
					q.add(i);
					visited[i]=true;
				}
			}
		}
		return false;
	}
	public static ArrayList<Integer> getpathdfs(int[][]adjmat, boolean[] visited, int v1, int v2){
		if(v1==v2) {
			ArrayList<Integer> arr=new ArrayList<Integer>();
			arr.add(v2);
			return arr;
		}
		visited[v1]=true;
		for(int i=0;i<visited.length;i++) {
			if(adjmat[v1][i]>0 && !visited[i]) {
				ArrayList<Integer> arr=getpathdfs(adjmat, visited, i, v2);
				if(arr!=null) {
					arr.add(v1);
					return arr;
				}
			}
		}
		return null;
	}
	public static ArrayList<Integer> getpathbfs(int[][]adjmat, boolean[] visited, int v1, int v2){
		if(v1==v2) {
			ArrayList<Integer> arr=new ArrayList<Integer>();
			arr.add(v1);
			return arr;
		}
		Queue<Integer> q=new LinkedList<Integer>();
		q.add(v1);
		visited[v1]=true;
		HashMap<Integer, Integer> map=new HashMap<Integer, Integer>();
		map.put(v1, -1);
		boolean pathfound=false;
		while(!q.isEmpty()) {
			int cv=q.poll();
			for(int i=0;i<visited.length;i++) {
				if(adjmat[cv][i]>0 && !visited[i]) {
					q.add(i);
					visited[i]=true;
					map.put(i, cv);
					if(i==v2) {
						pathfound=true;
						break;
					}
				}
			}
		}
		if(pathfound) {
			ArrayList<Integer> arr=new ArrayList<Integer>();
			int prt;
			int cv=v2;
			arr.add(v2);
			while(cv!=-1) {
				prt=map.get(cv);
				arr.add(prt);
				cv=prt;
				
			}
			return arr;
		}
		return null;
	}
	public static int numofcomponents(int[][] adjmat) {
		boolean[] visited=new boolean[adjmat.length];
		int count=0;
		for(int i=0;i<adjmat.length;i++) {
			if(!visited[i]) {
				dfstraversal(adjmat, visited, i);
				System.out.println();
				count++;
			}
		}
		return count;
	}
	
	public static boolean codingninja(char[][] arr) {
		int n=arr.length;
		boolean[][] visited=new boolean[n][arr[0].length];
		for(int i=0;i<n;i++) {
			for(int j=0;j<arr[0].length;j++) {
				if(arr[i][j]=='C') {
					boolean res=findword(arr,visited,"ODINGNINJA",i,j);
					if(res)
						return true;
					else
						visited[i][j]=false;
				}
			}
		}
		return false;
	}
	public static boolean findword(char[][] arr, boolean[][] visited, String str,int i,int j) {
		if(str.length()==0)
			return true;
		visited[i][j]=true;
		int[] dx= {-1,-1,-1,0,0,1,1,1};
		int[] dy= {-1,0,1,-1,1,-1,0,1};
		for(int k=0;k<8;k++) {
			int x=i+dx[k];
			int y=j+dy[k];
			boolean valid = isvalid(x,y,arr.length,arr[0].length);
			if(valid && arr[x][y]==str.charAt(0) && !visited[x][y]) {
				boolean res=findword(arr, visited, str.substring(1), x, y);
				if(res)
					return true;
				visited[x][y]=false;
			}
		}
		return false;
	}
	public static boolean isvalid(int i, int j, int r, int c) {
		if(i<0 || j<0 || i>=r || j>=c) {
			return false;
		}
		return true;
	}
	public static boolean findcycle(char[][] arr) {
		boolean[][] visited=new boolean[arr.length][arr[0].length];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				if(arr[i][j]==)
			}
		}
	}
}
