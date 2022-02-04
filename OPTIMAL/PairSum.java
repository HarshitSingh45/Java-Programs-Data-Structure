package OPTIMAL;

import java.util.Arrays;

public class PairSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] arr= {1 ,3 ,6 ,2 ,5 ,4 ,3 ,2 ,4};
		int[] arr= {2 ,8 ,10, 5, -2, 5};
		int num= pairsum(arr,10);
		System.out.println(num);

	}
	public static int pairsum(int[] arr, int num) {
		Arrays.sort(arr);
		int i=0,j=arr.length-1,count=0;
		while(i<j) {
			int sum =arr[i]+arr[j];
			if(sum>num) {
				j--;
			}
			else if(sum<num){
				i++;
			}
			else {
				if(/*arr[i]!=arr[i+1]&&*/arr[j]!=arr[j-1]) {
					count++;
					i++;
				}
				else if(arr[i]==arr[j]) {
					int no=(j-i)+1;
					count+=(no*(no-1))/2;
					break;
				}
				else {
					if(arr[j]==arr[j-1]) {
						int k=j;
						int su=0;
						while(arr[k]==arr[j]) {
							su++;
							k--;
						}
						count+=su;
						i++;
					}
					else {
						count++;
						i++;
					}
					
				}
				
			}
		}
		return count;
	}

}
