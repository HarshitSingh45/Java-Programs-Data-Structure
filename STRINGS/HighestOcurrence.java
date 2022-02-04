package STRINGS;

public class HighestOcurrence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abdefgbabfba";
		char st=highest(str);
		System.out.println(st);

	}
	public static char highest(String str) {
		int[] arr=new int[256];
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			arr[ch]+=1;
		}
		int max=Integer.MIN_VALUE;
		char mx='\0';
		for(int i=0;i<str.length();i++) {
			int count=0;
			char ch =str.charAt(i);
			count=arr[ch];
			if(count>max) {
				max=count;
				mx=str.charAt(i);
			}
		}
		
		return mx;
	}

}
