package BINARY_TREE;

import java.util.LinkedList;
import java.util.Queue;

public class TreeUsingPreorderInorder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] preorder= {1 ,2 ,4 ,5 ,3 ,6 ,7 };
		int[]inorder= {4, 2, 5, 1, 6, 3, 7};
		BinaryTreeNode<Integer> root=buildTree(preorder, inorder);
		print(root);

	}
	public static BinaryTreeNode<Integer> buildTree(int[] preOrder, int[] inOrder) {
		//Your code goes here
		if(preOrder.length==0&&inOrder.length==0) {
			return null;
			}
		//Root node - is the first element of preOrde[]
		BinaryTreeNode<Integer> root=new BinaryTreeNode<Integer>(preOrder[0]);
		int i=0;
		int temp=root.data;
		// find where the root element is in inOrder[]
		// i counter will find the index of root node  
		while(inOrder[i]!=temp)
			i++;
		// Assign rootIndex
		int rootIndex=i;
		// Elements before the rootIndex in inOrde[] are elements of leftSubtree i.e inleft
		// in preOrder[] elements after rootnode till the size of leftsub tree will be the lements of preleft
		// Size of inleft and preleft are same becasuse they denotes same tree, just the elements are read in different way
		int[] inleft=new int[rootIndex];
		int[] preleft=new int[rootIndex];
		// insert elements into inleft until rootNode is found
		for(i=0;i<rootIndex;i++) {
			inleft[i]=inOrder[i];
		}
		int k=0;
		int[] inright=new int[inOrder.length-rootIndex-1];
		int[] preright=new int[inOrder.length-rootIndex-1];
		//After the root node all elements left in inorde[] are the elements of inright;
		for(i=rootIndex+1;i<inOrder.length;i++) {
			inright[k]=inOrder[i];
			k++;
		}
		// element at 0 index is root in preorder
		// starting from index 1 to the size of inleft/preleft [] are the elements of preleft[]
		for(i=0;i<preleft.length;i++) {
			preleft[i]=preOrder[i+1];
		}
		k=0;
		// all the elements left in preoder[] are the elements of preright[]
		for(i=rootIndex+1;i<preOrder.length;i++) {
			preright[k]=preOrder[i];
			k++;
		}
		// Call recursion on left and right subtree
		// and connect it with root-left & right;
		root.left=buildTree(preleft, inleft);
		root.right=buildTree(preright, inright);
		return root;
		
	}
	
	public static void print(BinaryTreeNode<Integer> root) {
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

}
