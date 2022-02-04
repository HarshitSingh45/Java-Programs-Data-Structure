package STRINGS;

import java.util.Scanner;

public class NumberOfWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s =new Scanner(System.in);
		String str=s.nextLine();
		int n=numOfWords(str);
		System.out.println(n);

	}
	public static int numOfWords(String str) {
		int count=0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==' ') {
				count++;
			}
		}
		if(str.length()==0&&count==0){
			return 0;
			}
		return count+1;
	}

}
