package DYNAMIC_PROGRAMMING;

import java.util.Scanner;

public class MinimumSquaresToRepresentN {

	public static int minSquares(int n) {
		if(n==0)
			return 0;
		if(n==1)
			return 1;
		int min = Integer.MAX_VALUE;
		for(int i=1; i*i<=n; i++) {
			int res;
			res=minSquares(n-(i*i));
			if(res<min)
				min=res;
		}
		return min+1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		//int[] dp=new int[n+1];
		System.out.println(minSquares(n));

	}

}
