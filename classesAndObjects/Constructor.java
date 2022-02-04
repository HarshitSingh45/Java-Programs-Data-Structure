package classesAndObjects;

public class Constructor {
	String name;
	int rollNumber;
	public Constructor(String name, int rollNumber) {
		this.name=name;
		this.rollNumber=rollNumber;
	}
	public Constructor(String name) {
		this.name=name;
	}
	public void print() {
		System.out.println("Student name "+this.name+" RollNumber "+this.rollNumber);
	}

}
