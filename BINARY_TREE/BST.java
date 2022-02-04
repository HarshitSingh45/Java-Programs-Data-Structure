package BINARY_TREE;
class BSTdeletereturn{
	BinaryTreeNode<Integer> root;
	boolean deleted;
	public BSTdeletereturn(BinaryTreeNode<Integer> root, boolean deleted) {
		// TODO Auto-generated constructor stub
		this.root=root;
		this.deleted=deleted;
	}
}
public class BST {
	
	private BinaryTreeNode<Integer> root;
	private int size;
	private static int largest(BinaryTreeNode<Integer> root) {
		if(root==null)
			return Integer.MAX_VALUE;
		int l=largest(root.left);
		int r=largest(root.right);
		return Math.min(root.data, Math.min(l, r));
	}
	public void insert(int x) {
		root=insertHelper(root,x);
		size++;
	}
	private static BinaryTreeNode<Integer> insertHelper(BinaryTreeNode<Integer> root, int x){
		if(root==null) {
			BinaryTreeNode<Integer> newNode=new BinaryTreeNode<Integer>(x);
			return newNode;
		}
		if(x<root.data) {
			root.left=insertHelper(root.left, x);
		}
		else {
			root.right=insertHelper(root.right, x);
		}
		return root;
	}
	
	public boolean isPresent(int x) {
		return isPresentHelper(root,x);
	}
	private static boolean isPresentHelper(BinaryTreeNode<Integer> root, int x) {
		if(root==null)
			return false;
		if(root.data==x)
			return true;
		if(x<root.data)
			return isPresentHelper(root.left, x);
		else
			return isPresentHelper(root.right, x);
	}
	private static BSTdeletereturn deleteHelper(BinaryTreeNode<Integer> root, int x) {
		if(root==null) {
			return new BSTdeletereturn(null, false);
		}
		if (root.data<x) {
			BSTdeletereturn rightop=deleteHelper(root.right, x);
			root.right=rightop.root;
			rightop.root=root;
			return rightop;
		}
		if (root.data>x) {
			BSTdeletereturn leftop=deleteHelper(root.left, x);
			root.left=leftop.root;
			leftop.root=root;
			return leftop;
		}
		if(root.left==null && root.right==null) {
			return new BSTdeletereturn(null, true);
		}
		if(root.left!=null && root.right==null) {
			return new BSTdeletereturn(root.left, true);
		}
		if(root.left==null && root.right!=null) {
			return new BSTdeletereturn(root.right, true);
		}
		int rightMax=largest(root.right);
		root.data=rightMax;
		BSTdeletereturn output= deleteHelper(root.right, rightMax);
		root.right=output.root;
		return new BSTdeletereturn(root, true);
	}
	public boolean delete(int x) {
		BSTdeletereturn output=deleteHelper(root, x);
		root=output.root;
		if(output.deleted) {
			size--;
		}
		return output.deleted;
	}
	
	public int getSize() {
		return size;
	}
	
	public void printTree() {
		printTreeHelper(root);
	}
	private static void printTreeHelper(BinaryTreeNode<Integer> root) {
		if(root==null)
			return;
		System.out.print(root.data+" ");
		if(root.left!=null) {
			System.out.print(root.left.data+" ");
		}
		if(root.right!=null) {
			System.out.print(root.right.data+" ");
		}
		System.out.println();
		printTreeHelper(root.left);
		printTreeHelper(root.right);
	}
	
	

}
