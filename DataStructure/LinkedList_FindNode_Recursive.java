package DataStructure;

import java.util.Scanner;

public class LinkedList_FindNode_Recursive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer> head= takeInput();
		print(head);
		System.out.println("Position of number is "+findNodeRec(head,2));

	}
	
	public static int findNodeRec(Node<Integer> head, int n) {
		if(head==null)
			return -1;
		if(head.data==n)
			return 0;
		int res=findNodeRec(head.next, n);
		if(res==-1)
			return -1;
		else
			return res+1;
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
