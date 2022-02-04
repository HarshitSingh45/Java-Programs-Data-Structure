package DataStructure;

import java.util.Scanner;

public class LinkedList_Shooting {
	
	public static Node<Integer> shooting(Node<Integer> head){
		Node<Integer> temp=head;
		Node<Integer> start=head;
		while(length(head)!=1) {
			temp=start;
			while(temp.next!=null) {
				if(temp.next.next==null) {
					temp.next=null;
					break;
				}
				temp.next=temp.next.next;
				temp=temp.next;
			}
			print(head);
			System.out.println();
		}
		return head;
	}
	
	public static void print(Node<Integer> head) {
		Node<Integer> temp=head;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
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
	
	public static Node<Integer> takeInput(){
		Scanner s=new Scanner(System.in);
		int data=s.nextInt();
		Node<Integer> head=null;
		Node<Integer> tail=null;
		while(data!=-1) {
			Node<Integer> currElement=new Node<Integer>(data);
			if(head==null) {
				head=currElement;
				tail=currElement;
			}else {
				tail.next=currElement;
				tail=currElement;
			}
			data=s.nextInt();
		}
		return head;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer> head=takeInput();
		print(head);
		System.out.println();
		System.out.println(length(head));
		Node<Integer> winner=shooting(head);
		System.out.println(winner);

	}

}
