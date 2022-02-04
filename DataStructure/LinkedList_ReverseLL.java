package DataStructure;

public class LinkedList_ReverseLL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList_TakeInput ip=new LinkedList_TakeInput();
		Node<Integer> head=ip.takeInput();
		ip.print(head);
		System.out.println();
		Node<Integer> result=reverseLL(head);
		ip.print(result);

	}
	// TimeComplexity n^2
	public static Node<Integer> reverseLL(Node<Integer> head){
		Node<Integer> start=null;
		if(head.next==null)
			return head;
		start=reverseLL(head.next);
		Node<Integer> temp=start;
		while(temp.next!=null) {
			temp=temp.next;
		}
		temp.next=head;
		head.next=null;
		return start;
	}

}
