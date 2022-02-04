package FUNDAMENTALS;
import java.util.Scanner;
import java.lang.Math;
public class Salary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int basic= scan.nextInt();
		char grade=scan.next().charAt(0);
		double hra=0.2*basic;
		double da=0.5*basic;
		double pf=0.11*basic;
		int allow=0;
		if(grade=='A'){
			allow=1700;
		}
		else if(grade=='B'){
			allow=1500;
		}
		else{
			allow=1300;
		}

		double totalSalary=basic+hra+da+allow-pf;
		System.out.println(Math.round(totalSalary));
	}

}
