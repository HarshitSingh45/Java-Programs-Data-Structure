package Stack;

import java.util.Stack;

public class SortStack {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> input=new Stack<Integer>();
		input.push(20);
		input.push(60);
		input.push(30);
		input.push(40);
		input.push(10);
		input.push(50);
		System.out.println(input);
		sort(input);
		System.out.println(input);

	}
	public static void sort(Stack<Integer> s) {
		//Create temporary stack
		Stack<Integer> t=new Stack<Integer>();
		int size=s.size()-1;
		//Run a loop for no otf times s stack gets empty & refilled
		while(size>0) {
			//Pop ot first element to compare with each element of stack
			int temp=s.pop();
			while(!s.isEmpty()) {
				//compare temp with the top element in stack
				//if top element is less than temp move it to temporary stack
				//if temp is less than top element then move temp to temporary stack
				//& pop the top element and save it in temp for further comparisons
				if(s.peek()>temp) {
					t.push(temp);
					temp=s.pop();
				}else {
					t.push(s.pop());
				}
			}
			s.push(temp);
			while(!t.isEmpty()) {
				s.push(t.pop());
			}
			size--;
		}
	}

}
