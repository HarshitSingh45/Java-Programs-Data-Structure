package classesAndObjects;

public class FinalKeyword {
	String name;
	final private int rollNumber;
	// final variable can be assigned at the time of declaration or in the constructor only
	public FinalKeyword(String name,int rollNumber) {
		this.name=name;
		this.rollNumber=rollNumber;
		
	}
	public void print() {
		System.out.println("Student name "+this.name+" Roll Number -> "+this.rollNumber);
	}

}
