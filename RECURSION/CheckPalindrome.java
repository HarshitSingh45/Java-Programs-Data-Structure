package RECURSION;

public class CheckPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="aababaa";
		System.out.println(palindrome(str));

	}
	public static boolean palindrome(String str) {
		if(str.length()==0||str.length()==1)
			return true;
		int n=str.length()-1;
		if(str.charAt(0)!=str.charAt(n))
			return false;
		return palindrome(str.substring(1, n));
	}

}
