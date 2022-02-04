package DataStructure;
import java.util.Stack;
public class Stack_BalancedBracket {
	
	public static boolean isBalanced(String s) {
        //Your code goes here
        Stack<Character> stack=new Stack<Character>();
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='{' || s.charAt(i)=='(') {
				stack.push(s.charAt(i));
				continue;
			}
			if(s.charAt(i)=='}'|| s.charAt(i)==')') {
				if(stack.size()==0) {
					return false;
				}
				if(s.charAt(i)==')' && stack.peek()=='(' || s.charAt(i)=='}' && stack.peek()=='{') {
					stack.pop();
				}
				else {
					return false;
				}
			}
		}
		if(stack.isEmpty())
			return true;
		else
			return false;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="{({})}}";
		System.out.println(isBalanced(s));
//		Stack<Character> stack=new Stack<Character>();
//		for(int i=0;i<s.length();i++) {
//			if(s.charAt(i)=='{' || s.charAt(i)=='(') {
//				stack.push(s.charAt(i));
//				System.out.println(stack.peek());
//				continue;
//			}
//			if(s.charAt(i)=='}'|| s.charAt(i)==')') {
//				if(stack.isEmpty()==true) {
//					System.out.println("false");
//					break;
//				}
//				if(s.charAt(i)==')' && stack.peek()=='(' || s.charAt(i)=='}' && stack.peek()=='{') {
//					System.out.println(stack.pop());
//				}
//				else {
//					System.out.println("false");
//					break;
//				}
//			}
//		}
//		if(stack.isEmpty())
//			System.out.println("true");
//		else
//			System.out.println("false");

	}

}
