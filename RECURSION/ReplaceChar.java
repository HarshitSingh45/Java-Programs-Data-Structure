package RECURSION;

public class ReplaceChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="abababab";
		System.out.println(replace(str,'b','a'));

	}
	public static String replace(String str,char ori,char rep) {
		if(str.length()==0)
			return str;
		String str1=replace(str.substring(1),ori,rep);
		if(str.charAt(0)==ori)
			return rep+str1;
		else
			return str.charAt(0)+str1;
	}

}
