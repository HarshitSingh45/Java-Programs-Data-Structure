package Patterns;
import java.util.Scanner;
public class InvertedTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int n= scan.nextInt();
//		****
//		***
//		**
//		*
//		int i=n;
//		while(i>=1) {
//			int j=i;
//			while(j>=1) {
//				System.out.print("*");
//				j--;
//			}
//			System.out.println();
//			i--;
//		}
		int i=1;
		while(i<=n) {
			int j=1;
			while(j<=n-i+1) {
				System.out.print("*");
				j++;
			}
			System.out.println();
			i++;
		}
		
//		4444
//		333
//		22
//		1
		

	        int nn= scan.nextInt();
	        int ii=1;
	        while(ii<=nn){
	            int j=1;
	            int p=nn-ii+1;
	            while(j<=p){
	                System.out.print(p);
	                j++;
	            }
	            System.out.println();
	            ii++;
	        }


	}

}
