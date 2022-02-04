package BINARY_TREE;

public class ReplaceNodeWithDepth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTreeUse bt=new BinaryTreeUse();
		BinaryTreeNode<Integer> root=bt.takeInput(true, 0, false);
		bt.print(root);
		replacenodewithdepth(root);
		bt.print(root);

	}
	public static void replacenodewithdepth(BinaryTreeNode<Integer> root){
		pri(root,0);
	}
	public static void pri(BinaryTreeNode<Integer> root,int d) {
		if(root==null)
			return;
		root.data=d;
		pri(root.left, d+1);
		pri(root.right, d+1);

	}

}
