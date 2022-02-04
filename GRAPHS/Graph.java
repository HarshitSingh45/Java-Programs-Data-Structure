package GRAPHS;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;

public class Graph {

	static ArrayList<Integer> result=new ArrayList<>();
	public static void main(String[] args) {
		Scanner s= new Scanner (System.in);
		int n=s.nextInt();
		int e= s.nextInt();
		if(e==0) {
			for(int i=0;i<n;i++) {
				System.out.print(i+" ");
			}
			return;
		}
		int[][] adjMat=new int[n][n];
		for(int i=0; i<e; i++) {
			int v1= s.nextInt();
			int v2=s.nextInt();
			adjMat[v1][v2]=1;
			adjMat[v2][v1]=1;
		}
		boolean[] visited=new boolean[adjMat.length];
		//result=getPathDFS(0, 3, adjMat, visited);
		result=getPathBFS(0, 3, adjMat, visited);
		for(int i=result.size()-1;i>=0;i--) {
			System.out.print(result.get(i)+" ");
		}
		//		for(int i=0;i<n;i++) {
		//			for(int j=0;j<n;j++) {
		//				System.out.print(adjMat[i][j]+" "); 6 5 0 1 0 2 0 3 1 4 2 5
		//			} 014253
		//			System.out.println();
		//		}
		//		dfTraversal(adjMat);
		//		System.out.println();
		//		bfTraversal(adjMat); 
	}
	public static void dfTraversal(int[][] adjMat, int currVertex, boolean[] visited) {
		System.out.print(currVertex+" ");
		visited[currVertex]=true;
		for(int i=0;i<adjMat.length; i++) {
			if(adjMat[currVertex][i]==1 && visited[i]==false) {
				dfTraversal(adjMat, i,visited);
			}
		}
	}
	public static void dfTraversal(int[][] adjMat) {
		boolean[] visited=new boolean[adjMat.length];
		for(int i=0;i<adjMat.length;i++) {
			if(!visited[i])
				dfTraversal(adjMat,i,visited);
		}
	}

	public static void bfTraversal(int[][] adjMat) {
		Queue<Integer> pendingVertices= new LinkedList<>();
		boolean[] visited=new boolean[adjMat.length];
		visited[0]=true;
		pendingVertices.add(0);

		while(!pendingVertices.isEmpty()) {
			int currVertex=pendingVertices.poll();
			System.out.print(currVertex+" ");

			for(int i=0;i<adjMat.length;i++) {
				if(adjMat[currVertex][i]==1 && visited[i]==false) {
					pendingVertices.add(i);
					visited[i]=true;
				}
			}
		}
		for(int i=0;i<adjMat.length;i++) {
			if(visited[i]==false) {
				System.out.print(i+" ");
			}
		}
	}

	public static ArrayList<Integer> getPathBFS(int s, int e, int[][] adjMat, boolean[] visited){
		Queue<Integer> pendingVertices=new LinkedList<>();
		visited[s]=true;
		HashMap<Integer, Integer> map=new HashMap<>();
		map.put(s, -1);
		pendingVertices.add(s);
		ArrayList<Integer> result=new ArrayList<Integer>();
		if(s==e) {
			result.add(s);
			return result;
		}
		boolean pathFound=false;
		while(!pendingVertices.isEmpty()) {
			int currVertex=pendingVertices.poll();
			for(int i=0;i<adjMat.length;i++) {
				if(adjMat[currVertex][i]==1 && visited[i]==false) {
					pendingVertices.add(i);
					visited[i]=true;
					map.put(i, currVertex);
					if(i==e) {
						pathFound=true;
						break;
					}

				}
			}
		}
		if(pathFound) {
			int currVertex=e;
			while(currVertex!=-1) {
				result.add(currVertex);
				int parent=map.get(currVertex);
				currVertex=parent;
			}
		}
		return result;
	}
	public static ArrayList<Integer> getPathDFS(int s, int e, int[][] adjMat, boolean[] visited) {
		if(s==e) {
			ArrayList<Integer> res=new ArrayList<Integer>();
			res.add(e);
			return res;
		}
		visited[s]=true;
		for(int i=0;i<adjMat.length;i++) {
			if(adjMat[s][i]==1 && visited[i]==false) {
				ArrayList<Integer> res=getPathDFS(i, e, adjMat, visited);
				if(res!=null) {
					res.add(s);
					return res;
				}
			}
		}
		return null;
	}
}
