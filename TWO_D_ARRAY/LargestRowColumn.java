package TWO_D_ARRAY;

public class LargestRowColumn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] mat= {{1,2},{90,100},{3,40},{-10,200}};
		findLargest(mat);

	}
	public static void findLargest(int mat[][]){
		//Your code goes here
        int row=mat.length;
        int max1=Integer.MIN_VALUE;
        int max2=Integer.MIN_VALUE;
        int rindex=-1;
        int cindex=-1;
        if(row==0){
            System.out.println("row 0 "+max1);
            return;
        }
        int col=mat[0].length;
        for(int i=0;i<row;i++){
            int sum=0;
            for(int j=0;j<col;j++){
                sum+=mat[i][j];
            }
            if(sum>max1){
                max1=sum;
                rindex=i;
            }
        }
       for(int i=0;i<col;i++){
           int sum=0;
            for(int j=0;j<row;j++){
                sum+=mat[j][i];
            }
            if(sum>max2){
                max2=sum;
                cindex=i;
            }
        } 
        if(max1>=max2){
            System.out.println("row "+rindex+" "+max1);
        }else{
            System.out.println("column "+cindex+" "+max2);
        }
	}


}

