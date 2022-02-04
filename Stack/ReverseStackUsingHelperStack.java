package Stack;

import java.util.Stack;

public class ReverseStackUsingHelperStack {
	
	public static void main(String[] args) {
		Stack<Integer> s1=new Stack<Integer>();
		Stack<Integer> s2=new Stack<Integer>();
		int[] arr= {1,2,3,4,5};
		for(int i:arr)
			s1.push(i);
		System.out.println("Before reversal");
		while(!s1.isEmpty())
			System.out.print(s1.pop()+" ");
		for(int i:arr)
			s1.push(i);
		System.out.println();
		System.out.println("After reversal");
		reverseStack(s1, s2);
		while(!s1.isEmpty())
			System.out.print(s1.pop()+" ");

	}
	public static void reverseStack(Stack<Integer> s1, Stack<Integer> s2) {
		//Base case wen s1 is empty
		if(s1.isEmpty())
			return;
		int temp=s1.pop();
		// Calling recurson to reverse the s1 stack
		reverseStack(s1, s2);
		//Empty the reverse s1 stack and populate it into s2
		while(!s1.isEmpty()) 
			s2.push(s1.pop());
		//Insert temp at the bottom of the stack
		s1.push(temp);
		//Move all elements from s2 to s1
		while(!s2.isEmpty()) 
			s1.push(s2.pop());
		//Effectively we are using 3 stacks--- original,helper & recursion
	}

}
