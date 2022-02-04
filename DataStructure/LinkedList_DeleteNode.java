package DataStructure;

public class LinkedList_DeleteNode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList_TakeInput ip=new LinkedList_TakeInput();
		Node<Integer> head=ip.takeInput();
		ip.print(head);
		System.out.println();
		Node<Integer> result=deleteNode(head,0);
		ip.print(result);

	}
	
	public static Node<Integer> deleteNode(Node<Integer> head,int pos){
		if(head.next==null&&pos>0)
			return head;
		if(pos==0)
			return head.next;
		head.next=deleteNode(head.next, pos-1);
		return head;
	}

}
