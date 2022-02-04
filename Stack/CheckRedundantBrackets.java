package Stack;

import java.util.Stack;

public class CheckRedundantBrackets {
	
	public static void main(String[] args) {
		String s="{(a+b)+c}";
		System.out.println(redundantBrackets(s));
	}
	public static boolean redundantBrackets(String s) {
		Stack<Character> s1=new Stack<>();
		for(int i=0;i<s.length();i++) {
			//Insert ({[+-*/ into the stack
			if(s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='[' || s.charAt(i)=='+' || s.charAt(i)=='-' || s.charAt(i)=='*' || s.charAt(i)=='/')
				s1.push(s.charAt(i));
			if(s.charAt(i)==')') {
				int count=0;
				while(s1.peek()!='(') {
					count++;
					s1.pop();
				}
				s1.pop();
				if(count==0)
					return false;
			}
			if(s.charAt(i)=='}') {
				int count=0;
				while(s1.peek()!='{') {
					count++;
					s1.pop();
				}
				s1.pop();
				if(count==0)
					return false;
			}
			if(s.charAt(i)==']') {
				int count=0;
				while(s1.peek()!='[') {
					count++;
					s1.pop();
				}
				s1.pop();
				if(count==0)
					return false;
			}
		}
		return true;
	}

}
