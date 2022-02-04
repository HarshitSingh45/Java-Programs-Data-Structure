package DataStructure;

import java.util.Scanner;

/*public class LinkedList_BubleSort {

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

	public static int length(Node<Integer> head) {
		Node<Integer> temp=head;
		int count=0;
		while(temp!=null) {
			count++;
			temp=temp.next;
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer> head=takeInput();
		print(head);
		Node<Integer> result=bubbleSort(head);
		print(result);

	}

	/*public static Node<Integer> bubbleSort(Node<Integer> head){
		Node<Integer> temp=head;
		int len=length(head);
		int pass=len-1;
		while(pass>0) {
			Node<Integer> prev=null;
			Node<Integer> curr=head;
			Node<Integer> nxt=head.next;
			while(curr.next!=null) {
				if(curr.data>nxt.data) {
					if(prev==null) {
						curr.next=nxt.next;
						nxt.next=curr;
						prev=nxt;
						nxt=curr.next;

					}else {
						curr.next=nxt.next;
						prev.next=nxt;
						nxt.next=curr;
						prev=nxt;
						nxt=curr.next;
						

					}
				}else {
					
				}

			}
			pass--;
		}
	}
}
*/
