package DataStructure;

public class LinkedList_Reverse_Best {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList_TakeInput ip= new LinkedList_TakeInput();
		Node<Integer> head=ip.takeInput();
		ip.print(head);
		System.out.println();
		Node<Integer> reverse=reverse(head);
		ip.print(reverse);

	}
	public static Node<Integer> reverse(Node<Integer> head){
		if(head==null||head.next==null)
			return head;
		Node<Integer> newHead=reverse(head.next);
		Node<Integer> tail=head.next;
		head.next=null;
		tail.next=head;
		return newHead;
	}

}
