package HashMap;

import java.util.HashMap;
import java.util.Set;

public class ArrayIntersection {

	public static HashMap<Integer,Integer> fillHM(int[] arr){ 
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i=0; i<arr.length; i++) {
			if(map.containsKey(arr[i])) {
				int val = map.get(arr[i]);
				map.put(arr[i],val+1);
			}else {
				map.put(arr[i], 1);
			}
		}
		return map;
	}
	public static void intersection(int[] arr1, int[] arr2) {
		HashMap<Integer,Integer> map =new HashMap<>();
		map=fillHM(arr1);
		for(int i=0; i<arr2.length; i++) {
			if(map.containsKey(arr2[i])) {
				int val=map.get(arr2[i]);
				if(val==0)
					continue;
				System.out.print(arr2[i] +" ");
				map.put(arr2[i], val-1);
			}
		}
	}
	/*public static void intersection(int[] arr1, int[] arr2) {
	    //Your code goes here
		HashMap<Integer, Integer> map1=new HashMap<>();
		//HashMap<Integer, Integer> map2=new HashMap<>();
		map1=fillHM(arr1);
		//map2=fillHM(arr2);
		Set<Integer> keys = map1.keySet();
		for(int i:keys) {
			int freq1,freq2;
			freq1=map1.get(i);
			if(map2.containsKey(i)) {
				freq2=map2.get(i);
				int min= Math.min(freq1, freq2);
				for(int j=0; j < min; j++) {
					System.out.print(i+" ");
				}
			}
		}
		
	}*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1= {6, 9, 8, 5};
		int[] arr2= {9, 2, 4, 1, 8};
		intersection(arr1, arr2);

	}

}
