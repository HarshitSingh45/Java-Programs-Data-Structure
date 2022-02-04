package DataStructure;

import java.util.ArrayList;

public class ArrayList_Demo {

	public static void main(String[] args) {
		ArrayList<Integer> arr=new ArrayList<>();
		
		arr.add(10);
		arr.add(20);
		arr.add(30);
		arr.add(30);
		arr.add(20);
		System.out.println(arr.size());
		Integer j=20;
		//WE ARE PASSING INTEGER OBJECT OF VALUE 10
		arr.remove(j);
		/*WHEN WE REMOVE A PARTICULAR ELEMENT & THERE ARE MORE THAN 1 TIME ITS OCCURING THEN
		THE VERY FIRST ELEMENT WILL BE REMOVED*/
		System.out.println(arr.get(1));
		System.out.println(arr.get(3));
		arr.add(50);
		Integer k=30;
		arr.remove(k);
		System.out.println();
		for(int i:arr)
			System.out.println(i);
		
		System.out.println();
		//TO REPLACE AN ELEMENT
		arr.set(1, 20);
		for(int i:arr)
			System.out.println(i);
	

	}

}
