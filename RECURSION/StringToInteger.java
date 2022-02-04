package RECURSION;

public class StringToInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="12";
		System.out.println(conv(str));

	}
	public static int conv(String str) {
		if (str.length() == 1)
            return (str.charAt(0) - '0');
        double y = conv(str.substring(1));
        double x = str.charAt(0)- '0';
        x = x * Math.pow(10, str.length() - 1) + y;
        return (int)(x);
	}

}
