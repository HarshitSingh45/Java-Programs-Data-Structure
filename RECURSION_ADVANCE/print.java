package RECURSION_ADVANCE;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.ArrayList;
import java.util.Scanner;

public class print {
	public static boolean isPermutation(String s1, String s2){
		if(s1.length()!=s2.length()){
			return false;
		}
		HashMap<Character, Integer> ht = new HashMap<>();
		for(int i=0;i<s1.length();i++){
			char c = s1.charAt(i);
			if(ht.containsKey(c)){
				int val = ht.get(c) + 1;
				ht.put(c, val);
			}else{
				ht.put(c, 1);
			}
		}
		for(int i=0;i<s2.length();i++){
			char c = s2.charAt(i);
			if(ht.containsKey(c)){
				int val = (int)ht.get(c);
				if(val==0){
					return false;
				}
				val--;
				ht.put(c, val);
			}else{
				return false;
			}
		}
		Set keys = ht.keySet();
		Iterator<Character> iterator = keys.iterator();
		while(iterator.hasNext()){
			char c = iterator.next();
			if(ht.get(c)!=0){
				return false;
			}
		}
		return true;
	}

	//	public static void printTeam(int[] arr, int si,ArrayList<Integer> team, int member ) {
	//		if(member==0) {
	//			for(int i:team)
	//				System.out.print(i+" ");
	//			System.out.println();
	//			return;
	//		}
	//		if(si==arr.length) {
	//			return;
	//		}
	//		ArrayList<Integer> team2=team;
	//		team.add(arr[si]);
	//		printTeam(arr, si+1, team, member-1);
	//		printTeam(arr, si+1, team2, member);
	//	}
	public static void printSubset(int[] arr, int si, int[] ans) {
		if(si==arr.length) {
			if(ans.length==12) {
				for(int i:ans) {
					System.out.print(i+" ");
				}
				System.out.println();
				return;
			}
			return;
		}
		printSubset(arr, si+1, ans);
		int[] temp=new int[ans.length+1];
		for(int i=0; i<ans.length; i++) {
			temp[i] = ans[i];
		}
		temp[temp.length-1] = arr[si];
		printSubset(arr, si+1, temp);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//		Scanner s= new Scanner(System.in);
		//		int n=s.nextInt();
		//		int[] arr=new int[n];
		//		for(int i=0;i<arr.length;i++) {
		//			arr[i]=i+1;
		//		}
		//		//		ArrayList<Integer> team=new ArrayList<>();
		//		//		printTeam(arr,0,team,12);
		//		int[] pass = {};
		//		printSubset(arr,0,pass);

		Scanner s=new Scanner(System.in);
		String str=s.next();
		int n=s.nextInt();
		for(int i=0; i<n;i++){
			int w=s.nextInt();
			int x=s.nextInt();
			int y=s.nextInt();
			int z=s.nextInt();
			String s1=str.substring(w-1,x);
			String s2=str.substring(y-1,z);
			System.out.println(s1);
			System.out.println(s2);
			System.out.println(isPermutation(s1,s2));
//			if(s1.length()!=s2.length()) {
//				System.out.println("false");
//				continue;
//			}
//			int[] arr=new int[256];
//			for(int j=0;j<s1.length();j++) {
//				int a=s1.charAt(j);
//				arr[a]++;
//			}
//			for(int k=0;k<s2.length();k++) {
//				int a=s2.charAt(k);
//				arr[a]--;
//			}
//			for(int m=0;m<arr.length;m++) {
//				if(arr[m]!=0) {
//					System.out.println("false");
//					break;
//				}
//			}
//			System.out.println("true");
		}


	}

}
