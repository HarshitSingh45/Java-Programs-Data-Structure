package RECURSION;

public class Remove__X {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="xaxb";
		System.out.println(removeX(str));

	}
	public static String removeX(String str) {
		if(str.length()==0)
			return str;
		String str1=removeX(str.substring(1));
		if(str.charAt(0)=='x')
			return str1;
		else 
			return str.charAt(0)+str1;
	}

}
