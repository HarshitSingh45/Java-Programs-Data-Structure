package STRINGS;

//import java.nio.file.FileSystem;
import java.util.Scanner;

//import jdk.internal.misc.FileSystemOption;

public class PRACTICE {
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		int n=scn.nextInt();
		for(int i=1;i<=n;i++){
			String name = scn.next();
			String name1 = scn.next();

			boolean bool = compare(name, name1);

			System.out.println(bool);
		}
	}
	public static boolean compare(String name, String name1) {
		int i=0,j=0;
		while(i<name.length()&&j<name1.length()) {
			if(name.charAt(i)==name1.charAt(j)) {
				i++;
				j++;
			}else {
				j++;
			}
		}if(i<name.length()) {
			return false;
		}else if(j<name1.length()) {
			char ch=name1.charAt(j-1);
			while(j<name1.length()) {
				if(name1.charAt(j)!=ch) {
					return false;
				}
				j++;
			}
		}
		
		return true;	
	}
}


