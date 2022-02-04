package DataStructure;

public class LinkedList_RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer> head=createLinkedList();
		print(head);
		System.out.println();
		Node<Integer> dupli=removeDuplicateElement(head);
		print(dupli);

	}
	public static Node<Integer> createLinkedList(){
		Node<Integer> n1=new Node<Integer>(10);
		Node<Integer> n2=new Node<Integer>(10);
		Node<Integer> n3=new Node<Integer>(10);
		Node<Integer> n4=new Node<Integer>(20);
		Node<Integer> n5=new Node<Integer>(20);
		Node<Integer> n6=new Node<Integer>(30);
		Node<Integer> n7=new Node<Integer>(30);
		n1.next=n2;
		n2.next=n3;
		n3.next=n4;
		n4.next=n5;
		n5.next=n6;
		n6.next=n7;
		return n1;
	}
	public static void print(Node<Integer> head) {
		while(head!=null) {
			System.out.print(head.data+" ");
			head=head.next;
		}
	}
	public static int length(Node<Integer> head) {
		Node<Integer> temp=head;
		int count=0;
		while(temp!=null) {
			count++;
			temp=temp.next;
		}
		return count;
	}
	public static Node<Integer> removeDuplicateElement(Node<Integer> head){
		
		// THROUGH RECURSION TIME COMPLEXITY IS HIGH
		//		Node<Integer> temp=head;
		//		Node<Integer> start=null;
		//		if(length(head)==1) {
		//			return head;
		//		}
		//		if(temp.data==temp.next.data) {
		//			return removeDuplicateElement(temp.next);
		//		}else {
		//			Node<Integer> pass=temp.next;
		//			temp.next=removeDuplicateElement(pass);
		//			return temp;
		
		//METHOD 1
		if(head==null)
			return head;
		Node<Integer> temp=head;
		while(temp.next!=null) {
			if(temp.data==temp.next.data) 
				temp.next=temp.next.next;
			else
				temp=temp.next;
		}
		return head;
	}
}
