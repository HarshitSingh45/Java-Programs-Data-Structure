package FUNDAMENTALS;
import java.util.Scanner;
public class Temparature {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int S= scan.nextInt();
		int E= scan.nextInt();
		int W= scan.nextInt();
		int c=0;
		while(S<=E) {
			c=((S-32)*5)/9;
			System.out.println(S+"\t"+c);
			S+=W;
		}

	}

}
