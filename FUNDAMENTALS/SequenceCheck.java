package FUNDAMENTALS;

import java.util.Scanner;

public class SequenceCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int prev=scan.nextInt();
		boolean isDec=true;
		int count=0;
		for(int i=1; i<=n-1; i++) {
			int curr=scan.nextInt();
			if(curr==prev) {
				System.out.println("False");
				count=1;
				break;
			}
			else if(curr>prev) {
				isDec=false;
				prev=curr;	
				continue;
			}
			else {
				if(isDec==false) {
					System.out.println("False");
					count=1;
					break;
				}
				else {
					prev=curr;
				}
			}
		}
		if(count==0) {
			System.out.println("True");
		}

	}

}
