package BACKTRACKING;

public class check {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] maze= {{1,0,1},{1,1,1},{1,0,1}};
	//	int[][] path= new int[3][3];
		ratInAMaze(maze, 3);

	}
	static void ratInAMaze(int maze[][], int n) {
		/* 
			* Your class should be named Solution.
			* Write your code here
		 */
        int[][] path=new int[4][4];
        printNqueen(path,0);

	}
	public static void printNqueen(int[][] arr, int row) {
		for(int i=0; i<arr.length; i++) {
			if(row>0 && i>0 && i<arr.length-1) {
				if(arr[row-1][i-1]==1 || arr[row-1][i+1]==1)
					continue;
			}
			if(row!=0 && i==arr.length-1) {
				if(arr[row-1][i-1]==1)
					continue;
			}
			if(row!=0 && i==0) {
				if(arr[row-1][i+1]==1)
					continue;
			}
			int flag=0;
			for(int r=0;r<arr.length; r++) {
				if(arr[r][i]==1)
					flag=1;
			}
			if(flag==1)
				continue;
			arr[row][i]=1;
			if(row==arr.length-1) {
				System.out.println("   N-Queen Matrix");
				printArray(arr);
				System.out.println();
				arr[row][i]=0;
				return;
			}
			printNqueen(arr, row+1);
			arr[row][i]=0;
		}
	}
	public static void printArray(int[][] arr) {
		for(int i=0;i<arr.length; i++) {
			for(int j=0;j<arr.length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
