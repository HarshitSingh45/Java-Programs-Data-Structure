package FUNDAMENTALS;
import java.util.Scanner;
public class Average {


	public static void main(String[] args) {

		/* Your class should be named Solution.
		 * Read input as specified in the question.
		 * Print output as specified in the question.
		 */
		Scanner scan=new Scanner(System.in);

		String name=scan.next();
		System.out.println();
		char name1=name.charAt(0);
		scan.nextLine();


		String marks=scan.nextLine();
		String[] num=marks.split(" ");
		int m1=Integer.parseInt(num[0]);
		int m2=Integer.parseInt(num[1]);
		int m3=Integer.parseInt(num[2]);
		int avg=(m1+m2+m3)/3;
		System.out.println(name1);
		System.out.println(avg);



	}

}
