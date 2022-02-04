package PriorityQueue;
import java.util.PriorityQueue;

public class k_largest_elements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<Integer> pq=new PriorityQueue<Integer>();
		int[] arr= {5,1,9,3,8,2,7,4,6,10};
		int k=4;
		for(int i=0;i<k;i++) {
			pq.add(arr[i]);
		}
		for(int i=k;i<arr.length;i++) {
			if(arr[i]>pq.peek()) {
				int temp=arr[i];
				arr[i]=pq.poll();
				pq.add(temp);	
			}
		}
		while(!pq.isEmpty()) {
			System.out.print(pq.peek()+" ");
			pq.poll();
		}

	}

}
