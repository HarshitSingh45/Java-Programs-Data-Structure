package BINARY_TREE;

import java.util.Scanner;

public class PostOrderPrint {

	public static BinaryTreeNode<Integer> takeInput(boolean isroot,int data,boolean isleft){
		if(isroot)
			System.out.println("root data");
		else {
			if(isleft)
				System.out.println("enter left of "+data);
			else
				System.out.println("enter right of "+data);
		}
		Scanner s= new Scanner(System.in);
		int dat=s.nextInt();
		if(dat==-1)
			return null;
		BinaryTreeNode<Integer> root=new BinaryTreeNode<Integer>(dat);
		BinaryTreeNode<Integer> lft=takeInput(false, dat, true);
		BinaryTreeNode<Integer> rgt=takeInput(false, dat, false);
		root.left=lft;
		root.right=rgt;
		return root;
	}
	public static void postOrderPrint(BinaryTreeNode<Integer> root) {
		if(root==null)
			return;
		postOrderPrint(root.left);
		postOrderPrint(root.right);
		System.out.println(root.data);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTreeNode<Integer> root=takeInput(true, 0, false);
		postOrderPrint(root);

	}

}
