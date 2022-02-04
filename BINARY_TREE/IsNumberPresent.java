package BINARY_TREE;

public class IsNumberPresent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTreeUse bt =new BinaryTreeUse();
		BinaryTreeNode<Integer> root=bt.takeInput(true, 0, false);
		System.out.println(isNumPresent(root,3));

	}
	public static boolean isNumPresent(BinaryTreeNode<Integer> root,int num) {
		if(root==null)
			return false;
		if(root.data==num)
			return true;
		if(isNumPresent(root.left, num))
			return true;
		if(isNumPresent(root.right, num))
			return true;
		else
			return false;
		
	}

}
