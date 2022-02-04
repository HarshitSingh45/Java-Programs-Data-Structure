package BINARY_TREE;

public class PrintNodesAtDepth_K {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTreeUse bt =new BinaryTreeUse();
		BinaryTreeNode<Integer> root=bt.takeInput(true, 0, false);
		bt.print(root);
		printDepthK(root,2);

	}

	public static void printDepthK(BinaryTreeNode<Integer> root,int k) {
		if(root==null)
			return;
		if(k==0) {
			System.out.print(root.data+" ");
			return;
		}
		printDepthK(root.left, k-1);
		printDepthK(root.right, k-1);
	}
}
