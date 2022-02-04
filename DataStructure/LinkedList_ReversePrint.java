package DataStructure;

public class LinkedList_ReversePrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer> head=createLinkedList();
		recursiveOrignalPrint(head);
		System.out.println();
		printReverse(head);
		System.out.println();
		System.out.println(isPalindrome(head));

	}
	public static Node<Integer> createLinkedList(){
		Node<Integer> n1=new Node<Integer>(1);
		Node<Integer> n2=new Node<Integer>(2);
		Node<Integer> n3=new Node<Integer>(3);
		Node<Integer> n4=new Node<Integer>(2);
		Node<Integer> n5=new Node<Integer>(2);
		Node<Integer> n6=new Node<Integer>(1);
	//	Node<Integer> n7=new Node<Integer>(1);
		n1.next=n2;
		n2.next=n3;
		n3.next=n4;
		n4.next=n5;
		n5.next=n6;
	//	n6.next=n7;
		return n1;
	}
	public static void recursiveOrignalPrint(Node<Integer> head) {
		if(head==null)
			return;
		System.out.print(head.data+" ");
		recursiveOrignalPrint(head.next);
	}
	public static void printReverse(Node<Integer> head) {
		Node<Integer> temp=head;
		if(temp==null) {
			return;
		}
		Node<Integer> pass=temp.next;
		printReverse(pass);
		System.out.print(temp.data+" ");
	}
	public static boolean isPalindrome(Node<Integer> head) {
		int len=length(head);
		Node<Integer> temp=head;
		Node<Integer> temp1=head;
		Node<Integer> temp2=null;
		if(len%2!=0) {
			//lent first LL length
			int lent=len/2+1;
			int count=1;
			while(count!=lent) {
				temp=temp.next;
				count++;
			}
			//breaking LL
			temp2=temp.next;
			temp.next=null;
			//length of 2nd LL
			int lenth=len-lent;
			//1 to lent-1 check equality
			int flag=1;
			while(flag!=lent) {
				// temp start node of 2nd LL
				Node<Integer> check=temp2;
				int count1=1;
				//Retrival of last element
				while(count1!=lenth) {
					check=check.next;
					count1++;
				}
				if(temp1.data!=check.data) {
					return false;
				}
				temp1=temp1.next;
				lenth--;
				flag++;
			}
			
		}else {
			//lent first LL length
			int lent=len/2;
			int count=1;
			while(count!=lent) {
				temp=temp.next;
				count++;
			}
			//breaking LL
			temp2=temp.next;
			temp.next=null;
			//length of 2nd LL
			int lenth=len-lent;
			//1 to lent-1 check equality
			int flag=1;
			while(flag!=lent+1) {
				// temp start node of 2nd LL
				Node<Integer> check=temp2;
				int count1=1;
				//Retrival of last element
				while(count1!=lenth) {
					check=check.next;
					count1++;
				}
				if(temp1.data!=check.data) {
					return false;
				}
				temp1=temp1.next;
				lenth--;
				flag++;
			}
			
		}
		return true;
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

}
