package classesAndObjects;

public class ComplexNumbers {
	
	private int real;
	private int imaginary;

	public ComplexNumbers(int real, int imaginary) {
		// TODO Auto-generated constructor stub
		this.real=real;
		this.imaginary=imaginary;
	}

	public void plus(ComplexNumbers c2) {
		// TODO Auto-generated method stub
		this.real=this.real+c2.real;
		this.imaginary=this.imaginary+c2.imaginary;
		
	}

	public void print() {
		// TODO Auto-generated method stub
		System.out.println(this.real+" + i"+this.imaginary);
		
	}

	public void multiply(ComplexNumbers c2) {
		// TODO Auto-generated method stub
		int realNumber=(this.real*c2.real)-(this.imaginary*c2.imaginary);
		int imaginaryNumber=(this.imaginary*c2.real)+(this.real*c2.imaginary);
		this.real=realNumber;
		this.imaginary=imaginaryNumber;
		
	}

}
