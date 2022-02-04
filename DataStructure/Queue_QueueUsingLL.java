package DataStructure;

public class Queue_QueueUsingLL<T> {
	private Node<T> front,rear;
	private int size;

	public void enqueue(T element) {
		Node<T> curr=new Node<>(element);
		if(size==0) {
			front=curr;
			rear=curr;
			size++;
		}else {
			rear.next=curr;
			rear=curr;
			size++;
		}

	}
	public T dequeue() throws QueueEmptyException {
		if(size==0)
			throw new QueueEmptyException();
		T data=front.data;
		front=front.next;
		if(size==1)
			rear=null;
		size--;
		return data;
	}
	public T front() throws QueueEmptyException {
		if(size==0)
			throw new QueueEmptyException();
		return front.data;

	}
	public int size() {
		return size;
	}
	public boolean isEmpty() {
		return size==0;
	}
	


}
