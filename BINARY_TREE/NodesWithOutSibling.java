package BINARY_TREE;

public class NodesWithOutSibling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTreeUse bt=new BinaryTreeUse();
		BinaryTreeNode<Integer> root=bt.takeInput(true, 0, false);
		nodesWithoutSibling(root);

	}

	public static void nodesWithoutSibling(BinaryTreeNode<Integer> root) {
		if(root==null)
			return;
		if(root.left==null&&root.right!=null) 
			System.out.print(root.right.data+" ");
		if(root.left!=null&&root.right==null)
			System.out.print(root.left.data+" ");
		nodesWithoutSibling(root.left);
		nodesWithoutSibling(root.right);
		
	}

}
