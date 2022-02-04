package GRAPHS;

import java.util.Scanner;

public class Three_Cycle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int e=s.nextInt();
		int[][] adjMat=new int[n][n];
		for(int i=0;i<e;i++) {
			int v1=s.nextInt();
			int v2=s.nextInt();
			adjMat[v1][v2]=1;
			adjMat[v2][v1]=1;
		}
		System.out.println(find3cycle(n,adjMat));

	}
	public static int find3cycle(int n, int[][] arr) {
		int count = 0;
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                if (i != j && arr[i][j]==1)
                {
                    for (int k = 0; k < n; k++)
                    {
                        if (j != k && k != i && arr[j][k]==1)
                        {
                            if (arr[i][k] == 1)
                            {
                                count += 1;
                            }
                        }
                    }
                }
            }
        }
        return count/6;
	}
//	public static int find3cycle(int n, int[][] adjMat) {
//		boolean[] visited=new boolean[n];
//		int count=0;
//		for(int i=0;i<n;i++) {
//			count+=findcycle(i,i,n,visited,adjMat,3);
////			visited[i]=true;
//		}
//		return count;
//	}
//	public static int findcycle(int st,int cv, int n, boolean[] visited, int[][] adjMat, int len) {
//		if(len==1) {
//			for(int i=0;i<n;i++) {
//				if(adjMat[cv][i]==st)
//					return 1;
//			}
//		}
//		int count=0;
//		for(int i=0;i<n && i!=st;i++) {
//			if(!visited[i] && adjMat[cv][i]>0) {
//				count+=findcycle(st, i, n, visited, adjMat, len-1);
//			}
//		}
//		return count;
//	}
	

}
