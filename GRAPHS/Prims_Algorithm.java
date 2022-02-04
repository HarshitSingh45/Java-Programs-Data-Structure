package GRAPHS;

import java.util.Scanner;
/* 
 * Sample input 1
3 3
1 2 6
2 0 2
1 0 2

Sample input 2
4 4
1 2 6
2 3 2
1 3 2
1 0 2

Sample input 3
4 4
0 1 3
0 3 5
1 2 1
2 3 8
 */
public class Prims_Algorithm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int e=s.nextInt();
		// take input & create adjacency matrix
		int[][] adjMat=new int[n][n];
		for(int k=0;k<e;k++) {
			int v1=s.nextInt();
			int v2=s.nextInt();
			int wt=s.nextInt();
			adjMat[v1][v2]=wt;
			adjMat[v2][v1]=wt;

		}
		primAlgo(adjMat,n);

	}
	public static void primAlgo(int adjMat[][], int n) {
		boolean visited[]=new boolean[n];
		int parent[]=new int[n];
		int weight[]=new int[n];
		for(int i=0;i<n;i++) {
			if(i==0) {
				weight[0]=0;
			}else {
				weight[i]=Integer.MAX_VALUE;
			}
		}
		//visited[0]=true;
		parent[0]=-1;

		for(int i=0; i<n; i++) {
			int minVertex=findMinVertex(weight,visited);
			if(minVertex==-1) {
				break;
			}
			visited[minVertex]=true;
			for(int j=0; j<n;j++) {
				if(adjMat[minVertex][j]>0 && !visited[j]) {
					int weigh=adjMat[minVertex][j];
					int nodeWeight=weight[j];
					if(weigh<nodeWeight) {
						weight[j]=weigh;
						parent[j]=minVertex;
					}
				}
			}
		}
		for(int i=1;i<n;i++) {
			int prt=parent[i];
			int wet=weight[i];
			if(prt<i) {
				System.out.println(prt+" "+i+" "+wet);
			}else {
				System.out.println(i+" "+prt+" "+wet);
			}
		}
	}
	private static int findMinVertex(int weight[], boolean visited[]) {
		int n=weight.length;
		int index=-1;
		int minWeight=Integer.MAX_VALUE;
		for(int i=0;i<n;i++) {
			if(!visited[i] && weight[i]<minWeight) {
				index=i;
				minWeight=weight[i];
			}
		}
		return index;
	}

}
