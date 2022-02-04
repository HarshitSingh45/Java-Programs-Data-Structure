package DataStructure;
import java.util.Stack;
public class Stack_MinimumBracketReversal {

	public static void main(String[] args) {
		String s="}}}{{{";
		System.out.println(countBracketReversals(s));

	}
	public static int countBracketReversals(String s) {
		//Your code goes here
		Stack<Character> stack=new Stack<>();
		if(s.length()%2!=0)
			return -1;
		int open=0,end=0;
		for(int i=0;i<s.length();i++) {
			if(stack.isEmpty()) {
				stack.push(s.charAt(i));
				if(s.charAt(i)=='{')
					open++;
				else
					end++;
			}
			else {
				if(stack.peek()=='{'&& s.charAt(i)=='}') {
					open--;
					stack.pop();
				}
				else {
					stack.push(s.charAt(i));
					if(s.charAt(i)=='{')
						open++;
					else
						end++;
				}

			}
		}
		if(open==0)
			return end/2;
		if(end==0)
			return open/2;
		if(open==end)
			return open+1;
		else 
			return open/2+end/2;

	}
}
