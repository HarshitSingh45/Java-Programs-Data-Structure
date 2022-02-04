package RECURSION;

public class Replace__Pi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="ppinpinpi";
		System.out.println(replace(str));
	}
	public static String replace(String str) {
		if(str.length()<=1)
			return str;
		if(str.charAt(0)=='p'&&str.charAt(1)=='i') {
			String str1=replace(str.substring(2));
			return "3.14"+str1;
		}else {
			String str1=replace(str.substring(1));
			return str.charAt(0)+str1;
		}
	}

}
