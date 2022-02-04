package classesAndObjects;

public class DynamicArraysUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DynamicArrays d=new DynamicArrays();
		
		for(int i=0;i<100;i++)
			d.add(100+i);
		System.out.println(d.size());
		System.out.println(d.get(5));
		d.set(5,500);
		System.out.println(d.get(5));
		System.out.println(d.removeLast());
		d.add(444);
		System.out.println(d.get(99));
		while(!d.isEmpty()) {
			System.out.println(d.removeLast());
			System.out.println("SIZE - "+d.size());
		}
		d.add(0);
		System.out.println(d.get(0));
		
		

	}

}
