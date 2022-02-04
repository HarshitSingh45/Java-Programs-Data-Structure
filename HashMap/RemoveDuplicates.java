package HashMap;
import java.util.ArrayList;
import java.util.HashMap;

public class RemoveDuplicates {

	public static ArrayList<Integer> removeDuplicate(int[] arr){
		ArrayList<Integer> output= new ArrayList<>();
		HashMap<Integer,Boolean> map=new HashMap<Integer,Boolean>();
		for(int i=0; i<arr.length; i++) {
			if(map.containsKey(arr[i]))
				continue;
			output.add(arr[i]);
			map.put(arr[i],true);
		}
		return output;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {0,1,2,3,1,2,3,5,5,5,6,7,6,7};
		ArrayList<Integer> output=removeDuplicate(arr);
		System.out.println(output);
		
	}

}
