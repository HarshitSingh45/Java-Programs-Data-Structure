package GRAPHS;

import java.util.Scanner;
/* Smaple input 1
4 4
0 1 3
0 3 5
1 2 1
2 3 8

Sample input 2
3 3
1 2 6
2 0 2
1 0 2

Sample input 3
4 4
1 2 6
2 3 2
1 3 2
1 0 2
*/
public class Dijkstra_Algorithm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		int e=s.nextInt();
		int[][] adjMat=new int[n][n];
		for(int i=0;i<e;i++) {
			int v1=s.nextInt();
			int v2=s.nextInt();
			int wt=s.nextInt();
			adjMat[v1][v2]=wt;
			adjMat[v2][v1]=wt;		
		}
		dijkstra(adjMat,n);
	}
	public static void dijkstra(int adjMat[][], int n) {
		boolean visited[]= new boolean[n];
		int[] distance=new int[n];
		distance[0]=0;
		for(int i=1;i<n;i++) {
			distance[i]=Integer.MAX_VALUE;
		}
		for(int i=0;i<n;i++) {
			int currVertex=findMinVertex(visited,distance);
			visited[currVertex]=true;
			for(int j=0;j<n;j++) {
				if(adjMat[currVertex][j]>0 && !visited[j]) {
					int dist=distance[currVertex]+adjMat[currVertex][j];
					if(dist<distance[j]) {
						distance[j]=dist;
					}
				}
			}
		}
		for(int i=0;i<n;i++) {
			System.out.println(i+" "+distance[i]);
		}
	}
	private static int findMinVertex(boolean[] visited,int[] distance) {
		int index=-1;
		int min=Integer.MAX_VALUE;
		for(int i=0;i<visited.length;i++) {
			if(!visited[i] && distance[i]<min) {
				index=i;
				min=distance[i];
			}
		}
		return index;
	}

}
