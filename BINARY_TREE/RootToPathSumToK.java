package BINARY_TREE;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class RootToPathSumToK {
	
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
	public static void printLevelWise(BinaryTreeNode<Integer> root) {
		if(root==null)
			return;
		Queue<BinaryTreeNode<Integer>> q= new LinkedList<BinaryTreeNode<Integer>>();
		q.add(root);
		while(!q.isEmpty()) {
			BinaryTreeNode<Integer> parent=q.poll();
			System.out.print(parent.data+" --> ");
			if(parent.left!=null) {
				System.out.print(parent.left.data+" ");
				q.add(parent.left);
			}
			else
				System.out.print("-1 ");
			if(parent.right!=null) {
				System.out.print(parent.right.data+" ,");
				q.add(parent.right);
			}else
				System.out.print("-1 ");
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTreeNode<Integer> root=takeInput();
		String s="";
		helper(root,13,s);

	}
	public static void helper(BinaryTreeNode<Integer> root, int k, String s) {
		if(root==null)
			return;
		if(root.data==k && root.left==null && root.right==null) {
			String add=Integer.toString(root.data);
			s=s+add;
			System.out.println(s);
			return;
		}
		String add=Integer.toString(root.data);
		s=s+add+" ";
		helper(root.left, k-root.data, s);
		helper(root.right, k-root.data, s);
		
	}

}
