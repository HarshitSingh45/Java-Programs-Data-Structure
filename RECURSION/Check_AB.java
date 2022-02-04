package RECURSION;
//
public class Check_AB {
//
//	//	a. The string begins with an 'a'
//	//	b. Each 'a' is followed by nothing or an 'a' or "bb"
//	//	c. Each "bb" is followed by nothing or an 'a'
//
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(checkAB("abbaabb"));
	}
	public static boolean checkAB(String input) {
		if(input.length() == 0){
	          return true;
	        }
	       if(input.length() == 1){
	         if(input.charAt(0) == 'a')
	         return true;
	         else
	         return false;
	       }
	       if(input.charAt(0) == 'a'){
	         if(input.charAt(1) == 'b' && input.length() > 2 && input.charAt(2) == 'b')
	           return checkAB(input.substring(3));
	         else if(input.charAt(1) == 'a')
	           return checkAB(input.substring(1));
	         else 
	           return false;
	       }
	      else 
	         return false;	
	}
}
