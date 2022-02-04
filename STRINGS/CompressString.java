package STRINGS;

public class CompressString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="abbbc";
		compress(str);
		//String str2=dupli(str);
		//System.out.println(str2);

	}
	public static void compress(String str) {
		String rev="";
		char ch=str.charAt(0);
		rev+=ch;
		int count=1;
		for(int i=1;i<str.length();i++) {
			if(str.charAt(i)!=ch) {
				if(ch==str.charAt(i-1)) {
					String coun=Integer.toString(count);
					rev+=coun;
				}
				if(i==str.length()-1) {
					ch=str.charAt(i);
					rev+=ch;
					String coun=Integer.toString(1);
					rev+=coun;
					break;
				}
				ch=str.charAt(i);
				rev+=ch;
				count=1;
			}else {
				if(i==str.length()-1) {
					count++;
					String coun=Integer.toString(count);
					rev+=coun;
					break;
				}
				count++;
			}
		}
		for(int i=0;i<rev.length();i++) {
			System.out.print(rev.charAt(i));
		}
	}
//	public static String dupli(String str) {
//		String pass="";
//		char ch=str.charAt(0);
//		int count=1;
//		int n=str.length()-1;
//		for(int i=1;i<str.length();i++) {
//			if(ch!=str.charAt(i)) {
//				
//				if(count==1) {
//					pass+=ch;
//				}
//				else {
//					String s=Integer.toString(count);
//					pass+=ch+s;
//				}
//				ch=str.charAt(i);
//				if(i==n) {
//					pass+=ch;
//				}
//				count=1;
//				
//			}
//			else {
//				count++;
//				if(i==n) {
//					String s=Integer.toString(count);
//					pass+=ch+s;
//				}
//				
//			}
//		}
//		
//		return pass;
//	}
	// DIFFERENT WAY
	

}

