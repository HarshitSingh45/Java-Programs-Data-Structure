package ARRAY;

public class ArraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[]= {1, 3, 7, 9};
		int arr2[]= {1, 3, 7, 9};
		int[] output=new int[5];
		int n1=arr1.length;
		int n2=arr2.length;
		int n3=output.length;
		int carry=0;
		int i=n1-1;
		int j=n2-1;
		int k=0;
		for(k=n3-1;k>=0;k--){
			int num=0;
			if(i<0&&j<0){
				num=carry;	
			}
			else if(j<0){
				num=arr1[i]+carry;
			}
			else if(i<0){
				num=arr2[j]+carry;
			}
			else{
				num=arr1[i]+arr2[j]+carry;
			}        
			int pri=num%10;
			carry=num/10;
			output[k]=pri;
			i--;
			j--;
		}
		for(int l=0;l<n3;l++) {
			System.out.print(output[l]+" ");
		}
	}
}
