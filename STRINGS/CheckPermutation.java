package STRINGS;

public class CheckPermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Sample Input 1:
//			abcde
//			baedc
//		Sample Output 1:
//			true
//		Sample Input 2:
//			abc
//			cbd
//		Sample Output 2:
//			false
		String str="aabb";
		String str1="abab";
		boolean br=check(str,str1);
		System.out.println(br);
	}
	public static boolean check(String str,String str1) {
		int[] freq=new int[256];
		if(str.length()!=str1.length()) {
			return false;
		}
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			freq[ch]+=1;
		}
		for(int i=0;i<str1.length();i++) {
			char ch=str1.charAt(i);
			freq[ch]-=1;
		}
		for(int i=0;i<256;i++) {
			if(freq[i]!=0) {
				return false;
			}
		}
		return true;
	}

}
