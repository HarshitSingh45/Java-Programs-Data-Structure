package BINARY_TREE;

public class RemoveLeafNodes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTreeUse bt=new BinaryTreeUse();
		BinaryTreeNode<Integer> root=bt.takeInput(true, 0, false);
		bt.print(root);
		root=removeLeafNode(root);
		bt.print(root);

	}

	public static BinaryTreeNode<Integer> removeLeafNode(BinaryTreeNode<Integer> root) {
		if(root==null)
			return null;
		if(root.left==null && root.right==null) {
			//root=null;
			return null;
		}
		root.left=removeLeafNode(root.left);
		root.right=removeLeafNode(root.right);
		return root;
		
	}

}
