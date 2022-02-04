package FUNDAMENTALS;

public class NcR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int r=2;
		int nFact=factorial(n);
		int rFact=factorial(r);
		int difFact=factorial(n-r);
		int ncr=nFact/(rFact*difFact);
		System.out.println(ncr);
	}
	public static int factorial(int num) {
		int pro=1;
		while(num>0) {
			pro=pro*num;
			num--;
		}
		return pro;
	}

}
