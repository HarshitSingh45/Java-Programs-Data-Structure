package DataStructure;
import java.util.Stack;
public class Stack_Collection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> stack=new Stack<>();
		int[] arr= {1,2,3,4,5};
		for(int i:arr)
			stack.push(i);
		while(!stack.isEmpty()) {
			System.out.println(stack.pop());
		}
		
		stack.push(10);
		System.out.println(stack.peek());
		System.out.println(stack.size());
		System.out.println(stack.isEmpty());
		System.out.println();
		stack.push(20);
		System.out.println(stack.peek());
		System.out.println(stack.size());
		System.out.println(stack.isEmpty());
		System.out.println();
		stack.push(30);
		System.out.println(stack.peek());
		System.out.println(stack.size());
		System.out.println(stack.isEmpty());
		System.out.println();
		System.out.println(stack.pop());
		System.out.println(stack.peek());
		System.out.println(stack.size());
		System.out.println(stack.isEmpty());
		System.out.println();
		System.out.println(stack.pop());
		System.out.println(stack.peek());
		System.out.println(stack.size());
		System.out.println(stack.isEmpty());
		System.out.println();
		System.out.println(stack.pop());
		System.out.println(stack.peek());
		System.out.println(stack.size());
		System.out.println(stack.isEmpty());

	}

}
