package FUNDAMENTALS;
import java.lang.Math;
import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=1;
				int x=1;
//		 if(n==1&&x==1){
//	            int result=50;
//	            return result;
//	        }
//	        else if(n==2&&x==1){
//	            int result=57;
//	            return result;
//	        }
//	        else if(n==4&&x==2){
//	            int result=51;
//	            //return result;
//	        }
	      //  else{
	           // double pro=x/n;
	           // int result=(int)(pro*100);
	            
	        // double prored=4.0/8;
	        // double notred=1-prored;
	        // double pro=1.0;
	         double nfact=fact(n);
	         double rfact=fact(x);
	         double difact=fact(n-x);
	         double ncr=nfact/(rfact*difact);
	            double pro=ncr*(Math.pow(2,n));
	        // double facto=fact(4);
	        // double facti=fact(x);
	        // double factor=fact(4-x);
	        // double des=facto/(facti*factor);
	        // pro=des/ncr;
	        int result=(int)pro*100;
	        System.out.println(result);;
	        }
	//}
	public static double fact(int n){
        double pro=1.0;
		while(n>0) {
			pro=pro*n;
			n--;
		}
		return pro;
    }

    }



