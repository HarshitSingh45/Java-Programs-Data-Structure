package BINARY_TREE;

import java.util.Scanner;

public class LargestNode {
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
	public static int largest(BinaryTreeNode<Integer> root) {
		if(root==null)
			return -1;
		int l=largest(root.left);
		int r=largest(root.right);
		return Math.max(root.data, Math.max(l, r));
	}
	public static int numofgreaterNode(BinaryTreeNode<Integer> root,int x){
		if(root==null){
            return 0;
        }
		int l=numofgreaterNode(root.left, x);
		int r=numofgreaterNode(root.right, x);
		if(root.data>x)
			return 1+l+r;
		else
			return l+r;
//        int val=0;
//        
//        if(root.data>x){
//            val = 1;
//        }
//        int left = numofgreaterNode(root.left,x);
//        int right = numofgreaterNode(root.right,x);
//        val = val+left+right;
//            return val;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTreeNode<Integer> root=takeInput(true, 0, false);
		System.out.println(largest(root));
		System.out.println(numofgreaterNode(root,5));

	}

}
