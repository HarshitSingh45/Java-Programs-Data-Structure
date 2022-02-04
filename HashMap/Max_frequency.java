package HashMap;

import java.util.HashMap;
import java.util.Set;

public class Max_frequency {

	public static int maxFrequencyNumber(int[] arr){ 
//		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
//		for(int i=0; i<arr.length; i++) {
//			if(map.containsKey(arr[i])) {
//				int val = map.get(arr[i]);
//				map.put(arr[i],val+1);
//			}else {
//				map.put(arr[i], 1);
//			}
//		}
//		System.out.println(map);
//		Set<Integer> keys = map.keySet();
//		int max=Integer.MIN_VALUE;
//		int maxNum=Integer.MIN_VALUE;
//		for(int i:keys) {
//			int val = map.get(i);
//			if(val>max) {
//				maxNum=i;
//				max=val;
//			}
//		}
//		return maxNum;
		HashMap<Integer, Integer> map = new HashMap<>();
        for (int e : arr) {
            if (map.containsKey(e)) {
                int tempCount = map.get(e);
                map.put(e, tempCount + 1);
            } else {
                map.put(e, 1);
            }
        }
        int max = -1;
        int maxInt = arr[0];
        for (int k : map.keySet()) {
            int c = map.get(k);
            if (c > max) {
                max = c;
                maxInt = k;
            }
        }
        return maxInt;
    }
	public static void main(String[] args) {
		int[] arr = {1 ,2, 2, 1};//{2, 12, 2, 11, 12, 2, 1, 2, 2, 11, 12, 2, 6};
		System.out.println(maxFrequencyNumber(arr));
	}

}
