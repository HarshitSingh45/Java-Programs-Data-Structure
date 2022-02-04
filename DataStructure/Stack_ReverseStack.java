package DataStructure;
import java.util.Stack;
public class Stack_ReverseStack {

	public static void main(String[] args) {
		Stack<Integer> stack=new Stack<Integer>(),helper=new Stack<Integer>();
		int[] arr= {1,2,3,4,5};
		for(int i:arr)
			stack.push(i);
		reverseStack(stack,helper);
		System.out.println("ORIGINAL STACK");
		while(!stack.isEmpty()) {
			System.out.println(stack.pop());
		}
		System.out.println("HELPER STACK");
		while(!helper.isEmpty()) {
			System.out.println(helper.pop());
		}
	}
	public static void reverseStack(Stack<Integer> input, Stack<Integer> extra) {
		if(input.isEmpty()) {
			return;
		}
		int temp=input.pop();
		reverseStack(input, extra);
		while(!input.isEmpty()) {
			int tem=input.pop();
			extra.push(tem);
		}
		input.push(temp);
		while(!extra.isEmpty()) {
			int tem=extra.pop();
			input.push(tem);
		}
	}

}
