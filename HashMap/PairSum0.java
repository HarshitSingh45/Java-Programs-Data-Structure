package HashMap;

import java.util.HashMap;
import java.util.Set;

public class PairSum0 {

	/*public static int PairSum(int[] arr, int size) {
		HashMap<Integer,Integer> map=new HashMap<>();
		int count=0;
		int countz=0;
		for(int i:arr) {
			if(i==0) {
				countz++;
			}else {
				if(map.containsKey(-i)) {
					int val=map.get(-i);
					count+=val;
				}
				if(map.containsKey(i)) {
					int val=map.get(i);
					map.put(i, val+1);
				}else {
					map.put(i, 1);
				}
			}
		}
		if(countz>2) {
			int n=countz;
			int n1=(n*(n-1))/2;
			count+=n1;
		}
		else {
			count+=1;
		}
		return count;
	}*/
	public static int PairSum(int[] arr, int size) {
		HashMap<Integer,Integer> Pmap = new HashMap<>();
		HashMap<Integer,Integer> Nmap = new HashMap<>();
		for(int i:arr) {
			if(i>=0) {
				if(Pmap.containsKey(i)) {
					int val = Pmap.get(i);
					Pmap.put(i, val+1);
				}else {
					Pmap.put(i, 1);
				}
			}
			else {
				if(Nmap.containsKey(i)) {
					int val = Nmap.get(i);
					Nmap.put(i, val+1);
				}else {
					Nmap.put(i, 1);
				}
			}
		}

		int count=0;
		Set<Integer> keys = Pmap.keySet();
		for(int i:keys) {
			int j=-1*i;
			if(i==0) {
				int val=Pmap.get(i);
				if(val>2) {
					System.out.println(val);
					int n=((val)*(val-1))/2;
					count+=n;
					continue;
				}else {
					count+=1;
				}
			}
			if(Nmap.containsKey(j)) {
				int val1=Pmap.get(i);
				int val2=Nmap.get(j);
				count+=val1*val2;
			}
			
		}
		return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {0,0,0,0,0};
		System.out.println(PairSum(arr, 5));

	}

}
