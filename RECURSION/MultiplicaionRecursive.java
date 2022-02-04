package RECURSION;

public class MultiplicaionRecursive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(mul(4,0));

	}
	public static int mul(int m,int n) {
		if(n==0)
			return 0;
		return m+mul(m,n-1);
	}

}
