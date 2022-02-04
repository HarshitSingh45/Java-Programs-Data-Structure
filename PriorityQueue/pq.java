package PriorityQueue;
import java.util.PriorityQueue;


public class pq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<Integer> pr=new PriorityQueue<>();
		int[] arr= {1,5,3,4,2};
		for(int i=0;i<arr.length;i++) {
			pr.add(arr[i]);
		}
		while(!pr.isEmpty()) {
			System.out.println(pr.peek());
			pr.poll();
		}

	}

}
