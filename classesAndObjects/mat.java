package classesAndObjects;

public class mat {
int [][] matrix;
int row=0;
int column=0;
	
	mat(int [][] mat)
	{
		matrix=mat;
		row=mat.length;
		column=mat[0].length;
	}
		
	
	    public static mat add(mat a,mat b)
	    {
	    	int[][] m3=new int[a.row][a.column];
	    	mat mat3=new mat(m3);
	    	int i=0,j=0;
			if (a.row != b.row || a.column != b.column)
			{
				return mat3;
			}
			else {
				for (i = 0; i < a.row; i++)
				{
					for (j = 0; j < a.column; j++)
					{
						mat3.matrix[i][j] = a.matrix[i][j] + b.matrix[i][j];
					}
				}
				return mat3;
			}
	      
	    }
	    public static mat multiply(mat a,mat b)
	    {
	    	int[][] m3=new int[a.row][b.column];
	    	mat mat3=new mat(m3);
	    	int i=0,j=0,k=0;
	    	if(b.row!=a.column) {
	    		return mat3;
	    	}
	    	for(i=0;i<a.row;i++) {
	    		for(j=0;j<b.column;j++) {
	    			for(k=0;k<b.row;k++) {
	    				mat3.matrix[i][j]+=a.matrix[i][k]*b.matrix[k][j];
	    			}
	    		}
	    	}
	    	return mat3;
	    }
	    public static mat transpose(mat m)
	    {
	    	int[][] m3=new int[m.column][m.row];
	    	mat mat3=new mat(m3);
	    	int i=0,j=0;
	    	for(i=0;i<m.row;i++) {
	    		for(j=0;j<m.column;j++) {
	    			mat3.matrix[j][i]=m.matrix[i][j];
	    		}
	    	}
	    	return mat3;
	    }
	    public static mat rotate(mat m)
	    {
	    	int[][] m3=new int[m.row][m.column];
	    	mat mat3=new mat(m3);
	    	int x=0,y=0;
	    	for(x=0;x<m.row/2;x++) {
	    		for(y=x;y<m.row-x-1;y++) {
	    			int temp=m.matrix[x][y];
	    			m.matrix[x][y]=m.matrix[y][m.row-1-x];
	    			m.matrix[y][m.row-1-x]=m.matrix[m.row-1-x][m.row-1-y];
	    			m.matrix[m.row-1-x][m.row-1-y]=m.matrix[m.row-1-y][x];
	    			m.matrix[m.row-1-y][x]=temp;
	    		}
	    	}
	    	//mat3.matrix=m.matrix;
	    	return m;
	    }
	    public  void print()
	    {
	        for(int i=0;i<matrix.length;i++)
	        {
	            for(int j=0;j<matrix[0].length;j++)
	            {
	                System.out.print(matrix[i][j]+" ");
	            }
	            System.out.println();
	        }
	    }

}
