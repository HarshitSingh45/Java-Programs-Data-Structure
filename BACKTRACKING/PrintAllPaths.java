package BACKTRACKING;

public class PrintAllPaths {

	public static void main(String[] args) {
//		int[][] maze= {{1,1,0},{1,1,0},{0,1,1}};
//		int[][] path= new int[3][3];
		int[][] maze= {{1,1},{1,1}};
		int[][] path= new int[2][2];
		isPathPresent(maze,path,0,0);

	}
	public static boolean isPathPresent(int[][] maze, int[][]path, int i, int j) {
		int n=maze.length-1;
		if(i<0 || i>n || j<0 || j>n || maze[i][j]==0 || path[i][j]==1) {
			return false;
		}
		path[i][j]=1;
		// destination return
		if(i==n && j==n) {
			System.out.println();
			System.out.println("      PATH");
			for(int r=0; r<=n; r++) {
				for(int c=0; c<=n; c++) {
					System.out.print(path[r][c]+" ");
				}
				System.out.println();
			}
			path[i][j]=0;
			return true;
		}
		// top
		if(isPathPresent(maze, path, i-1, j)) {
			path[i-1][j]=0;
			//return true;
		}
		// right
		if(isPathPresent(maze, path, i, j+1)) {
			path[i][j+1]=0;
			//return true;
		}
		// down
		if(isPathPresent(maze, path, i+1, j)) {
			path[i+1][j]=0;
			//return true;
		}
		// left
		if(isPathPresent(maze, path, i, j-1)) {
			path[i][j-1]=0;
			//return true;
		}
		return true;
	}

}
