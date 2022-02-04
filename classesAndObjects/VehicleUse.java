package classesAndObjects;

public class VehicleUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c=new Car();
		c.color="RED";
		c.maxSpeed=100;
		c.name="BMW";
		c.carPrint();
		System.out.println("-------------------");
		c.print();
		
		System.out.println("-------------------");
		
		Vehicle v=new Vehicle();
		v.print();

	}

}
