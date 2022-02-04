package ARRAY;
import java.util.Scanner;
public class ArrangeArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=arrange();
		printArray(arr);

	}
	public static int[] arrange() {
		//Your code goes here
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];

		int num=1;
		int s=0;
		int e=n-1;
		for(int i=0;i<arr.length;i++){
			if(i%2==0){
				arr[s]=num;
				s++;
			}else{
				arr[e]=num;
				e--;
			}
			num++;
		}
		return arr;
	}
	public static void printArray(int[] arr) {
		int n=arr.length;
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
