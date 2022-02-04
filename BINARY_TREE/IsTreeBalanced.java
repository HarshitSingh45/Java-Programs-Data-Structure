package BINARY_TREE;
class ReturnNode{
	int height;
	boolean isBalanced;
	public ReturnNode(int heght,boolean isBalanced) {
		this.height=heght;
		this.isBalanced=isBalanced;
	}
}
public class IsTreeBalanced {

	public static void main(String[] args) {

		BinaryTreeUse bt=new BinaryTreeUse();
		BinaryTreeNode<Integer> root=bt.takeInput(true, 0, false);
		bt.print(root);
		ReturnNode obj=isBalanced(root);
		System.out.println(obj.isBalanced);
		System.out.println(obj.height);
	}
//                  Time Complexity- O(n)	
	public static ReturnNode isBalanced(BinaryTreeNode<Integer> root) {
		ReturnNode obj;
		if(root==null) {
			obj=new ReturnNode(0, true);
			return obj;
		}
		ReturnNode leftobj=isBalanced(root.left);
		ReturnNode rightobj=isBalanced(root.right);
		if(leftobj.isBalanced==false || rightobj.isBalanced==false)
			return obj=new ReturnNode(Math.max(leftobj.height, rightobj.height)+1, false);
		if(Math.abs(leftobj.height-rightobj.height)>1)
			return obj=new ReturnNode(Math.max(leftobj.height, rightobj.height)+1, false);
		return obj=new ReturnNode(Math.max(leftobj.height, rightobj.height)+1, true);	
	}
	
//            Time Complexity O(n^2) or O(nlogn)	
//	public static boolean isBalanced(BinaryTreeNode<Integer> root) {
//		if(root==null)
//			return true;
//		int leftHeight=height(root.left);
//		int rightHeight=height(root.right);
//		if(Math.abs(rightHeight-leftHeight)>1)
//			return false;
//		boolean isLeftBalanced=isBalanced(root.left);
//		boolean isrightBalanced=isBalanced(root.right);
//		return isLeftBalanced && isrightBalanced;
//	}
//                  OR
//	public static boolean isBalanced(BinaryTreeNode<Integer> root) {
//		if(root==null)
//			return true;
//		if(isBalanced(root.left)&&isBalanced(root.right)) {
//			int lh=height(root.left);
//			int rh=height(root.right);
//			int diff=lh-rh;
//			if(diff==1||diff==0||diff==-1)
//				return true;
//			else
//				return false;
//		}
//		return false;
//	}

	public static int height(BinaryTreeNode<Integer> root) {
		if(root==null)
			return 0;
		int leftht=height(root.left);
		int rightht=height(root.right);
		return 1+Math.max(leftht, rightht);
	}

}
