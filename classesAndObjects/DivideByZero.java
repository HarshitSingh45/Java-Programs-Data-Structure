package classesAndObjects;

public class DivideByZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			int n=divide(10,1);
			System.out.println(n);
		}
		catch(DivideByZeroException e) {
			System.out.println("Denominator entered zero");
		}
		System.out.println("harshit");

	}

	private static int divide(int d, int i) throws DivideByZeroException {
		// TODO Auto-generated method stub
		if(i==0)
			throw new DivideByZeroException();
		return d/i;
	}

}
