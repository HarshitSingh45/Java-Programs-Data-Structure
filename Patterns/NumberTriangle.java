package Patterns;

import java.util.Scanner;

public class NumberTriangle {
	public static void main(String[] args) {
//	     1
//	    232
//	   34543
//	  4567654
//	 567898765
		Scanner scan=new Scanner(System.in);
		int n= scan.nextInt();
		int i=1;
		int h=0;
		int temp=0;

		while(i<=n){
			int sp=1;
			while(sp<=n-i){
				System.out.print(" ");
				sp++;
			}
			int num=1;
			int p=i;
			while(num<=i) {
				System.out.print(p);
				p++;
				temp=p;
				num++;
			}
			int ne=1;
			int tem=temp-2;
			while(ne<=i-1) {
				System.out.print(tem);
				tem--;
				ne++;
			}
			System.out.println();
			i++;
		}
	}

}
