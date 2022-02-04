package BINARY_TREE;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class LevelOrderTraversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTreeNode<Integer> root=takeInput();
		print(root);

	}
	public static BinaryTreeNode<Integer> takeInput(){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter root data");
		int rootData=s.nextInt();
		if(rootData==-1)
			return null;
		BinaryTreeNode<Integer> root=new BinaryTreeNode<Integer>(rootData);
		Queue<BinaryTreeNode<Integer>> q=new LinkedList<BinaryTreeNode<Integer>>();
		q.add(root);
		while(!q.isEmpty()) {
			BinaryTreeNode<Integer> parent=q.poll();
			System.out.println("Enter left child of "+parent.data);
			int leftData=s.nextInt();
			if(leftData!=-1) {
				parent.left=new BinaryTreeNode<Integer>(leftData);
				q.add(parent.left);
			}
			System.out.println("Enter the right child of "+parent.data);
			int rightData=s.nextInt();
			if(rightData!=-1) {
				parent.right=new BinaryTreeNode<Integer>(rightData);
				q.add(parent.right);
			}
		}
		return root;
	}
	
	public static void print(BinaryTreeNode<Integer> root) {
		if(root==null)
			return;
		if(root.data==-1)
			return;
		Queue<BinaryTreeNode<Integer>> q=new LinkedList<BinaryTreeNode<Integer>>();
		q.add(root);
		BinaryTreeNode<Integer> add=new BinaryTreeNode<Integer>(Integer.MIN_VALUE);
		q.add(add);
		while(!q.isEmpty()) {
			BinaryTreeNode<Integer> parent=q.poll();
			if(parent.data==Integer.MIN_VALUE) {
				System.out.println();
				if(q.isEmpty())
					return;
				BinaryTreeNode<Integer> add1=new BinaryTreeNode<Integer>(Integer.MIN_VALUE);
				q.add(add1);
				continue;
			}
			System.out.print(parent.data+" ");
			if(parent.left!=null) {
				q.add(parent.left);
			}
			if(parent.right!=null) {
				q.add(parent.right);
			}
		}
		
	}
	
	
	

}
