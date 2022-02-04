package DataStructure;

public class LinkedList_Append {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer> head=createLinkedList();
		print(head);
		System.out.println();
		Node<Integer> result=append(head,3);
		print(result);


	}
	public static Node<Integer> createLinkedList(){
		Node<Integer> n1=new Node<Integer>(10);
		Node<Integer> n2=new Node<Integer>(20);
		Node<Integer> n3=new Node<Integer>(30);
		Node<Integer> n4=new Node<Integer>(40);
		Node<Integer> n5=new Node<Integer>(50);
		n1.next=n2;
		n2.next=n3;
		n3.next=n4;
		n4.next=n5;
		return n1;
	}
	//10--20--30--40--50

	public static Node<Integer> append(Node<Integer> head,int n){
		
		// Through recursion but time complexity is high
		
		//		if(n==0) {
		//			return head;
		//		}
		//		Node<Integer> temp=head;
		//		int len=length(head);
		//		int count=0;
		//		while(count!=len-2) {
		//			count++;
		//			temp=temp.next;
		//		}
		//		temp.next.next=head;
		//		Node<Integer> start=temp.next;
		//		temp.next=null;
		//		return append(start,n-1);
		
		//Using length function
		int p=length(head);
		if(n>p||n==0)
			return head;
		Node<Integer> temp=head;
		Node<Integer> temp1=null;
		int len=p;
		int m=len-n;
		int count=0;
		while(count!=m-1) {
			count++;
			temp=temp.next;
		}
		Node<Integer> start=temp.next;
		temp.next=null;
		temp1=start;
		while(temp1.next!=null) {
			temp1=temp1.next;
		}
		temp1.next=head;
		return start;
		
		
		//CODING NINJAS SOLUTION
		// without using length function
//		Node<Integer> fast=head;
//		Node<Integer> slow=head;
//		Node<Integer> initialHead=head;
//		for(int i=0;i<n;i++)
//			fast=fast.next;
//		
//		while(fast.next!=null) {
//			slow=slow.next;
//			fast=fast.next;
//		}
//		initialHead=slow.next;
//		slow.next=null;
//		fast.next=head;
//		return initialHead;
		

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
	public static void print(Node<Integer> head) {
		while(head!=null) {
			System.out.print(head.data+" ");
			head=head.next;
		}
	}

}
