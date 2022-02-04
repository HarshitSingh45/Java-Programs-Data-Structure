package BINARY_TREE;

import java.util.LinkedList;
import java.util.Queue;

public class TreeUsingInorderPreoderOtimized {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] preorder= {1 ,2 ,4 ,5 ,3 ,6 ,7 };
		int[]inorder= {4, 2, 5, 1, 6, 3, 7};
		BinaryTreeNode<Integer> root=buildTree(preorder, inorder, 0, preorder.length - 1, 0, inorder.length - 1);
		print(root);

	}

	public static BinaryTreeNode<Integer> buildTree(int[] pre, int[] in, int siPre, int eiPre, int siIn, int eiIn) {
		// TODO Auto-generated method stub
		if(siPre>eiPre)
			return null;
		int rootData=pre[siPre];
		BinaryTreeNode<Integer> root=new BinaryTreeNode<Integer>(rootData);
		//finding root data index & length of left subtree
		int count=0; // for finding length of left subtree
		int rootIndex=-1;
		for(int i=siIn; i<in.length; i++) {
			if(rootData==in[i]) {
				rootIndex=i; 
				break;
			}
			count++;
		}
		// For left subtree
		int siPreLeft=siPre+1;
		int eiPreLeft=siPre+count;
		int siInLeft=siIn;
		int eiInLeft=rootIndex-1;
		// for right subtree
		int siPreRight=siPre+count+1;
		int eiPreRight=eiPre;
		int siInRight=rootIndex+1;
		int eiInRight=eiIn;
		
		root.left=buildTree(pre, in, siPreLeft, eiPreLeft, siInLeft, eiInLeft);
		root.right=buildTree(pre, in, siPreRight, eiPreRight, siInRight, eiInRight);
		
		return root;
	}

	//	public static BinaryTreeNode<Integer> buildTree(int[] pre, int[] in, int startIndexPre, 
	//			int endIndexPre, int startIndexIn, int endIndexIn) {
	//		if (startIndexPre > endIndexPre || startIndexIn > endIndexIn) {
	//			return null;
	//		}
	//		int temp = pre[startIndexPre];
	//		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(temp);
	//
	//		// Find parent element from inorder
	//		int i = 0;
	//		for (int j = 0; j < in.length; j++) {
	//			if (temp == in[j]) {
	//				i = j;
	//				break;
	//			}
	//		}
	//		root.left = buildTree(pre, in, startIndexPre + 1, startIndexPre + (i - startIndexIn), startIndexIn, i - 1);
	//		root.right = buildTree(pre, in, startIndexPre + (i - startIndexIn) + 1, endIndexPre, i + 1, endIndexIn);
	//		return root;
	//	}


	/*public static BinaryTreeNode<Integer> buildTree(int[] preorder, int startPreOrderIndex, int endPreOrderIndex, int[] inorder, int startinOrderIndex,
			int endinOrderIndex) {
		if(startPreOrderIndex>endPreOrderIndex || startinOrderIndex>endinOrderIndex)
			return null;
		BinaryTreeNode<Integer> root=new BinaryTreeNode<Integer>(preorder[startPreOrderIndex]);
		int temp=preorder[startPreOrderIndex];
		int count=startinOrderIndex;
		for(int i=startinOrderIndex;i<=endinOrderIndex;i++) {
			if(inorder[i]==temp) {
				break;
			}
			count++;	
		}
		int rootIndex=count;
		root.left=buildTree(preorder, startPreOrderIndex+1, startPreOrderIndex+(rootIndex-startinOrderIndex), inorder, startinOrderIndex, rootIndex-1);
		root.right=buildTree(preorder, startPreOrderIndex+(rootIndex-startinOrderIndex), endPreOrderIndex, inorder, rootIndex+1, inorder.length-1);

		return root;
	}*/

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
