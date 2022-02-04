package DataStructure;

public class Queue_QueueUse {

	public static void main(String[] args) {
		//Queue_QueueUsingArray queue=new Queue_QueueUsingArray();
		//Queue_QueueUsingLL<Integer> queue=new Queue_QueueUsingLL<>();
		Queue_QueueUsingStack<Integer> queue= new Queue_QueueUsingStack<>();
		//try {
		queue.enqueue(10);
		System.out.println(queue.size());
		System.out.println(queue.isEmpty());
		System.out.println(queue.front());
		queue.enqueue(20);
		queue.enqueue(30);
		queue.enqueue(40);
		queue.enqueue(50);
		System.out.println(queue.size());
		System.out.println(queue.dequeue());
		System.out.println(queue.size());
		System.out.println(queue.front());
		System.out.println(queue.isEmpty());
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		System.out.println(queue.size());
		System.out.println(queue.isEmpty());
		queue.enqueue(10);
		System.out.println(queue.size());
		System.out.println(queue.front());
		System.out.println(queue.isEmpty());
		System.out.println(queue.dequeue());
		System.out.println(queue.size());
		System.out.println(queue.isEmpty());
		System.out.println(queue.front());
		System.out.println(queue.dequeue());
//		}
//		catch(QueueEmptyException e) {
//			System.out.println("Stack is Empty");
//		}
	}

}
