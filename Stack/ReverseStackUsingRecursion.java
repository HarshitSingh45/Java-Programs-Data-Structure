package Stack;

import java.util.Stack;

public class ReverseStackUsingRecursion {
	
	public static void main(String[] args) {
		Stack<Integer> s1=new Stack<Integer>();
		int[] arr= {1,2,3,4,5};
		for(int i:arr)
			s1.push(i);
		System.out.println("Before reversal");
		System.out.println(s1);
		System.out.println("After reversal");
		reverseStack(s1);
		System.out.println(s1);

	}
	public static void reverseStack(Stack<Integer> s1) {
		if(s1.isEmpty())
			return;
		int temp=s1.pop();
		// We get a reversed stack after recursion call
		reverseStack(s1);
		// Now we need to insert temp at the bottom position
		insertAtBotton(s1,temp);
		
	}
	private static void insertAtBotton(Stack<Integer> s1,int temp) {
		if(s1.isEmpty()) {
			//When stack is empty insert temp
			s1.push(temp);
			return;
		}
		int t=s1.pop();
		insertAtBotton(s1, temp);
		s1.push(t);
		
	}

}
