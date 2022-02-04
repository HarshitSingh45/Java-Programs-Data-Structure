package DataStructure;

public class LinkedList_MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList_TakeInput ip = new LinkedList_TakeInput();
		Node<Integer> head=ip.takeInput();
		ip.print(head);
		System.out.println();
		Node<Integer> result=mergeSort(head);
		ip.print(result);
		

	}
//	public static Node<Integer> mergeSort(Node<Integer> head){
//		if(head==null)
//			return head;
//		if(head.next==null)
//			return head;
//		LinkedList_Midpoint_2Pointers mid=new LinkedList_Midpoint_2Pointers();
//		Node<Integer> midNode = mid.midpoint(head);
//		Node<Integer> start,h1,h2=null;
//		h1=mergeSort(midNode.next);
//		midNode.next=null;
//		h2=mergeSort(head);
//		LinkedList_Merge2SortedLL m=new LinkedList_Merge2SortedLL();
//		start=m.mergeLL(h1, h2);
//		return start;
//	}
	public static Node<Integer> mergeSort(Node<Integer> head){
		if(head==null || head.next==null)
			return head;
		Node<Integer> midNode=midpoint(head);
		Node<Integer> start,h1,h2=null;
		h2=mergeSort(midNode.next);
		midNode.next=null;
		h1=mergeSort(head);
		start=merge(h1,h2);
		return start;
	}
	public static Node<Integer> midpoint(Node<Integer> head){
		if(head==null || head.next==null)
			return head;
		Node<Integer> fast=head,slow=head;
		while(fast.next!=null && fast.next.next!=null) {
			fast=fast.next.next;
			slow=slow.next;
		}
		return slow;
	}
	public static Node<Integer> merge(Node<Integer> head1, Node<Integer> head2){
		if(head1==null && head2==null)
			return null;
		if(head1==null)
			return head2;
		if(head2==null)
			return head1;
		Node<Integer> start,tail =null,t1=head1,t2=head2;
		if(t1.data<t2.data) {
			start=t1;
			tail=t1;
			t1=t1.next;
		}else {
			start=t2;
			tail=t2;
			t2=t2.next;
		}
		while(t1!=null && t2!=null) {
			if(t1.data<t2.data) {
				tail.next=t1;
				tail=t1;
				t1=t1.next;
			}else {
				tail.next=t2;
				tail=t2;
				t2=t2.next;
			}
		}
		if(t1==null) {
			tail.next=t2;
		}
		if(t2==null) {
			tail.next=t1;
		}
			
		return start;
	}

}
