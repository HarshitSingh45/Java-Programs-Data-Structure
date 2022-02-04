package RECURSION;

public class PairStar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(star("hello"));

	}
	public static String star(String str) {
		if(str.length()==1)
			return str;
		if(str.charAt(0)==str.charAt(1))
			return str.charAt(0)+"*"+star(str.substring(1));
		else
			return str.charAt(0)+star(str.substring(1));
	}

}
