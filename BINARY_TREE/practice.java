package BINARY_TREE;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class balancePair{
	boolean isBal;
	int height;
	public balancePair(boolean isBal,int height) {
		this.isBal=isBal;
		this.height=height;
	}
}
class Paire{
	int minimum;
	int maximum;
	public Paire(int minimum,int maximum) {
		// TODO Auto-generated constructor stub
		this.minimum=minimum;
		this.maximum=maximum;
	}
}
class pair{
	int height;
	int diameter;
	public pair(int height,int diameter) {
		// TODO Auto-generated constructor stub
		this.height=height;
		this.diameter=diameter;
	}
}
public class practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTreeNode<Integer> root=takeInput();
		printLevelWise(root);
//		System.out.println("Number of Nodes in BT is "+numOfNodes(root));
//		System.out.println("Sum of Nodes in BT is "+sumOfNodes(root));
//		preOrderTraversal(root);
//		System.out.println();
//		postOrderTraversal(root);
//		System.out.println();
//		inOrder(root);
//		System.out.println();
//		System.out.println("Largest node value is "+largestNode(root));
//		System.out.println("Number of nodes greater than 1 is "+numOfNodesGreaterThanX(root, 1));
//		System.out.println("Height of the tree is "+height(root));
//		System.out.println("Number of leaf nodes are "+numOfLeafNodes(root));
//		printAtDepth_K(root, 2);
//		System.out.println();
////		print(root);
////		replaceNodesWithDepth(root, 0);
////		print(root);
//		System.out.println("is 2 is present in tree "+isNodePresent(root, 2));
//		System.out.println("Nodes without Siblings are");
//		nodesWithoutSibling(root);
//		System.out.println();
////		removeLeafNodes(root);
////		print(root);
////		mirrorBinaryTree(root);
////		print(root);
////		System.out.println("Istree balanced ? - "+isTreeBalanced(root));
//		balancePair result=isTreeBalancedOptimized(root);
//		System.out.println("Istree balanced ? - "+result.isBal);
//		pair res=getDiameter(root);
//		System.out.println("Diameter of tree is "+res.diameter);
//		insertDuplicateNode(root);
//		printLevelWise(root);
//		Paire resu=getMinAndMax(root);
//		System.out.println(resu.maximum+" "+resu.minimum);
		ArrayList<Integer> path=nodeToPath(root,5);
		if(path==null)
			System.out.println("Not found");
		else {
			for(int i:path)
				System.out.print(i+" ");
		}

	}
	//                             BT-1
	public static BinaryTreeNode<Integer> ti(boolean isRoot, int parentData, boolean isLeft){
		if(isRoot)
			System.out.println("Enter Root data ");
		else {
			if(isLeft)
				System.out.println("Enter Left child of "+parentData);
			else
				System.out.println("Enter Right child of "+parentData);
		}
		Scanner s=new Scanner(System.in);
		int rootData=s.nextInt();
		if(rootData==-1)
			return null;
		BinaryTreeNode<Integer> root=new BinaryTreeNode<Integer>(rootData);
		root.left=ti(false, rootData, true);
		root.right=ti(false, rootData, false);
		return root;
	}
	public static void print(BinaryTreeNode<Integer> root) {
		if(root==null)
			return;
		System.out.print("R:"+root.data+" -");
		if(root.left!=null)
			System.out.print("L: "+root.left.data+", ");
		if(root.right!=null)
			System.out.print("R: "+root.right.data);
		System.out.println();
		print(root.left);
		print(root.right);
	}
	public static int numOfNodes(BinaryTreeNode<Integer> root) {
		if(root==null)
			return 0;
		return numOfNodes(root.left)+numOfNodes(root.right)+1;
		
	}
	public static int sumOfNodes(BinaryTreeNode<Integer> root) {
		if(root==null)
			return 0;
		return root.data+sumOfNodes(root.right)+sumOfNodes(root.left);
	}
	public static void preOrderTraversal(BinaryTreeNode<Integer> root) {
		if(root==null)
			return;
		System.out.print(root.data+" ");
		preOrderTraversal(root.left);
		preOrderTraversal(root.right);
	}
	public static void postOrderTraversal(BinaryTreeNode<Integer> root) {
		if(root==null)
			return;
		postOrderTraversal(root.left);
		postOrderTraversal(root.right);
		System.out.print(root.data+" ");
	}
	public static void inOrder(BinaryTreeNode<Integer> root) {
		if(root==null)
			return;
		inOrder(root.left);
		System.out.print(root.data+" ");
		inOrder(root.right);
	}
	public static int largestNode(BinaryTreeNode<Integer> root) {
		if(root==null)
			return -1;
		int leftMax=largestNode(root.left);
		int rightMax=largestNode(root.right);
		int max=Math.max(root.data, Math.max(leftMax, rightMax));
		return max;
	}
	public static int numOfNodesGreaterThanX(BinaryTreeNode<Integer> root,int x) {
		if(root==null)
			return 0;
		int lft=numOfNodesGreaterThanX(root.left, x);
		int rgt=numOfNodesGreaterThanX(root.right, x);
		if(root.data>x)
			return lft+rgt+1;
		else
			return lft+rgt;
	}
	public static int height(BinaryTreeNode<Integer> root) {
		if(root==null)
			return 0;
		int lftheight=height(root.left);
		int rgtheight=height(root.right);
		return 1+Math.max(lftheight, rgtheight);
	}
	public static int numOfLeafNodes(BinaryTreeNode<Integer> root) {
		if(root==null)
			return 0;
		if(root.left==null && root.right==null)
			return 1;
		int lftLeafNode=numOfLeafNodes(root.left);
		int rgtLeafNode=numOfLeafNodes(root.right);
		return lftLeafNode+rgtLeafNode;
	}
	public static void printAtDepth_K(BinaryTreeNode<Integer> root,int k) {
		if(root==null)
			return;
		if(k==0) {
			System.out.print(root.data+" ");
			return;
		}
		printAtDepth_K(root.left, k-1);
		printAtDepth_K(root.right, k-1);
	}
	public static void replaceNodesWithDepth(BinaryTreeNode<Integer> root,int d) {
		if(root==null)
			return;
		root.data=d;
		replaceNodesWithDepth(root.left, d+1);
		replaceNodesWithDepth(root.right, d+1);
	}
	public static boolean isNodePresent(BinaryTreeNode<Integer> root,int num) {
		if(root==null)
			return false;
		if(root.data==num)
			return true;
		return isNodePresent(root.left, num) || isNodePresent(root.right, num);
	}
	public static void nodesWithoutSibling(BinaryTreeNode<Integer> root) {
		if(root==null)
			return;
		if(root.left!=null&&root.right==null)
			System.out.print(root.left.data+" ");
		if(root.right!=null&&root.left==null)
			System.out.print(root.right.data+" ");
		nodesWithoutSibling(root.left);
		nodesWithoutSibling(root.right);
	}
	//                            BT-2
	public static BinaryTreeNode<Integer> removeLeafNodes(BinaryTreeNode<Integer> root) {
		if(root==null)
			return null;
		if(root.left==null && root.right==null)
			return null;
		root.left=removeLeafNodes(root.left);
		root.right=removeLeafNodes(root.right);
		return root;
	}
	public static void mirrorBinaryTree(BinaryTreeNode<Integer> root) {
		if(root==null)
			return;
		BinaryTreeNode<Integer> temp=root.left;
		root.left=root.right;
		root.right=temp;
		mirrorBinaryTree(root.left);
		mirrorBinaryTree(root.right);
	}
	public static boolean isTreeBalanced(BinaryTreeNode<Integer> root) {
		if(root==null)
			return true;
		int lftheight=height(root.left);
		int rgtheight=height(root.right);
		if(Math.abs(lftheight-rgtheight)>1)
			return false;
		return isTreeBalanced(root.left)&&isTreeBalanced(root.right);
	}
	public static balancePair isTreeBalancedOptimized(BinaryTreeNode<Integer> root) {
		if(root==null)
			return (new balancePair(true, 0));
		balancePair left=isTreeBalancedOptimized(root.left);
		balancePair right=isTreeBalancedOptimized(root.right);
		if(Math.abs(left.height-right.height)>1)
			return (new balancePair(false, Math.max(left.height, right.height)+1));
		if(left.isBal==false || right.isBal==false)
			return (new balancePair(false, Math.max(left.height, right.height)+1));
		return (new balancePair(true, Math.max(left.height, right.height)+1));
	}
	public static pair getDiameter(BinaryTreeNode<Integer> root) {
		if(root==null)
			return (new pair(0, 0));
		pair left=getDiameter(root.left);
		pair right=getDiameter(root.right);
		int height=Math.max(left.height,right.height) +1;
		int dist=left.height+right.height+1;
		int diameter=Math.max(dist, Math.max(left.diameter, right.diameter));
		return (new pair(height, diameter));
	}
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
	public static void insertDuplicateNode(BinaryTreeNode<Integer> root) {
		if(root==null)
			return;
		BinaryTreeNode<Integer> insert=new BinaryTreeNode<Integer>(root.data);
		BinaryTreeNode<Integer> temp=root.left;
		root.left=insert;
		insert.left=temp;
		insertDuplicateNode(temp);
		insertDuplicateNode(root.right);
	}
	public static Paire getMinAndMax(BinaryTreeNode<Integer> root) {
		//Your code goes here
        if(root==null)
			return (new Paire(Integer.MAX_VALUE, Integer.MIN_VALUE));
		Paire left=getMinAndMax(root.left);
		Paire right=getMinAndMax(root.right);
		int min=Math.min(root.data, Math.min(left.minimum, right.minimum));
		int max=Math.max(root.data, Math.max(left.maximum, right.maximum));
		return (new Paire(min, max));
	}
	
	public static ArrayList<Integer> nodeToPath(BinaryTreeNode<Integer> root,int x){
		if(root==null)
			return null;
		if(root.data==x) {
			ArrayList<Integer> output=new ArrayList<>();
			output.add(root.data);
			return output;
		}
		if(x<root.data) {
			ArrayList<Integer> output=nodeToPath(root.left, x);
			if(output!=null)
				output.add(root.data);
			return output;
		}
		if(x>root.data){
			ArrayList<Integer> output=nodeToPath(root.right, x);
			if(output!=null)
				output.add(root.data);
			return output;
		}
		return null;
	}
	

}
