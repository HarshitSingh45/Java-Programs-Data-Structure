package DataStructure;

import java.util.Scanner;

public class LinkedList_Merge2LL_Recursion {
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
		Node<Integer> head1=takeInput();
		//print(head1);
		Node<Integer> head2=takeInput();
		//print(head2);
		Node<Integer> head=merge(head1,head2);
		print(head);

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

}
