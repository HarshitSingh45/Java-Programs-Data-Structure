package BINARY_TREE;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class PrintNodesAtDistance_k_fromTargetNode {
	
	public static BinaryTreeNode<Integer> takeInput() {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		int rootdata=s.nextInt();
		if(rootdata==-1)
			return null;
		BinaryTreeNode<Integer> root=new BinaryTreeNode<Integer>(rootdata);
		Queue<BinaryTreeNode<Integer>> q=new LinkedList<BinaryTreeNode<Integer>>();
		q.add(root);
		while(!q.isEmpty()) {
			BinaryTreeNode<Integer> temp=q.poll();
			int lvalue= s.nextInt();
			if(lvalue!=-1) {
				BinaryTreeNode<Integer> leftChild=new BinaryTreeNode<Integer>(lvalue);
				q.add(leftChild);
				temp.left=leftChild;
			}
			int rvalue= s.nextInt();
			if(rvalue!=-1) {
				BinaryTreeNode<Integer> rightChild=new BinaryTreeNode<Integer>(rvalue);
				q.add(rightChild);
				temp.right=rightChild;
			}
		}

		return root;
	}

	public static void print(BinaryTreeNode<Integer> root) {
		if(root.data==-1)
			return;
		Queue<BinaryTreeNode<Integer>> q=new LinkedList<BinaryTreeNode<Integer>>();
		q.add(root);
		while(!q.isEmpty()) {
			BinaryTreeNode<Integer> parent=q.poll();
			System.out.print(parent.data+":");
			if(parent.left!=null) {
				System.out.print("L:"+parent.left.data+",");
				q.add(parent.left);
			}
			else
				System.out.print("L:"+"-1"+",");
			if(parent.right!=null) {
				System.out.print("R:"+parent.right.data);
				q.add(parent.right);
			}
			else
				System.out.print("R:"+"-1");
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTreeNode<Integer> root=takeInput();
		findNode(root, 3, 3);

	}
	
	public static int findNode(BinaryTreeNode<Integer> root, int node, int k){
        if(root==null)
            return Integer.MIN_VALUE;
        if(root.data==node){
            printAtDepth_k(root,k);
            return k-1;
        }
        int lft=findNode(root.left,node,k);
        if(lft==0) {
        	System.out.println(root.data);
        	return Integer.MIN_VALUE;
        }
        if(lft!=Integer.MIN_VALUE){
            printAtDepth_k(root.right,lft-1);
            return lft-1;
        }
        int rgt=findNode(root.right,node,k);
        if(rgt==0) {
        	System.out.println(root.data);
        	return Integer.MIN_VALUE;
        }
        if(rgt!=Integer.MIN_VALUE){
            printAtDepth_k(root.left,rgt-1);
            return rgt-1;
        }
        
        return Integer.MIN_VALUE;
        
    }
	
	 public static void printAtDepth_k(BinaryTreeNode<Integer> root, int k){
	        if(root==null)
	            return;
	        if(k==0){
	            System.out.println(root.data);
	            return;
	        }
	        printAtDepth_k(root.left,k-1);
	        printAtDepth_k(root.right,k-1);
	    }

}
