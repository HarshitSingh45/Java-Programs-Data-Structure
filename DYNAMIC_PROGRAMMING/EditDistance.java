package DYNAMIC_PROGRAMMING;

// You are given two strings S and T of lengths M and N, respectively.
// Find the 'Edit Distance' between the strings.
// Edit Distance of two strings is the minimum number of steps required to make one string equal to the other.
// In order to do so, you can perform the following three operations:
//   1. Delete a character
//   2. Replace a character with another one
//   3. Insert a character
// solve it first and find the solution
public class EditDistance {

	public static int editDistance(String s, String t) {
		if(s.length()==0 || t.length()==0) {
			return Integer.MAX_VALUE;
			}
		if(s==t)
			return 0;
		if(s.charAt(0)==t.charAt(0)) 
			return editDistance(s.substring(1), t.substring(1));
		
		int ans1,ans2,ans3,ans4;
		    //replace
			ans1=editDistance(s.substring(1), t.substring(1));
			// insert
			ans2=editDistance(s.substring(1), t);
			//delete
			ans3=editDistance(s, t.substring(1));
			ans4=Math.min(ans1, Math.min(ans2,ans3));
			System.out.println();
		return ans4+1;	
	}
	/*public static int editDistance(String s, String t) {
		if(s.length()==0 || t.length()==0)
			return Integer.MAX_VALUE;
		
		if(s==t)
			return 0;
		if(s.charAt(0)==t.charAt(0)) 
			return editDistance(s.substring(1), t.substring(1));
		
		int ans1;
		if(t.length()<s.length()) {
			ans1=editDistance(s, s.charAt(0)+t);
			return 1+ans1;
		}
		if(t.length()>s.length()) {
			ans1=editDistance(s, t.substring(1));
			return 1+ans1;
		}
		ans1=editDistance(s, s.charAt(0)+t.substring(1));
		return 1+ans1;
		
	}*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="abc";
		String t="dc";
		System.out.println(editDistance(s, t));

	}

}
