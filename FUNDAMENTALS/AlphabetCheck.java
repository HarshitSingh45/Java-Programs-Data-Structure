package FUNDAMENTALS;
import java.util.Scanner;
public class AlphabetCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Scanner scan= new Scanner(System.in);
        char ch= scan.next().charAt(0);
       
        if (ch >= 'A' && ch <= 'Z') {
            System.out.println("1");
        }
     
        else if (ch >= 'a' && ch <= 'z') {
            System.out.println("-1" );
        }
     
        else {
            System.out.println("0" );
        }

	}

}
