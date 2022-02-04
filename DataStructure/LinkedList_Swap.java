package DataStructure;

import java.util.Scanner;

public class LinkedList_Swap {
	
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
		Node<Integer> result=swap(head,0,1);
		print(result);

	}
	public static Node<Integer> swap(Node<Integer> head,int i, int j){
		Node<Integer> temp=head,previ=null,prevj=null,iNode=null,jNode=null,tem=null,start=null;
		if(i>=length(head)||j>=length(head))
			return head;
		if(i==j)
			return head;
		int count=0;
		if(i==0) {
			while(count!=j-1) {
				count++;
				temp=temp.next;
			}
			prevj=temp;
			temp=temp.next;
			jNode=temp;
			
			prevj.next=head;
			tem=head.next;
			head.next=jNode.next;
			jNode.next=tem;
			return jNode;
		}
		
		while(count!=i-1) {
			count++;
			temp=temp.next;
		}
		previ=temp;
		temp=temp.next;
		iNode=temp;
		count+=1;
		while(count!=j-1) {
			count++;
			temp=temp.next;
		}
		prevj=temp;
		temp=temp.next;
		jNode=temp;
		previ.next=jNode;
		prevj.next=iNode;
		tem=iNode.next;
		iNode.next=jNode.next;
		jNode.next=tem;
		tem=null;
		return head;
		
	}

}
