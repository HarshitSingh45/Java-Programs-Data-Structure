package ARRAY;

import java.util.Scanner;
public class InputOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s =new Scanner(System.in);
		int n=s.nextInt();
		int[] arr=new int[n];
		for(int i=0; i<n; i++) {
			System.out.println("ENTER THE "+i+"th INDEX ELEMENT");
			arr[i]=s.nextInt();
		}
		for(int i=0; i<n; i++) {
			System.out.println(arr[i]);
			//arr[i]=s.nextInt();
		}
		
		

	}

}
