package BINARY_TREE;

import java.util.Scanner;

public class BinaryTreeUse {
//                 1	
//	public static void print(BinaryTreeNode<Integer> root) {
//		System.out.println(root.data);
//		if(root.left!=null)
//			print(root.left);
//		if(root.right!=null)
//			print(root.right);
//	}
//   Problem = Null pointer exception
//                    2	
//	public static void print(BinaryTreeNode<Integer> root) {
//		//Base case if root ==null
//		if(root==null)
//			return;
//		System.out.println(root.data);
//		//Call recursion on left sub tree
//		print(root.left);
//		//Call recursion on right sub tree
//		print(root.right);
//	}
//   Problem is we cant decipher the printed tres	
	
	public static void print(BinaryTreeNode<Integer> root) {
		//Base Case
		if(root==null)
			return;
		System.out.print("R-"+root.data+": ");// We only know root data, we can't tell whether it have children or not
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
//             Input    1	
//	public static BinaryTreeNode<Integer> takeInput(){
//		System.out.println("Enter the root node");
//		Scanner s=new Scanner(System.in);
//		int d=s.nextInt();
//		if(d==-1) {
//			return null;
//		}
//		BinaryTreeNode<Integer> root=new BinaryTreeNode<Integer>(d);
//		BinaryTreeNode<Integer> leftroot=takeInput();
//		BinaryTreeNode<Integer> rightroot=takeInput();
//		root.left=leftroot;
//		root.right=rightroot;
//		return root;
//	}
//                Input           2 	
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
	
	public static void main(String[] args) {
		BinaryTreeNode<Integer> root=takeInput(true,0,true);
		print(root);
	}

//	public static void main(String[] args) {
//		BinaryTreeNode<Integer> root=new BinaryTreeNode<Integer>(1);
//		BinaryTreeNode<Integer> rootleft=new BinaryTreeNode<Integer>(2);
//		BinaryTreeNode<Integer> rootright=new BinaryTreeNode<Integer>(3);
//		root.left=rootleft;
//		root.right=rootright;
//		BinaryTreeNode<Integer> leftright=new BinaryTreeNode<Integer>(4);
//		rootleft.right=leftright;
//		BinaryTreeNode<Integer> rightleft=new BinaryTreeNode<Integer>(5);
//		rootright.left=rightleft;
//		print(root);
//
//	}

}
