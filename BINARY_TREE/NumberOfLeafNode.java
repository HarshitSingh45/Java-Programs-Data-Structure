package BINARY_TREE;

import java.util.Scanner;

public class NumberOfLeafNode {
	
	public static BinaryTreeNode<Integer> takeInput(boolean isRoot, int parentData, boolean isLeft){
		if(isRoot)
			System.out.println("Enter the root data ");
		else {
			if(isLeft)
				System.out.println("Enter the left child of "+parentData);
			else
				System.out.println("Enter the right child of "+parentData);
		}
		Scanner s=new Scanner(System.in);
		int dat=s.nextInt();
		if(dat==-1)
			return null;
		BinaryTreeNode<Integer> root=new BinaryTreeNode<Integer>(dat);
		BinaryTreeNode<Integer> leftchild=takeInput(false, dat, true);
		BinaryTreeNode<Integer> rightchild=takeInput(false, dat, false);
		root.left=leftchild;
		root.right=rightchild;
		return root;
	}

	public static void print(BinaryTreeNode<Integer> root) {
		if(root==null)
			return;
		System.out.print("R"+root.data+": ");
		if(root.left!=null)
			System.out.print("L"+root.left.data+", ");
		if(root.right!=null)
			System.out.print("R"+root.right.data);
		System.out.println();
		print(root.left);
		print(root.right);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTreeNode<Integer> root=takeInput(true,0,false);
		print(root);
		System.out.println("Number of Leaf node is "+numOfLN(root));

	}
	public static int numOfLN(BinaryTreeNode<Integer> root) {
		if(root==null)
			return 0;
		if(root.left==null && root.right==null)
			return 1;
		int leftLN=numOfLN(root.left);
		int rightLN=numOfLN(root.right);
		return leftLN+rightLN;
	}

}
