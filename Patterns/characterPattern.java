package Patterns;
import java.util.Scanner;
public class characterPattern {
	public static void main(String[] args) {
		/* PRINT
		 A
		 BB
		 CCC*/
		Scanner scan= new Scanner(System.in);
        int n= scan.nextInt();
        int i=1;
        while(i<=n){
            int j=1;
            char p=(char)('A'+i-1);
            while(j<=i){
                System.out.print(p);
                j++;
            }
            System.out.println();
            i++;
        }
        
        /* ABCD
         * BCDE
         * CDEF
         * DEFG
         */
        int n1= scan.nextInt();
        int a=1;
        while(a<=n1){
            int j=1;
            char ch=(char)('A'+a-1);
            while(j<=a){
            	
                System.out.print(ch);
                ch=(char)(ch+1);
                j++;
            }
            System.out.println();
            a++;
        }


	}
}
