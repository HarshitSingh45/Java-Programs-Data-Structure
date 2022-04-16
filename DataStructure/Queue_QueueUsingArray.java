package DataStructure;

public class Queue_QueueUsingArray {
	private int[] data;
	private int frontIndex,rearIndex,size;
	public Queue_QueueUsingArray() {
		data=new int[10];
		frontIndex=-1;
		rearIndex=-1;
	}
	public void enqueue(int element) {
		if(size==data.length)
			doubleArray();
		if(size==0)
			frontIndex++;
//		rearIndex++;
//		if(rearIndex==data.length)
//			rearIndex=0;
		rearIndex=(rearIndex+1)%data.length;
		data[rearIndex]=element;
		size++;
		
}
private void doubleArray() {
	int[] temp=data;
	data=new int[2*temp.length];
	int index=0;
	for(int i=frontIndex;i<temp.length;i++)
		data[index++]=temp[i];
	for(int i=0;i<=frontIndex-1;i++)
		data[index++]=temp[i];
	frontIndex=0;
	rearIndex=temp.length-1;
}
public int dequeue() throws QueueEmptyException {
	if(size==0)
		throw new QueueEmptyException();
	int temp=data[frontIndex];
//	frontIndex++;
//	if(frontIndex==data.length)
//		frontIndex=0;
	frontIndex=(frontIndex+1)%data.length;
	size--;
	if(size==0) {
		frontIndex=-1;
		rearIndex=-1;
	}
	return temp;
} 
public int front() throws QueueEmptyException {
	if(frontIndex==-1)
		throw new QueueEmptyException();
	return data[frontIndex];
}
public int size() {
	return size;
}
public boolean isEmpty() {
	return size==0;

}

}
