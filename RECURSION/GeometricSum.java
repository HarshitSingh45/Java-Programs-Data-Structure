package RECURSION;

public class GeometricSum {
	
//	Given k, find the geometric sum i.e.
//	1 + 1/2 + 1/4 + 1/8 + ... + 1/(2^k)
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sum(3));

	}
	public static double sum(int n) {
		if(n==0)
			return 1.0;
		double power=Math.pow(2, n);
		double sum=(1/power)+sum(n-1);
		return sum;
	}

}
