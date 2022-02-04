package DataStructure;

import java.util.Scanner;

//class {
//	Node<Integer> head;
//	Node <Integer> tail;
//	DoubbleNode(Node<Integer> head, Node<Integer> tail){
//		this.head=head;
//		this.tail=tail;
//	}
//}

public class LinkedList_kReverse {

	public static Node<Integer> takeInput(){
		Scanner s=new Scanner(System.in);
		int data=s.nextInt();
		Node<Integer> start=null,tail=null;
		while(data!=-1) {
			Node<Integer> currElem=new Node<Integer>(data);
			if(start==null) {
				start=currElem;
				tail=currElem;
			}else {
				tail.next=currElem;
				tail=tail.next;
			}
			data = s.nextInt();
		}
		return start;
	}

	public static void print(Node<Integer> head) {
		while(head!=null) {
			System.out.print(head.data+" ");
			head=head.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer> head= takeInput();
		print(head);
		Node<Integer> result=kRev(head,2);
		print(result);

	}

	public static Node<Integer> kReverse(Node<Integer> head,int k){
		Node<Integer> temp=head,send=null,rev=null;
		if(head==null)
			return head;
		int count=0;
		while(temp.next!=null && count!=k-1) {
			count++;
			temp=temp.next;
		}
		send=temp.next;
		temp.next=null;
		rev=reverse(head);
		head.next=kReverse(send, k);
		return rev;
	}
	public static Node<Integer> reverse(Node<Integer> head){
		Node<Integer> nh=null,tail=null;
		if(head.next==null)
			return head;
		nh=reverse(head.next);
		tail=head.next;
		tail.next=head;
		head.next=null;
		return nh;
	}
	public static Node<Integer> kRev(Node<Integer> head, int k){
		if(head==null)
			return head;
		if(head.next==null)
			return head;

		Node<Integer> temp=head;
		Node<Integer> h1=head,t1=head;
		int count=0;
		while(count!=k-1 && temp!=null) {
			count++;
			t1=t1.next;
			temp=temp.next;
		}
		Node<Integer> newHead=temp.next;
		temp.next=null;
		DoubleNode ans=reversee(head);
		h1=ans.head;
		t1=ans.tail;
		t1.next=kRev(newHead, k);
		return h1;
	}

	public static DoubleNode reversee(Node<Integer> head){
		DoubleNode ans;
		if(head==null||head.next==null) {
			ans=new DoubleNode(head,head);
			return ans;
		}
		DoubleNode db=reversee(head.next);
		db.tail.next=head;
		head.next=null;
		ans=new DoubleNode(db.head,head);
		return ans;
	}
}




