package DataStructure;

import java.util.Scanner;

public class LinkedList_EvenAfterOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer> head= takeInput();
		print(head);
		Node<Integer> result=evenAfterOdd(head);
		print(result);

	}

	public static Node<Integer> evenAfterOdd(Node<Integer> head){
		if(head==null)
			return head;
		Node<Integer> ehead=null,etail=null,ohead=null,otail=null;
		while(head!=null) {
			if(head.data%2==0) {
				if(ehead==null) {
					ehead=head;
					etail=head;
					head=head.next;
				}else {
					etail.next=head;
					etail=etail.next;
					head=head.next;
				}
			}else {
				if(ohead==null) {
					ohead=head;
					otail=head;
					head=head.next;
				}else {
					otail.next=head;
					otail=otail.next;
					head=head.next;
				}
			}
		}
		if(ehead==null) {
			otail.next=null;
			return ohead;
		}
		if(ohead==null) {
			etail.next=null;
			return ehead;
		}
		otail.next=ehead;
		etail.next=null;
		return ohead;
	}
	
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

}
