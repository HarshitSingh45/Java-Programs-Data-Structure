package DataStructure;
import java.util.Stack;
public class Stack_RedundantBracket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="((a)+b)";
		System.out.println(checkRedundantBrackets(s));

	}
//	public static boolean checkRedundantBrackets(String s) {
//		//Your code goes here
//		Stack<Character> st=new Stack<>();
//		for(int i=0;i<s.length();i++) {
//			if(s.charAt(i)==')' && st.peek()=='(')
//				return true;
//			if(s.charAt(i)=='(') {
//				st.push(s.charAt(i));
//				int count=0;
//				i++;
//				while(s.charAt(i)!=')') {
//					count++;
//					i++;
//				}
//				if(count==1 || count==0 || count==2)
//					return true;
//				else
//					st.pop();
//				i++;
//			}
//		}
//		return false;
//	}
	public static boolean checkRedundantBrackets(String s) {
		Stack<Character> st=new Stack<>();
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='+'||s.charAt(i)=='-'||s.charAt(i)=='*'||s.charAt(i)=='/'||s.charAt(i)=='(')
				st.push(s.charAt(i));
			if(s.charAt(i)==')'){
				int count=0;
				while(st.peek()!='(') {
					count++;
					st.pop();
				}
				st.pop();
				if(count==0)
					return true;
			}
		}
		return false;
	}

}
