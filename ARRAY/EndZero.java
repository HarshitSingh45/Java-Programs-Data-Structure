package ARRAY;

public class EndZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {3,0,2,0,1,0,2,5,0};
		zero(arr);
		printArray(arr);

	}
	public static void printArray(int[] arr) {
		int n=arr.length;
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	public static void zero(int[] arr) {
		//function 
		int n=arr.length;
//		for(int i=0;i<n;i++) {
//			if(arr[i]!=0) {
//				continue;
//			}
//			int temp=arr[i];
//			int j=i+1;
//			while(j<n&&arr[j]==0) {
//				j++;
//			}
//			if(j==n) {
//				break;
//			}
//			arr[i]=arr[j];
//			arr[j]=temp;
//		}
		
		//new 
		
		
//		for(int i=0;i<n-1;i++) {
////			int temp=arr[i];
////			
//			for(int j=0;j<n-i-1;j++) {
//				if(arr[j]!=0) {
//					continue;
//				}
//				if(arr[j+1]!=0) {
//					int temp=arr[j+1];
//					arr[j+1]=arr[j];
//					arr[j]=temp;
//				}
//			}
//		}
		int i=0,k=1;
		while(i<n&&k<n) {
			if(arr[i]==0&&arr[k]!=0) {
				int temp=arr[k];
				arr[k]=arr[i];
				arr[i]=temp;
				i++;
				k++;
			}
			else if(arr[i]!=0&&arr[k]==0) {
				i++;
				k++;
			}
			else if(arr[i]==0&&arr[k]==0) {
				k++;
			}
			else {
				i++;
				k++;
			}
		}
	}


}
