package FUNDAMENTALS;
import java.util.Scanner;
public class DecimalToBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
        int n= scan.nextInt();
        long ans=0;
        int pv=1;
         while(n>0){
             int rem=n%2;
             ans+=rem*pv;
             n/=2;
             pv*=10;
           
         }
        System.out.println(ans);
		

	}

}
