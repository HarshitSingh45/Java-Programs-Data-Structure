package RECURSION_ADVANCE;

import java.util.ArrayList;

public class PermutationOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str= "abcd";
		String[] ans=permutation(str);
		for(String i:ans)
			System.out.println(i);

	}
	public static String[] permutation(String str) {
		
		if(str.length()==1) {
			String[] ans = new String[1];
			ans[0]=str;
			return ans;
		}
		
		String[] ans= permutation(str.substring(1));
		ArrayList<String> list= new ArrayList<String>();
		for(int i=0; i<ans.length; i++) {
			String temp = ans[i];
			String a=str.charAt(0)+temp;
			list.add(a);
			for(int j=0;j<temp.length();j++) {
				if(j==temp.length()-1) {
					String fin=temp+str.charAt(0);
					list.add(fin);
					break;
				}
				String p1=temp.substring(0, j+1);
				String p2=temp.substring(j+1);
				String fin=p1+str.charAt(0)+p2;
				list.add(fin);
			}
		}
		int n=list.size();
		String[] output = new String[n];
		for(int i=0;i<output.length;i++) {
			output[i]=list.get(i);
		}
		return output;
	}

}
