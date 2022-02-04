package classesAndObjects;

public class DynamicArrays {
	
	private int data[];
	private int lastElementIndex;
	
	public DynamicArrays() {
		data=new int[5];
		lastElementIndex=0;
	}
	public int size() {
		return lastElementIndex;
	}
	public boolean isEmpty() {
		return lastElementIndex==0;
	}
	public int removeLast() {
		if(lastElementIndex==0)
			return -1;
		else {
			int temp=data[lastElementIndex-1];
			data[lastElementIndex-1]=0;
			lastElementIndex--;
			return temp;
		}
	}
	public void add(int element) {
		if(lastElementIndex==data.length) {
			doubleCapacity();
		}
		data[lastElementIndex]=element;
		lastElementIndex++;
	}
	private void doubleCapacity() {
		int[] temp=data;
		data=new int[2*temp.length];
		for(int i=0;i<temp.length;i++)
			data[i]=temp[i];
		
	}
	public int get(int index) {
		if(index>=0 && index<lastElementIndex)
			return data[index];
		else
			return -1;
	}
	public void set(int index, int element) {
		if(index>=0&& index<lastElementIndex)
			data[index]=element;
		else 
			return;
	}

}
