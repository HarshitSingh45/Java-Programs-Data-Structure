package BINARY_TREE;

import java.util.LinkedList;
import java.util.Queue;

public class TreeUsingInorderPostorder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] post= {1 ,4 ,7 ,6 ,3 ,13 ,14 ,10 ,8 };

		int[] in  =	{1 ,3 ,4 ,6 ,7 ,8 ,10 ,13 ,14};
		BinaryTreeNode<Integer> root=buildTreeHelper(post,in,0,post.length-1,0,in.length-1);
		BinaryTreeNode<Integer> root1 = getTreeFromPostAndIn(post, in, 0, post.length-1 ,0 , in.length-1);
		print(root);
		System.out.println();
		print(root1);

	}


	private static BinaryTreeNode<Integer> buildTreeHelper(int[] post, int[] in, int siPost, int eiPost, int siIn, int eiIn) {
		// TODO Auto-generated method stub
		if((siPost>eiPost)||(siIn>eiIn))
			return null;
		int rootData=post[eiPost];
		BinaryTreeNode<Integer> root=new BinaryTreeNode<Integer>(rootData);
		int rootIndex=-1;
		int count=0; //no of elements in LST
		for(int i=siIn;i<eiIn;i++) {
			if(rootData==in[i]) {
				rootIndex=i;
				break;
			}
			count++;
		}
		// LST
		int siPostLeft=siPost;
		int eiPostLeft=siPost+count-1; //check
		int siInLeft=siIn;
		int eiInLeft=rootIndex-1;
		// RST
		int siPostRight=eiPostLeft+1;
		int eiPostRight=eiPost-1;
		int siInRight=rootIndex+1;
		int eiInRight=eiIn;

		root.left=buildTreeHelper(post, in, siPostLeft, eiPostLeft, siInLeft, eiInLeft);
		root.right=buildTreeHelper(post, in, siPostRight, eiPostRight, siInRight, eiInRight);

		return root;
	}

	public static BinaryTreeNode<Integer> getTreeFromPostAndIn(int[] post,
			int[] in,int postS,int postE,int inS,int inE){
		if(inS>inE){
			return null;
		}
		int rootData = post[postE];
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
		int i = inS;
		while(i<=inE){
			if(in[i]== rootData){
				break;
			}
			i++;
		}
		int leftInStart = inS;
		int leftInEnd = i-1;
		int rightInStart = i+1;
		int rightInEnd = inE;

		int leftPostStart = postS;
		int rightPostEnd= postE-1;
		int leftLength = leftInEnd-leftInStart+1;
		int leftPostEnd = leftPostStart+leftLength-1;
		int rightPostStart= leftPostEnd+1;


		root.left = getTreeFromPostAndIn(post,in,leftPostStart,leftPostEnd,leftInStart,leftInEnd);
		root.right = getTreeFromPostAndIn(post,in,rightPostStart,rightPostEnd,rightInStart,rightInEnd);
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
