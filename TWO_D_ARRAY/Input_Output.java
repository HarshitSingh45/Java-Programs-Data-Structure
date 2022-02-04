package TWO_D_ARRAY;

import java.util.Scanner;

public class Input_Output {
	public static void main(String[] args) {
		
		int[][] arr=takeInput();
		printArray(arr);
	}
	public static int[][] takeInput(){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the no of rows");
		int row=s.nextInt();
		System.out.println("Enter the no of columns");
		int col=s.nextInt();
		int[][] arr=new int[row][col];
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.println("Enter "+ i+"th row "+j+"th col element");
				arr[i][j]=s.nextInt();
			}
		}
		return arr;
	}
	public static void printArray(int[][] arr) {
		int n=arr.length;
		int m=arr[0].length;
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}

}
