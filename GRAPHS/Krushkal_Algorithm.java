package GRAPHS;

import java.util.Scanner;
import java.util.Arrays;

class Edge implements Comparable<Edge>{
	int v1;
	int v2;
	int weight;
	public Edge(int v1, int v2, int weight) {
		this.v1=v1;
		this.v2=v2;
		this.weight=weight;
	}
	public int compareTo(Edge edg) {
		return this.weight - edg.weight;
	}
}
public class Krushkal_Algorithm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		int e=s.nextInt();
		Edge[] ip=new Edge[e];
		for(int i=0;i<e;i++) {
			int v1=s.nextInt();
			int v2=s.nextInt();
			int weight=s.nextInt();
			Edge edg=new Edge(v1,v2,weight);
			ip[i]=edg;
		}
		Edge[] op=krushkalAlgorithm(ip, n);
//		Arrays.sort(ip);
//		int[] parent=new int[n];
//		Edge[] op=new Edge[n-1];
//		for(int i=0;i<n;i++) {
//			parent[i]=i;
//		}
//		int count=0;
//		int i=0;
//		int j=0;
//		while(count!=n-1) {
//			Edge currEdge=ip[i];
//			int v1=currEdge.v1;
//			int v2=currEdge.v2;
//			int v1p=findParent(v1,parent);
//			int v2p=findParent(v2, parent);
//			if(v1p!=v2p) {
//				count++;
//				parent[v1]=v2p; //check
//				op[j]=currEdge;
//				j++;
//			}
//			i++;
//		}
		for(Edge k:op) {
			if(k.v1<k.v2) {
				System.out.println(k.v1+" "+k.v2+" "+k.weight);
			}else {
				System.out.println(k.v2+" "+k.v1+" "+k.weight);
			}
		}
		

	}
	private static int findParent(int v, int[] parent) {
		if(v==parent[v])
			return v;
		return findParent(parent[v], parent);
	}
	public static Edge[] krushkalAlgorithm(Edge ip[], int n) {
		Arrays.sort(ip);
		int[] parent=new int[n];
		Edge[] op=new Edge[n-1];
		for(int i=0;i<n;i++) {
			parent[i]=i;
		}
		int count=0;
		int i=0;
		while(count!=n-1) {
			Edge currEdge=ip[i++];
			int v1=currEdge.v1;
			int v2=currEdge.v2;
			int v1p=findParent(v1,parent);
			int v2p=findParent(v2, parent);
			if(v1p!=v2p) {
				op[count]=currEdge;
				count++;
				parent[v1]=v2p; //check
			}
		}
		return op; 
	}

}
/*
SAMPLE INPUT 1
4 4
0 1 3
0 3 5
1 2 1
2 3 8


*/
