package classesAndObjects;

public class Stud {
	private int rollNumber;

	public void setRollNumber(int rollNumber){
		this.rollNumber=rollNumber;
	}
	public int getRollNumber() {
		//this and object should refer to same address
		System.out.println(this);
		return this.rollNumber;
	}

}
