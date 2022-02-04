package RECURSION;

import java.util.Scanner;

public class NumberOfDigits {

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Scanner s=new Scanner(System.in);
//		int n=s.nextInt();
//		int z=1;
//		String str="";
//		char ch=Integer.to
//		System.out.println(z/100);
//		System.out.println(digit(n));
//
//	}
//	public static int digit(int n) {
//		if(n==0)
//			return 0;
//		int result=1+digit(n/10);
//		return result;
//	}
//	import java.io.*;
//	 
//	class GFG {
	 
	    static int josephus(int n, int k)
	    {
	        if (n == 1)
	            return 1;
	        else
	            /* The position returned by josephus(n - 1, k)
	            is adjusted because the recursive call
	            josephus(n - 1, k) considers the original
	            position k%n + 1 as position 1 */
	            return (josephus(n - 1, k) + k - 1) % n + 1;
	    }
	 
	    // Driver Program to test above function
	    public static void main(String[] args)
	    {
	        int n = 50;
	        int k = 10;
	        System.out.println("The chosen place is "
	                           + josephus(n, k));
	    }
	}

//}
