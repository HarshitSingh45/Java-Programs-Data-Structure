package OPTIMAL;

import java.util.Arrays;

public class TripletSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {2 ,-5, 8, -6, 0, 5, 10, 11, -3};
		int n=tripletsum(arr,10);
		System.out.println(n);

	}
	public static int tripletsum(int[] arr,int num) {
		Arrays.sort(arr);
		int count=0;
		for(int a=0;a<arr.length-2;a++) {
			int i=a+1,j=arr.length-1;
			while(i<j) {
				int sum =arr[a]+arr[i]+arr[j];
				if(sum>num) {
					j--;
				}
				else if(sum<num){
					i++;
				}
				else {
					if(arr[i]!=arr[i+1]&&arr[j]!=arr[j-1]) {
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
			//
		}
		return count;
	}

}
