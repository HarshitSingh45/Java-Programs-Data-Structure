package DataStructure;

public class Stack_StackUsingLL<T> {
	Node<T> head;
	int size;

	public void push(T element) {
		Node<T> curr=new Node<T>(element);
// 		if(head==null) {
// 			head=curr;
// 			size++;
// 		}else {
// 			curr.next=head;
// 			head=curr;
// 			size++;
// 		}
		curr.next=head;
		head=curr;
		size++;
		

	}
	public T pop() throws StackEmptyException {
		if(head==null)
			throw new StackEmptyException();
		T data=head.data;
		head=head.next;
		size--;
		return data;

	}
	public T top() throws StackEmptyException {
		if(head==null)
			throw new StackEmptyException();
		return head.data;

	}
	public int size() {
		return size;
	}
	public boolean isEmpty() {
		return size==0;
	}



}
