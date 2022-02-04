package DataStructure;

import java.util.Scanner;

public class LinkedList_Ascending_Descending_Sort {
	
	public static Node<Integer> takeInput(){
		Scanner s=new Scanner(System.in);
		int data=s.nextInt();
		Node<Integer> head=null,tail=null;
		while(data!=-1) {
			Node<Integer> curr=new Node<Integer>(data);
			if(head==null) {
				head=curr;
				tail=curr;
			}else {
				tail.next=curr;
				tail=curr;
			}
			data=s.nextInt();
		}
		return head;
	}
	public static void print(Node<Integer> head) {
		while(head!=null) {
			System.out.print(head.data+" ");
			head=head.next;
		}
		System.out.println();
	}
	public static void main(String[] args) {
		Node<Integer> head=takeInput();
		print(head);
		head=sort(head);
		print(head);

	}
	public static Node<Integer> sort(Node<Integer> head){
		Node<Integer> temp=head, asc=head, dsc=head.next, ascHead=head, dscHead=head.next;
		int count=0;
		while(temp!=null) {
			if(count==0) {
				temp=temp.next;
				if(asc.next==null || asc.next.next==null) {
					asc.next=null;
				}else {
				asc.next=asc.next.next;
				asc=asc.next;
				}
				
				count=1;
			}else {
				temp=temp.next;
				if(dsc.next==null || dsc.next.next==null) {
					dsc.next=null;
				}else {
				dsc.next=dsc.next.next;
				dsc=dsc.next;
				}
				count=0;
			}
			
		}
		print(ascHead);
		print(dscHead);
		if(ascHead.data>ascHead.next.data)
			ascHead=reverse(ascHead);
		if(dscHead.data>dscHead.next.data)
			dscHead=reverse(dscHead);
		head=merge(ascHead,dscHead);
		return head;
		
	}
	public static Node<Integer> merge(Node<Integer> head1,Node<Integer> head2){
		Node<Integer> head=null,tail=null,t1=head1,t2=head2;
		while(t1!=null && t2!=null) {
			if(t1.data<t2.data) {
				if(head==null) {
					head=t1;
					tail=t1;
					t1=t1.next;
				}else {
					tail.next=t1;
					tail=t1;
					t1=t1.next;
				}
			}else {
				if(head==null) {
					head=t2;
					tail=t2;
				}else {
					tail.next=t2;
					tail=t2;
					t2=t2.next;
					
				}
			}
		}
		if(t1==null) {
			tail.next=t2;
		}else {
			tail.next=t1;
		}
		return head;
	}
	public static Node<Integer> reverse(Node<Integer> head){
		if(head.next==null)
			return head;
		Node<Integer> newHead=reverse(head.next);
		Node<Integer> tail=head.next;
		tail.next=head;
		head.next=null;
		return newHead;
	}

}
