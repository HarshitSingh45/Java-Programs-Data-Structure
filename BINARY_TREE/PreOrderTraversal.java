package BINARY_TREE;

import java.util.Scanner;

public class PreOrderTraversal {

	public static BinaryTreeNode<Integer> takeInput(boolean isRoot,int parentData,boolean isLeft){
		if(isRoot)
			System.out.println("enter root node ");
		else {
			if(isLeft)
				System.out.println("enter left child of "+parentData);
			else
				System.out.println("enter right child of "+parentData);
		}
		Scanner s=new Scanner(System.in);
		int data=s.nextInt();
		if(data==-1) {
			return null;
		}
			BinaryTreeNode<Integer> root=new BinaryTreeNode<Integer>(data);
			BinaryTreeNode<Integer> leftchild=takeInput(false, data, true);
			BinaryTreeNode<Integer> rightchild=takeInput(false, data, false);
			root.left=leftchild;
			root.right=rightchild;
		return root;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTreeNode<Integer> root=takeInput(true,0,true);
		print(root);

	}
	public static void print(BinaryTreeNode<Integer> root) {
		if(root==null)
			return;
		System.out.println(root.data);
		print(root.left);
		print(root.right);
	}

}
