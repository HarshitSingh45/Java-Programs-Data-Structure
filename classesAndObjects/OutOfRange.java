package classesAndObjects;

public class OutOfRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,5};
		try {
		System.out.println(getElement(arr,5));
		}
		catch(OutOfRangeException e) {
			System.out.println("out of range");
		}

	}

	private static int getElement(int[] arr,int n) throws OutOfRangeException {
		// TODO Auto-generated method stub
		if(n<0||n>=arr.length) {
			throw new OutOfRangeException();
		}
		return arr[n];
	}

}
