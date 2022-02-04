package PriorityQueue;

public class PriorityQueueUse {

	public static void main(String[] args) throws PriorityQueueEmptyException {
		// TODO Auto-generated method stub
		Priority_Queue<String> pq= new Priority_Queue<>();
		pq.insert("a", 10);
		pq.insert("b", 20);
		pq.insert("c", 40);
		pq.insert("d", 60);
		pq.insert("e", 100);
		pq.insert("f", 45);
		pq.insert("g", 50);
		pq.insert("h", 80);
		System.out.println(pq.getMin());
		System.out.println(pq.removeMin());
		pq.insert("i", 15);
		System.out.println(pq.getMin());
		System.out.println(pq.removeMin());
		System.out.println(pq.removeMin());
		

	}

}
