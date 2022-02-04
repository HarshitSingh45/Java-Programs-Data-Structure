package DataStructure;

public class LinkedList_Midpoint_2Pointers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList_TakeInput ip = new LinkedList_TakeInput();
		Node<Integer> head= ip.takeInput();
		ip.print(head);
		System.out.println();
		Node<Integer> midpoint=midpoint(head);
		System.out.println(midpoint.data);

	}public static Node<Integer> midpoint(Node<Integer> head) {
		if(head==null)
			return head;
		Node<Integer> fast=head,slow=head; 
		while(fast.next!=null&&fast.next.next!=null) {
			slow=slow.next;
			fast=fast.next.next;
		}
		return slow;
	}
	

}
