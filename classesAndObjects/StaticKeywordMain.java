package classesAndObjects;

public class StaticKeywordMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticKeyword s=new StaticKeyword("Harshit");
		System.out.println(s.name+"  "+s.rollNumber);
		System.out.println("Total no of students = "+StaticKeyword.numStudents);

	}

}
