package DataStructure;

import java.util.Scanner;

public class Stack_StackUse {

	public static void main(String[] args) throws StackEmptyException {
//		Scanner s=new Scanner(System.in);
//		System.out.println("Enter the size of Stack");
//		int size=s.nextInt();
//		//When user gives the size of stack
//		Stack_StackUsingArray stack= new Stack_StackUsingArray(size);
//		try {
//		//System.out.println(stack.top());
//		stack.push(10);
//		System.out.println(stack.top());
//		System.out.println(stack.size());
//		System.out.println(stack.isEmpty());
//		System.out.println();
//		stack.push(20);
//		System.out.println(stack.top());
//		System.out.println(stack.size());
//		System.out.println(stack.isEmpty());
//		System.out.println();
//		stack.push(30);
//		System.out.println(stack.top());
//		System.out.println(stack.size());
//		System.out.println(stack.isEmpty());
//		System.out.println();
//		System.out.println(stack.pop());
//		System.out.println(stack.top());
//		System.out.println(stack.size());
//		System.out.println(stack.isEmpty());
//		System.out.println();
//		System.out.println(stack.pop());
//		System.out.println(stack.top());
//		System.out.println(stack.size());
//		System.out.println(stack.isEmpty());
//		System.out.println();
//		System.out.println(stack.pop());
////		System.out.println(stack.top());
//		System.out.println(stack.size());
//		System.out.println(stack.isEmpty());
//		
//		}
//		catch(StackEmptyException e) {
//			System.out.println("Stack is empty");
//		}
		
		//Stack_StackUsingLL stack= new Stack_StackUsingLL();
		Stack_StackUsing2Queue stack=new Stack_StackUsing2Queue();
		//try {
		stack.push(10);
		System.out.println(stack.top());
		System.out.println(stack.size());
		System.out.println(stack.isEmpty());
		System.out.println();
		stack.push(20);
		System.out.println(stack.top());
		System.out.println(stack.size());
		System.out.println(stack.isEmpty());
		System.out.println();
		stack.push(30);
		System.out.println(stack.top());
		System.out.println(stack.size());
		System.out.println(stack.isEmpty());
		System.out.println();
		System.out.println(stack.pop());
		System.out.println(stack.top());
		System.out.println(stack.size());
		System.out.println(stack.isEmpty());
		System.out.println();
		System.out.println(stack.pop());
		System.out.println(stack.top());
		System.out.println(stack.size());
		System.out.println(stack.isEmpty());
		System.out.println();
		System.out.println(stack.pop());
		System.out.println(stack.top());
		System.out.println(stack.size());
		System.out.println(stack.isEmpty());
//		}
//		catch(StackEmptyException e) {
//			System.out.println("Stack is empty");
//		}

	}

}
