package DataStructure;

import java.util.Scanner;

public class LinkedList_skip_M_delete_N {
	
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
		Node<Integer> result=skipMdeleteN(head,3,2);
		print(result);
		Node<Integer> result1=skipMdeleteN(head,3,2,3,2);
		print(result1);
		

	}
	
	public static Node<Integer> skipMdeleteN(Node<Integer> head,int m,int n){
		//int count1=0,count2=0;
		Node<Integer> temp=head,tem=null;
		while(temp!=null) {
			int count1=0;
			while(count1!=m && temp!=null) {
				count1++;
				tem=temp;
				temp=temp.next;
			}
			int count2=0;
			while(count2!=n && temp!=null) {
				count2++;
				temp=temp.next;
			}
			tem.next=temp;	
		}
		return head;
	}
	
	public static Node<Integer> skipMdeleteN(Node<Integer> head,int M, int N, int m, int n){
		if(head==null)
            return null;
		if(m!=0) {
			head.next=skipMdeleteN(head.next,M,N, m-1, n);
			return head;
		}else if(m==0 && n>1) {
			return skipMdeleteN(head.next,M,N, m, n-1);
		}else/* if(m==0 && n==1) */{
			return skipMdeleteN(head.next, M, N,M, N);
		}
	}

}
