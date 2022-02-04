package OPTIMAL;
import java.util.Arrays;
public class PRACTICE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1 ,5 ,10, 15, 20, 25};
		int[] arr1= {2 ,4 ,5 ,9 ,15};
		int n=intersection(arr,arr1);
		System.out.println(n);

	}

	public static int intersection(int arr1[], int arr2[])
	{
		int m=arr1.length;
		int n=arr2.length;
		int a=0,b=0;
		int i = 0, j = 0;
		int sum = 0, sum1 = 0, sum2 = 0;
		while (i < m && j < n)
		{
			if (arr1[i] < arr2[j]) {
				sum1 += arr1[i];
				i++;
			}
			else if (arr1[i] > arr2[j]) {
				sum2 += arr2[j];
				j++;
		}
			else
			{
				sum += Math.max(sum1, sum2) + arr1[i];
				a=i+1;
				b=j+1;
				sum1 = 0;
				sum2 = 0;
				i++;
				j++;
			}
		}
		i=a;
		j=b;
		sum1=0;
		sum2=0;

		while (i < m) {
			sum1 += arr1[i];
			i++;
		}

		while (j < n) {
			sum2 += arr2[j];
			j++;
			}

		sum += Math.max(sum1, sum2);

		return sum;


	}
}
