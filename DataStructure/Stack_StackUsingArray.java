package DataStructure;

public class Stack_StackUsingArray {
	
//	Create an array to implement stack.
//	Array needs to be private as it cannot be accessed by anyone.
	private int[] data;
	
//	In stacks we can access only top elements , so we need to have a variable topIndex to access the topmost element.
//	topIndex needs to be private.
	private int topIndex;
	
	
//	          CONSTRUCTOR 
	public Stack_StackUsingArray(int size) {
		data=new int[size];
		topIndex=-1;
	}
//          	  OR
	public Stack_StackUsingArray() {
		// To initialize the array size
		data=new int[10];
		topIndex=-1;
	}
	
//  PUSH THE ELEMNT INTO THE STACK	
	public void push(int element) {//throws StackFullException {
		// THROW EXCEPTION IF ARRAY IF FULL
		if(topIndex==data.length-1) {
			doubleSize();
		}
			//throw new StackFullException();
		topIndex++;	
		data[topIndex]=element;
	}
	private void doubleSize() {
		System.out.println("Array size doubled");
		int[] temp=data;
		data=new int[2*data.length];
		for(int i=0;i<temp.length;i++)
			data[i]=temp[i];
	}
	
//	TO REMOVE THE ELEMENT FROM THE STACK
	public int pop() throws StackEmptyException {
		// THROW EXCEPTION IF ARRAY IS EMPTY
		if(topIndex==-1) {
			StackEmptyException e=new StackEmptyException();
			throw e;
		}
		int elem=data[topIndex];
		topIndex--;
		return elem;
	}
	
//	TO READ THE TOPMOST ELEMENT IN STACK
	public int top() throws StackEmptyException {
		// THROW EXCEPTION IF ARRAY IS EMPTY
		if(topIndex==-1)
			throw new StackEmptyException();
		return data[topIndex];
	}
	
//  TO GET THE SIZE OF THE STACK	
	public int size() {
		int size=topIndex+1;
		return size;
	}
	
//  TO CHECK WHETHER STACK IS EMPTY OR NOT	
	public boolean isEmpty() {
		return topIndex==-1;
	}

}
