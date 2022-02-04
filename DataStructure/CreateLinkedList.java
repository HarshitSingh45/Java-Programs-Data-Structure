package DataStructure;

public class CreateLinkedList {

	public static void main(String[] args) {

		/*
		 * Node<Integer> n1;
		 * This is reference to node
		 *
		 *
		 * Node<Integer> n1=new Node(10);
		 * This creates a new node of data value=10
		 */

		Node<Integer> head = createLinkedList();
		print(head);
//		print(head.next);
//		print(head.next.next);
//		//INCREMENT EACH NODE BY 1
//		increment(head);
//		print(head);
//		//LENGTH OF LINKED LIST
//		System.out.println(length(head));
//		//PRINT iTH NODE
//		//ASSUME NODE INDEX STARTS FROM 0
//		printNode(head,2);
//		//INSERT NODE AT POS POSITION
//		Node<Integer> heed = insert(head,4,25);
//		print(heed);
//		Node<Integer> hed = insert(head,0,0);
//		print(hed);
//		Node<Integer> hd = insert(head,length(head),100);
//		print(hd);
//		//DELETE NODE FROM A GIVEN POSITION
//		Node<Integer> o=new Node<Integer>(null);
//		Node<Integer> delete = delete(head,0);
//		print(delete);
//		Node<Integer> delet = delete(head,0);
//		print(delet);
//		Node<Integer> dele = delete(head,length(head)-1);
//		print(dele);
		

	}

	public static Node<Integer> createLinkedList() {
		// Create all the nodes
		Node<Integer> n1=new Node<Integer>(10);
		Node<Integer> n2=new Node<Integer>(20);
		Node<Integer> n3=new Node<Integer>(30);
		Node<Integer> n4=new Node<Integer>(40);

		// Establish the link between the nodes
		n1.next=n2;
		n2.next=n3;
		n3.next=n4;
		//n4.next stores null, bcoz its the last element of the LL & always last node stores null in its next

		//will return the head node of the LL
		return n1;
	}

	public static void print(Node<Integer> head) {
		//Ideally tou shouls iterate LL through temporary variable
		Node<Integer> temp=head;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
			//In arrays we used to increment by i++
			//here we do this by head=head.next;
		}
		System.out.println();
	}

	public static void increment(Node<Integer> head) {
		Node<Integer> temp=head;
		while(temp!=null) {
			temp.data++;
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

	public static void printNode(Node<Integer> head,int i) {
		//ASSUME NODE INDEX STARTS FROM 0
		Node<Integer> temp=head;
		int count=0;
		while(temp!=null) {
			if(count==i)
				System.out.println(temp.data);
			count++;
			temp=temp.next;
		}

	}
	public static Node<Integer> insert(Node<Integer> head, int pos, int data) {
		Node<Integer> temp=head;
		Node<Integer> insert=new Node<Integer>(data);
		int count=0;
		//AT POSITION GREATER THAN LENGTH (POS > LENGTH)
		if(pos>length(head))
			return head;
		// AT THE VERY FIRST POSITION (POS=0)
		else if(pos==0) {
			insert.next=head;
			return insert;
		}
		// AT POSITIONS BETWEEN THE LL AND AT THE POSITION = LENGTH (POS= 1 TO LENGTH)
		else {
			while(count!=pos-1) {
				count++;
				temp=temp.next;
			}
			insert.next=temp.next;
			temp.next=insert;
			return head;

		}
		
	}
	public static Node<Integer> delete(Node<Integer> head, int pos) {
		Node<Integer> temp=head;
		if(pos>=length(head)||head==null) {
			return head;
		}
		else if(pos==0) {
			return temp.next;
			
		}
		else {
			int count=0;
			while(count!=pos-1) {
				count++;
				temp=temp.next;
			}
			temp.next=temp.next.next;
			return head;
		}
	}

}
