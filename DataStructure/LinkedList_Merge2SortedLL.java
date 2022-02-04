package DataStructure;

public class LinkedList_Merge2SortedLL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList_TakeInput ip = new LinkedList_TakeInput();
		Node<Integer> head=ip.takeInput(),head1=ip.takeInput(),merge=null;
		ip.print(head);
		System.out.println();
		ip.print(head1);
		System.out.println();
		merge=mergeLL(head,head1);
		ip.print(merge);

	}
	
	public static Node<Integer> merge(Node<Integer> head1,Node<Integer> head2){
		if(head1==null)
			return head2;
		if(head2==null)
			return head1;
		Node<Integer> head=null;
		if(head1.data<head2.data) {
			head=head1;
			head.next=merge(head1.next, head2);
		}else {
			head=head2;
			head2.next=merge(head1, head2.next);
		}
		return head;
	}
	public static Node<Integer> mergeLL(Node<Integer> head1,Node<Integer> head2){
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
