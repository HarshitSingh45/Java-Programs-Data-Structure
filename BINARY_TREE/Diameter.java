package BINARY_TREE;
class DiaNode{
	int heigh;
	int Diameter;
	public DiaNode(int height, int Diameter) {
		// TODO Auto-generated constructor stub
		this.heigh=height;
		this.Diameter=Diameter;
	}
}

public class Diameter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTreeUse bt=new BinaryTreeUse();
		BinaryTreeNode<Integer> root=bt.takeInput(true, 0, false);
		bt.print(root);
		DiaNode ans=findDiameter(root);
		System.out.println(ans.heigh);
	}

	public static DiaNode findDiameter(BinaryTreeNode<Integer> root) {
		// TODO Auto-generated method stub
		DiaNode ans;
		if(root==null) 
			return ans=new DiaNode(0, 0);
		DiaNode lp=findDiameter(root.left);
		DiaNode rp=findDiameter(root.right);
		int leftDiameter=lp.Diameter;
		int rightDiameter=rp.Diameter;
		
		int dist=lp.heigh+rp.heigh+1;
		
		int diameter=Math.max(rightDiameter, Math.max(leftDiameter, dist));
		int height=Math.max(lp.heigh, rp.heigh)+1;
		return (new DiaNode(height, diameter));
	}

}
