//package DataStructure;
//import java.util.Stack;
//public class Stack_StockSpan {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		int[] arr= {100, 80, 60, 70, 60, 75, 85};
//		arr=stockSpan(arr);
//		for(int i:arr)
//			System.out.print(i+" ");
//
//	}
//	public static int[] stockSpan(int[] arr) {
//		int count=1;
//		int op[]=new int[arr.length];
//		int index=0;
//		Stack<Integer> stack=new Stack<>();
//		for(int i=0;i<arr.length;i++) {
//			if(stack.isEmpty()) {
//				stack.push(arr[i]);
//				op[index]=1;
//				index++;
//			}else {
//				int num=arr[i];
//				if(stack.peek()<num) {
//					while
//					
//				}else {
//					stack.push(num);
//					op[index]=1;
//					index++;
//				}
//			}
//
//			}
//
//		}
//
//	}
