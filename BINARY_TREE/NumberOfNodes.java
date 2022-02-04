package BINARY_TREE;

import java.util.Scanner;

public class NumberOfNodes {
	
	public static BinaryTreeNode<Integer> takeInput(boolean isRoot, int parentData, boolean isLeft){
		if(isRoot)
			System.out.println("Enter the root node");
		else {
			if(isLeft)
				System.out.println("Enter the left child of "+parentData);
			else
				System.out.println("Enter the right child of "+parentData);
		}
		
		Scanner s=new Scanner(System.in);
		int d=s.nextInt();
		if(d==-1) {
			return null;
		}
		BinaryTreeNode<Integer> root=new BinaryTreeNode<Integer>(d);
		BinaryTreeNode<Integer> leftroot=takeInput(false,d,true);
		BinaryTreeNode<Integer> rightroot=takeInput(false,d,false);
		root.left=leftroot;
		root.right=rightroot;
		return root;
	}
	public static void print(BinaryTreeNode<Integer> root) {
		//Base Case
		if(root==null)
			return;
		System.out.print("R-"+root.data+": ");// We only know root data, we cant tell wheater it have childrens or not
		//These checks are not base case, this helps us in printing tree in more simple way to comprehend
		if(root.left!=null)
			System.out.print("L"+root.left.data+",");
		if(root.right!=null)
			System.out.print(" R"+root.right.data);
		System.out.println();
		//Call recursion on left and right sub tree
		print(root.left);
		print(root.right);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTreeNode<Integer> root=takeInput(true,0,true);
		print(root);
		System.out.println("Number of nodes in tree is "+numOfNodes(root));
		System.out.println("Sum of nodes is "+sumOfNodes(root));

	}
	public static int numOfNodes(BinaryTreeNode<Integer> root) {
		if(root==null)
			return 0;
		int leftNodeCount=numOfNodes(root.left);
		int rightNodeCount=numOfNodes(root.right);
		return 1+leftNodeCount+rightNodeCount;
	}
	public static int sumOfNodes(BinaryTreeNode<Integer> root) {
		if(root==null)
			return 0;
		int sumLeft=sumOfNodes(root.left);
		int sumRight=sumOfNodes(root.right);
		return root.data+sumLeft+sumRight;
	}

}
