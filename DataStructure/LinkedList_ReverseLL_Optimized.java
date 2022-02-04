package DataStructure;

class DoubleNode{
	Node<Integer> head;
	Node<Integer> tail;
	DoubleNode(){
		
	}
	DoubleNode(Node<Integer> head,Node<Integer> tail){
		this.head=head;
		this.tail=tail;
	}
	
}
public class LinkedList_ReverseLL_Optimized {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList_TakeInput ip=new LinkedList_TakeInput();
		Node<Integer> head=ip.takeInput();
		ip.print(head);
		System.out.println();
		Node<Integer> reverse=reverseLL(head);
		ip.print(reverse);

	}
	public static Node<Integer> reverseLL(Node<Integer> head){
		DoubleNode ans=reverse(head);
		return ans.head;
	}
	public static DoubleNode reverse(Node<Integer> head) {
		DoubleNode ans;
		if(head==null||head.next==null) {
			ans=new DoubleNode(head,head);
			return ans;
		}
		DoubleNode db=reverse(head.next);
		db.tail.next=head;
		head.next=null;
		ans=new DoubleNode(db.head,head);
		return ans;
	}

}
