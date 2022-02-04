package PriorityQueue;
import java.util.PriorityQueue;

public class Inbuilt_PQ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<Integer> pr=new PriorityQueue<>();
		int[] arr= {1,5,3,6,4,2};
		for(int i=0;i<arr.length;i++) {
			pr.add(arr[i]); // to insert an element in PQ.
		}
		while(!pr.isEmpty()) {
			System.out.print(pr.peek()+" "); // to view topmost element in PQ
			pr.poll(); // to remove topmost element from PQ.
		}
	}
}
