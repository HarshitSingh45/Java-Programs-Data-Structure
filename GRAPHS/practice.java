package GRAPHS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int e=s.nextInt();
		int[][] adjMat=new int [n][n];
//		for(int i=0;i<e;i++) {
//			int v1=s.nextInt();
//			int v2=s.nextInt();
//			adjMat[v1][v2]=1;
//			adjMat[v2][v1]=1;
//		}
//		//dfs(adjMat);
//		//bfs(adjMat);
//		int v1=s.nextInt();
//		int v2=s.nextInt();
//		//System.out.println(hasPathDfs(adjMat,v1,v2));
//		//System.out.println(hasPathBfs(adjMat,v1,v2));
//		boolean[] visited=new boolean[n];
//		ArrayList<Integer> arr=getpathBFS(adjMat,visited,v1,v2);
//		System.out.println(arr);
		/*  PRIMS ALGO
		for(int i=0;i<e;i++) {
			int v1=s.nextInt();
			int v2=s.nextInt();
			int wt=s.nextInt();
			adjMat[v1][v2]=wt;
			adjMat[v2][v1]=wt;
		}
		dijkstra(adjMat);
		prims(adjMat);
		*/
		/*    KRUSKAL ALGO
		Edge[] edges=new Edge[e];
		for(int i=0;i<e;i++) {
			int v1=s.nextInt();
			int v2=s.nextInt();
			int weight=s.nextInt();
			Edge edg=new Edge(v1,v2,weight);
			edges[i]=edg;
		}
		krushkal(edges,n);
		*/

	}

	private static void dfsTraversal(int[][] adjMat, boolean[] visited, int currVertex) {
		System.out.print(currVertex+" ");
		visited[currVertex]=true;
		for(int i=0;i<visited.length;i++) {
			if(adjMat[currVertex][i]>0 && !visited[i]) {
				dfsTraversal(adjMat, visited, i);
			}
		}
	}
	public static void dfs(int[][] adjMat) {
		boolean[] visited=new boolean[adjMat.length];
		for(int i=0;i<visited.length;i++) {
			if(!visited[i]) {
				dfsTraversal(adjMat, visited, i);
				System.out.println();
			}
		}
	}

	private static void bfsTraversal(int[][] adjMat, boolean visited[], int currVertex) {
		Queue<Integer> q=new LinkedList<>();
		visited[currVertex]=true;
		q.add(currVertex);
		while(!q.isEmpty()) {
			int cv=q.poll();
			System.out.print(cv+" ");
			for(int i=0;i<visited.length;i++) {
				if(adjMat[cv][i]>0 && !visited[i]) {
					q.add(i);
					visited[i]=true;
				}
			}
		}
		
	}
	public static void bfs(int[][] adjMat) {
		boolean [] visited=new boolean[adjMat.length];
		for(int i=0;i<visited.length;i++) {
			if(!visited[i]) {
				bfsTraversal(adjMat, visited, 0);
				System.out.println();
			}
		}
	}

	private static boolean hasPathDFS(int[][] adjMat, boolean[] visited, int v1, int v2) {
		if(v1==v2)
			return true;
		visited[v1]=true;
		for(int i=0;i<visited.length;i++) {
			if(adjMat[v1][i]>0 && !visited[i]) {
				boolean res= hasPathDFS(adjMat, visited, i, v2);
				if(res)
					return true;
			}
		}
		return false;
	}
	public static boolean hasPathDfs(int[][] adjMat,int v1, int v2) {
		boolean[] visited=new boolean[adjMat.length];
		return hasPathDFS(adjMat,visited,v1,v2);
		
	}

	private static boolean hasPathBFS(int[][] adjMat, boolean[] visited, int v1, int v2) {
		if(v1==v2)
			return true;
		Queue<Integer> q=new LinkedList<>();
		q.add(v1);
		visited[v1]=true;
		while(!q.isEmpty()) {
			int cv=q.poll();
			for(int i=0;i<visited.length;i++) {
				if(adjMat[cv][i]>0 && !visited[i]) {
					q.add(i);
					visited[i]=true;
					if(i==v2)
						return true;
				}
			}
		}
		return false;
	}
	public static boolean hasPathBfs(int[][] adjMat, int v1, int v2) {
		boolean[] visited=new boolean[adjMat.length];
		return hasPathBFS(adjMat,visited, v1,v2);
	}

	public static ArrayList<Integer> getpathDFS(int[][] adjMat, boolean[] visited, int v1, int v2){
		if(v1==v2) {
			ArrayList<Integer> result=new ArrayList<>();
			result.add(v1);
			return result;
		}
		visited[v1]=true;
		for(int i=0;i<visited.length;i++) {
			if(adjMat[v1][i]>0 && !visited[i]) {
				ArrayList<Integer> result=getpathDFS(adjMat, visited, i, v2);
				if(result!=null) {
					result.add(v1);
					return result;
				}
			}
		}
		return null;
	}
	public static ArrayList<Integer> getpathBFS(int[][] adjMat, boolean[] visited, int v1, int v2){
		ArrayList<Integer> result=new ArrayList<>();
		if(v1==v2) {
			result.add(v1);
			return result;
		}
		Queue<Integer> q=new LinkedList<>();
		q.add(v1);
		visited[v1]=true;
		HashMap<Integer, Integer> map=new HashMap<>();
		map.put(v1, -1);
		boolean pathfound=false;
		while(!q.isEmpty()) {
			int cv=q.poll();
			
			for(int i=0;i<visited.length;i++) {
				if(adjMat[cv][i]>0 && !visited[i]) {
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
			
			int cv=v2;
			while(cv!=-1) {
			result.add(cv);
			int pr=map.get(cv);
			cv=pr;
			}
		}
		return result;
	}

	public static void krushkal(Edge[] edges, int n) {
		Arrays.sort(edges);
		Edge[] op=new Edge[n-1];
		int[] parent=new int[n];
		for(int i=0;i<n;i++) {
			parent[i]=i;
		}
		int i=0;
		int count=0;
		while(count!=n-1) {
			Edge currEdge=edges[i++];
			int p1=findParent(currEdge.v1,parent);
			int p2=findParent(currEdge.v2,parent);
			if(p1!=p2) {
				op[count]=currEdge;
				count++;
				parent[currEdge.v1]=p2;
			}
		}
		for(int j=0;j<n-1;j++) {
			Edge e=op[j];
			System.out.println(e.v1+" "+e.v2+" "+e.weight);
		}
	}
	public static int findParent(int v, int[] parent) {
		if(v==parent[v])
			return v;
		return findParent(parent[v], parent);
	}

	public static void prims(int[][] adjMat) {
		int n=adjMat.length;
		boolean[] visited=new boolean[n];
		int[] parent=new int[n];
		int[] weight=new int[n];
		parent[0]=-1;
		weight[0]=0;
		for(int i=1;i<n;i++) {
			weight[i]=Integer.MAX_VALUE;
		}
		for(int i=0;i<n;i++) {
			int cv=findminvertex(visited,weight);
			if(cv==-1)
				break;
			visited[cv]=true;
			for(int j=0;j<n;j++) {
				if(adjMat[cv][j]>0 && !visited[j]) {
					if(weight[j]>adjMat[cv][j]) {
						weight[j]=adjMat[cv][j];
						parent[j]=cv;
					}
				}
			}
		}
		for(int i=1;i<n;i++) {
			System.out.println(parent[i]+" "+i+" "+weight[i]);
		}
	}	
	public static int findminvertex(boolean[] visited, int[] weight) {
		int index=-1;
		int min=Integer.MAX_VALUE;
		for(int i=0;i<visited.length;i++) {
			if(!visited[i] && weight[i]<min) {
				index=i;
				min=weight[i];
			}
		}
		return index;
	}
	public static void dijkstra(int[][] adjMat) {
		int n=adjMat.length;
		boolean[] visited=new boolean[n];
		int[] distance=new int[n];
		distance[0]=0;
		for(int i=1;i<n;i++) {
			distance[i]=Integer.MAX_VALUE;
		}
		for(int i=0;i<n;i++) {
			int cv=findminvertex(visited, distance);
			visited[cv]=true;
			for(int j=0;j<n;j++) {
				if(adjMat[cv][j]>0 && !visited[j]) {
					int wt=distance[cv]+adjMat[cv][j];
					if(wt<distance[j]) {
						distance[j]=wt;
					}
				}
			}
		}
		for(int i=0;i<n;i++) {
			System.out.println(i+" "+distance[i]);
		}
	}
}

