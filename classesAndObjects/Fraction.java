package classesAndObjects;

public class Fraction {
	
	private int numerator;
	private int denominator;

	public Fraction(int numerator, int denominator) {
		// TODO Auto-generated constructor stub
		this.numerator=numerator;
		this.denominator=denominator;
		simplify();
	}

	private void simplify() {
		// TODO Auto-generated method stub
		int gcd=1;
		int small=Math.min(numerator, denominator);
		for(int i=2;i<=small;i++) {
			if(numerator%i==0 && denominator%i==0)
				gcd=i;
		}
		numerator/=gcd;
		denominator/=gcd;
		
	}

	public void print() {
		// TODO Auto-generated method stub
		System.out.println(numerator+"/"+denominator);
		
	}

	public void increment() {
		// TODO Auto-generated method stub
		numerator=numerator+denominator;
		simplify();
		
	}

	public void add(Fraction f2) {
		// This method adds 2 fraction and result wiil be assigned to first fraction
		//This method is called on first fraction and we pass the second fraction
		this.numerator=this.numerator*f2.denominator+this.denominator*f2.numerator;
		this.denominator=this.denominator*f2.denominator;
		simplify();
		
	}
	
	public static Fraction add(Fraction f1, Fraction f2) {
		int num=f1.numerator*f2.denominator+f1.denominator*f2.numerator;
		int den=f1.denominator*f2.denominator;
		Fraction f3=new Fraction(num,den);
		return f3;
		
	}

	

}
