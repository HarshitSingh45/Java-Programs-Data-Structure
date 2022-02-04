package classesAndObjects;

public class StaticKeyword {
	String name;
	int rollNumber;
	static int numStudents;
	public static final double COVERSIONFACTOR =0.95;
	
	public StaticKeyword(String name) {
		this.name=name;
		numStudents++;
		this.rollNumber=numStudents;
	}

}
