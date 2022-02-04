package PriorityQueue;
import java.util.ArrayList;

public class Priority_Queue<T> {
	
	private ArrayList<Element<T>> heap;
	public Priority_Queue() {
		heap=new ArrayList<Element<T>>();
	}
	
	public void insert(T value, int priority) {
		// Create element which needs to be created.
		Element<T> e = new Element<>(value,priority);
		heap.add(e);
		int childIndex=heap.size()-1;
		int parentIndex=(childIndex-1)/2;
		
		while(childIndex>0) {
			//  Check parent index priority and child index priority.
			if( heap.get(childIndex).priority < heap.get(parentIndex).priority) {
				// Interchange parent element and child element.
				Element<T> temp=heap.get(childIndex);
				heap.set(childIndex, heap.get(parentIndex));
				heap.set(parentIndex, temp);
				childIndex=parentIndex;
				parentIndex=(childIndex-1)/2;
			}else {
				return;
			}
		}
	}
	
	public T getMin() throws PriorityQueueEmptyException {
		// if heap is empty throw an exception
		if(heap.isEmpty())
			throw new PriorityQueueEmptyException();
		return heap.get(0).value;
	}
	
	public T removeMin() throws PriorityQueueEmptyException {
		if(heap.isEmpty())
			throw new PriorityQueueEmptyException();
		T pass = heap.get(0).value;
		Element<T> temp=heap.get(0);
		int lastElemIndex=heap.size()-1;
		heap.set(0, heap.get(lastElemIndex));
		heap.set(lastElemIndex, temp);
		heap.remove(lastElemIndex);
		
		int parentIndex=0;
		int leftChildIndex = (2*parentIndex)+1;
		int rightChildIndex = (2*parentIndex)+2;
		
		while(leftChildIndex < heap.size()) {
			if(heap.get(parentIndex).priority > heap.get(leftChildIndex).priority || heap.get(parentIndex).priority > heap.get(rightChildIndex).priority) {
				Element<T> min;
				int changeIndex;
				if(heap.get(leftChildIndex).priority < heap.get(rightChildIndex).priority) {
					min=heap.get(leftChildIndex);
					changeIndex=leftChildIndex;
				}else {
					min=heap.get(rightChildIndex);
					changeIndex=rightChildIndex;
				}
				
				Element<T> change=min;
				heap.set(changeIndex, heap.get(parentIndex));
				heap.set(parentIndex, min);
				
				parentIndex = changeIndex;
				leftChildIndex = (2*parentIndex)+1;
				rightChildIndex = (2*parentIndex)+2;
			}else {
				return pass;
			}
		}
				
		return pass;
	}
	
	public boolean isEmpty() {
		return heap.size()==0;	
	}
	
	public int size() {
		return heap.size();
	}
	

}
