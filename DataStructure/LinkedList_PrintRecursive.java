package DataStructure;

public class LinkedList_PrintRecursive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList_TakeInput ip=new LinkedList_TakeInput();
		Node<Integer> head=ip.takeInput();
		ip.print(head);
		System.out.println();
		Node<Integer> result = insertRecursive(head,0,25);
		ip.print(result);

	}
	public static Node<Integer> insertRecursive(Node<Integer> head,int pos, int data){
		if(head==null&&pos>0)
			return head;
		Node<Integer> insert=new Node<Integer>(data);
		if(pos==0) {
			insert.next=head;
			return insert;
		}
		head.next=insertRecursive(head.next, pos-1, data);
		return head;
		
	}
}
