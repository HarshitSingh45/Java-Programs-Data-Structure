package classesAndObjects;

public class StudentUse {
	
 public String name;
 private int rollNumber;
 
 public int getRollNumber() {
	 return rollNumber;
 }
 public void setRollNumber(int n) {
	 if(n<0) {
		 System.out.println("INVALID ROLL NUMBER");
	 }
	 else
		 rollNumber=n;
 }

}
