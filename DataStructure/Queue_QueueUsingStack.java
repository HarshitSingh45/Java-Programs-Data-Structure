package DataStructure;
import java.util.Stack;
public class Queue_QueueUsingStack<T> {
	private Stack<T> s1;
	private Stack<T> s2;
	
	public Queue_QueueUsingStack() {
		s1=new Stack<T>();
		s2=new Stack<T>();
	}
	public void enqueue(T element) {
		while(!s1.isEmpty()) {
			T data=s1.pop();
			s2.push(data);
		}
		s2.push(element);
		while(!s2.isEmpty()) {
			T data=s2.pop();
			s1.push(data);
		}
	}
	public T dequeue() {
		if(s1.size()==0)
			return null;
		return s1.pop();
	}
	public T front() {
		if(s1.size()==0)
			return null;
		return s1.peek();
	}
	public int size() {
		return s1.size();
	}
	public boolean isEmpty() {
		return s1.size()==0;
	}

}
