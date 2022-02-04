package DataStructure;
import java.util.Queue;
import java.util.Stack;
import java.util.LinkedList;
public class Queue_ReverseQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> q=new LinkedList<Integer>();
		q.add(10);
		q.add(20);
		q.add(30);
		q.add(40);
		q.add(50);
		q.add(60);
		q.add(70);
		q.add(80);
		q.add(90);
		q.add(100);
		//reverseQueue(q);
		q=reverseKElements(q, 5);
		System.out.println(q.poll());
		System.out.println(q.poll());
		System.out.println(q.poll());
		System.out.println(q.poll());
		System.out.println(q.poll());
		System.out.println(q.poll());
		System.out.println(q.poll());
		System.out.println(q.poll());
		System.out.println(q.poll());
		System.out.println(q.poll());

	}
	public static void reverseQueue(Queue<Integer> q) {
		//Your code goes here
		Stack<Integer> s=new Stack<Integer>();
		while(!q.isEmpty()) {
			int data=q.poll();
			s.push(data);
		}while(!s.isEmpty()) {
			int data=s.pop();
			q.add(data);
		}
	}
	public static Queue<Integer> reverseKElements(Queue<Integer> q, int k) {
		//Your code goes here
		if(k>=q.size() || k==0)
			return q;
		Stack<Integer> s=new Stack<Integer>();
		Queue<Integer> q1=new LinkedList<Integer>();
		while(k!=0) {
			int data=q.poll();
			s.push(data);
			k--;
		}
		while(!q.isEmpty()) {
			int data=q.poll();
			q1.add(data);
		}
		while(!s.isEmpty()) {
			int data=s.pop();
			q.add(data);
		}
		while(!q1.isEmpty()) {
			int data=q1.poll();
			q.add(data);
		}
		//reverseQueue(q);
		return q;
	}

}
