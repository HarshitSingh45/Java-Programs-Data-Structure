package DataStructure;
import java.util.Queue;
import java.util.LinkedList;
public class Stack_StackUsing2Queue {
	private Queue<Integer> q1;
	private Queue<Integer> q2;
	
	public Stack_StackUsing2Queue() {
		q1=new LinkedList<Integer>();
		q2=new LinkedList<Integer>();
	}
	public void push(int element) {
		q1.add(element);
	}
	public int pop() {
		if(q1.size()==0)
			return -1;
		while(q1.size()!=1) {
			int data=q1.poll();
			q2.add(data);
		}
		int temp=q1.poll();
		while(!q2.isEmpty()) {
			int data=q2.poll();
			q1.add(data);
		}
		//swap();
		return temp;
	}
	public int top() {
		if(q1.size()==0)
			return -1;
		while(q1.size()!=1) {
			int data=q1.poll();
			q2.add(data);
		}
		int temp=q1.poll();
		q2.add(temp);
		while(!q2.isEmpty()) {
			int data=q2.poll();
			q1.add(data);
		}
		//swap();
		return temp;
		
	}
	public int size() {
		return q1.size();
	}
	public boolean isEmpty() {
		return q1.isEmpty();
	}
	private void swap() {
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
    }

}
