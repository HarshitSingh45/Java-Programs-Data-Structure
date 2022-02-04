package Tries_Huffman;
import java.util.ArrayList;

public class Dictionary {
	public static void main(String[] args) {
//		Trie d = new Trie();
//		ArrayList<String> arr=new ArrayList<>();
//		arr.add("abc");
//		arr.add("def");
//		arr.add("ghi");
//		arr.add("cba");
//		System.out.println(d.patternMatching(arr, "hif"));
		String s= "abc";
		System.out.println(reverse(s));
		
	}
	public static String reverse(String s) {
		if(s.length()==1)
			return s;
		String rev = reverse(s.substring(1));
		rev=rev+s.charAt(0);
		return rev;
	}
}
