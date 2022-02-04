package RECURSION_ADVANCE;

import java.util.ArrayList;

public class SubsequencesOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="abc";
		ArrayList<String> subsequence=new ArrayList<String>();
		subsequence= returnSubSequence(str);
		for(String i:subsequence)
			System.out.println(i);

	}
	public static ArrayList<String> returnSubSequence(String str){
		ArrayList<String> arr=new ArrayList<String>();
		ArrayList<String> ret=new ArrayList<String>();
		if(str.length()==0) {
			String s="";
			arr.add(s);
			return arr;
		}
		ret=returnSubSequence(str.substring(1));
		for(int i=0;i<ret.size();i++) {
			arr.add(ret.get(i));
		}
		for(int i=0;i<ret.size();i++) {
			String s=str.charAt(0)+ret.get(i);
			arr.add(s);
		}
		return arr;
	}

}
