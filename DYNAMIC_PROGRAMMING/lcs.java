package DYNAMIC_PROGRAMMING;

public class lcs {

	public static int lcs(String s, String t) {
		if(s.length()==0 || t.length()==0)
			return 0;
		if(s.charAt(0)==t.charAt(0)) {
			return 1+lcs(s.substring(1),t.substring(1));
		}else {
			int n=lcs(s,t.substring(1));
			int m=lcs(s.substring(1),t);
			return Math.max(n, m);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="adebc";
		String t="dcadb";
		System.out.println(lcs(s,t));

	}

}
