package DataStructure;

public class LinkedList_FloydCycleDetectAlgorithm {

	public static Node<Integer> createLL(){
		Node<Integer> n1=new Node<Integer>(1);
		Node<Integer> n2=new Node<Integer>(2);
		Node<Integer> n3=new Node<Integer>(3);
		Node<Integer> n4=new Node<Integer>(4);
		Node<Integer> n5=new Node<Integer>(5);
		n1.next=n2;
		n2.next=n3;
		n3.next=n4;
		n4.next=n5;
		n5.next=n3;
		return n1;
	}
	public static boolean isCycle(Node<Integer> head) {
		Node<Integer>fast= head,slow=head;
		while(fast!=null && fast.next!=null) {
			fast=fast.next.next;
			slow=slow.next;
			if(fast==slow)
				return true;
		}
		return false;
	}
	public static int findStartingNode(Node<Integer> head) {
		Node<Integer>fast= head,slow=head;
		boolean isCycle=false;
		//First checking wheather cycle is present or not
		while(fast!=null && fast.next!=null) {
			fast=fast.next.next;
			slow=slow.next;
			if(fast==slow) {
				isCycle= true;
				break;
			}
		}
		// If cycle is present 
		// find starting position of cycle
		if(isCycle) {
			slow=head;
			int count=0;
			while(fast!=slow) {
				fast=fast.next;
				slow=slow.next;
				count++;
			}
			return count;
		}
		return -1;

	}
	public static Node<Integer> breakTheCycle(Node<Integer> head){
		Node<Integer>fast= head,slow=head;
		boolean isCycle=false;
		//First checking wheather cycle is present or not
		while(fast!=null && fast.next!=null) {
			fast=fast.next.next;
			slow=slow.next;
			if(fast==slow) {
				isCycle= true;
				break;
			}
		}
		// If cycle is present 
		// find starting position of cycle
		if(isCycle) {
			slow=head;
			int count=0;
			while(fast!=slow) {
				fast=fast.next;
				slow=slow.next;
				count++;
			}
		}
		// Breaking the cycle
		// Start moving fast until fast.next=slow
		// then set fast.next=null
		while(fast.next!=slow) {
			fast=fast.next;
		}
		fast.next=null;
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
		// TODO Auto-generated method stub
		Node<Integer> head=createLL();
		System.out.println(isCycle(head));
		if(isCycle(head))
			System.out.println("Starting index node of cycle is "+findStartingNode(head));
		else
			print(head);
		if(findStartingNode(head)!=-1) {
			head=breakTheCycle(head);
			print(head);
		}


	}

}
