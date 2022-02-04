package BINARY_TREE;

public class MirrorBinaryTree {

	public static void main(String[] args) {

		BinaryTreeUse bt=new BinaryTreeUse();
		BinaryTreeNode<Integer> root=bt.takeInput(true, 0, false);
		bt.print(root);
		mirrorBinaryTree(root);
		bt.print(root);
//		root=mirrorTree(root);
//		bt.print(root);
	}
	
	public static void mirrorBinaryTree(BinaryTreeNode<Integer> root) {
		if(root==null)
			return;
		BinaryTreeNode<Integer> temp=root.right;
		root.right=root.left;
		root.left=temp;
		mirrorBinaryTree(root.left);
		mirrorBinaryTree(root.right);
	}

	public static BinaryTreeNode<Integer> mirrorTree(BinaryTreeNode<Integer> root) {
		if(root==null)
			return null;
		BinaryTreeNode<Integer> temp=mirrorTree(root.left);;
		root.left=mirrorTree(root.right);
		root.right=temp;
		return root;
	}

}
