package RECURSION;

public class Count_Zero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(count(1000));

	}
	public static int count(int n) {
		if(n==0)
			return 0;
		if(n%10==0)
			return 1+count(n/10);
		else
			return count(n/10);
	}

}
