package classesAndObjects;

public class Polynomial {

	DynamicArrays arr=new DynamicArrays();
	private int coefficient;
	private int degree;
	private int maxElementIndex;


	public Polynomial() {
		//arr.add(0);
		maxElementIndex=0;
	}


	public void setCoefficient(int degree, int coeff){
		if(arr.get(degree)==-1) {
			while(arr.get(degree-1)==-1)
				arr.add(0);
			arr.add(coeff);
		}else
			arr.set(degree, coeff);

	}

	// Prints all the terms(only terms with non zero coefficients are to be printed) in increasing order of degree. 
	public void print(){
		for(int i=0;i<arr.size();i++) {
			if(arr.get(i)!=0)
				System.out.print(arr.get(i)+"x"+i+" ");
		}

	}


	// Adds two polynomials and returns a new polynomial which has result
	public Polynomial add(Polynomial p){
		Polynomial result=new Polynomial();
		if(arr.size()<=p.arr.size()) {
			for(int i=0;i<arr.size();i++) {
				result.setCoefficient(i, arr.get(i)+p.arr.get(i));
			}
			for(int i=arr.size();i<p.arr.size();i++) {
				result.setCoefficient(i, p.arr.get(i));
			}
			
		}else {
			for(int i=0;i<p.arr.size();i++) {
				result.setCoefficient(i, arr.get(i)+p.arr.get(i));
			}
			for(int i=p.arr.size();i<arr.size();i++) {
				result.setCoefficient(i, arr.get(i));
			}
			
		}
		return result;


	}

//	// Subtracts two polynomials and returns a new polynomial which has result
//	public Polynomial subtract(Polynomial p){
//
//	}
//
//	// Multiply two polynomials and returns a new polynomial which has result
//	public Polynomial multiply(Polynomial p){
//
//	}

}
