package BACKTRACKING;

public class Rat_In_A_Maze {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] maze= {{1,1,0},{1,1,0},{1,1,1}};
		int[][] path= new int[3][3];
		System.out.println(isPathPresent(maze,path,0,0));

	}
	public static boolean isPathPresent(int[][]maze, int[][]path, int i, int j) {
		int n=maze.length-1;
		if(i<0 || i>n || j<0 || j>n || maze[i][j]==0 || path[i][j]==1) {
			return false;
		}
		path[i][j]=1;
		// destination return
		if(i==n && j==n) {
			return true;
		}
		// top
		if(isPathPresent(maze, path, i-1, j)) {
			return true;
		}
		// right
		if(isPathPresent(maze, path, i, j+1)) {
			return true;
		}
		// down
		if(isPathPresent(maze, path, i+1, j)) {
			return true;
		}
		// left
		if(isPathPresent(maze, path, i, j-1)) {
			return true;
		}
		return false;
	}

}
