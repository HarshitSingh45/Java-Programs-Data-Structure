package DataStructure;

import java.util.Scanner;

public class LinkedList_TakeInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Node<Integer> head=takeInput();
		Node<Integer> hed=optimizedTakeInput();
		//print(head);
		print(hed);

	}
	public static Node<Integer> takeInput(){
		Scanner s=new Scanner(System.in);
		int data=s.nextInt();
		Node<Integer> head=null;
		while(data!=-1) {
			Node<Integer> currElement=new Node<Integer>(data);
			if(head==null) {
				head=currElement;
			}else {
				Node<Integer> tail=head;
				while(tail.next!=null) {
					tail=tail.next;
				}
				tail.next=currElement;		
			}
			
			data=s.nextInt();
		}
		return head;
	}
	public static Node<Integer> optimizedTakeInput(){
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
	public static void print(Node<Integer> head) {
		while(head!=null) {
			System.out.print(head.data+" ");
			head=head.next;
		}
		System.out.println();
	}

}
