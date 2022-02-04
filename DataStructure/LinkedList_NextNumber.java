package DataStructure;

import java.util.Scanner;
class CarryNode{
	int carry;
	Node<Integer> head;
	CarryNode(int carry,Node<Integer> head){
		this.carry=carry;
		this.head=head;
	}
}
public class LinkedList_NextNumber {

	public static Node<Integer> takeInput(){
		Scanner s=new Scanner(System.in);
		int data=s.nextInt();
		Node<Integer> head=null,tail=null;
		while(data!=-1) {
			Node<Integer> curr=new Node<Integer>(data);
			if(head==null) {
				head=curr;
				tail=curr;
			}else {
				tail.next=curr;
				tail=curr;
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
	public static void main(String[] args) {
		Node<Integer> head=takeInput();
		print(head);
		head=nextLargeNumber(head);
		print(head);

	}
	public static Node<Integer> nextLargeNumber(Node<Integer> head){
		CarryNode ans;
		ans=nextNumber(head);
		if(ans.carry!=0) {
			Node<Integer> carry=new Node<Integer>(ans.carry);
			carry.next=ans.head;
			return carry;
		}
		else {
			return ans.head;
		}

	}
	public static CarryNode nextNumber(Node<Integer> head) {
		CarryNode ans;
		if(head.next==null) {
			if(head.data%10==9) {
				head.data=0;
				ans =new CarryNode(1,head);
				return ans;
			}else {
				head.data++;
				ans=new CarryNode(0,head);
				return ans;
			}
		}
		ans=nextNumber(head.next);
		if(ans.carry==0) {
			ans=new CarryNode(0,head);
			return ans;
		}else {
			if(head.data%10==9) {
				head.data=0;
				ans=new CarryNode(1,head);
				return ans;
			}else {
				head.data++;
				ans=new CarryNode(0,head);
				return ans;
			}
		}
	}

}
