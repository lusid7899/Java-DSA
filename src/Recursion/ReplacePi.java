import java.util.Scanner;

public class ReplacePi {
	
	public static String replace(String str) {
		if(str.length()<2) {
			return str;
		}
		String firstTwo = str.substring(0, 2);
		if(firstTwo.equals("pi")) {
			return "3.14" + replace(str.substring(2));
		}
		else {
			return str.charAt(0) + replace(str.substring(1));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s = new Scanner(System.in);

String str = s.next();
System.out.println(replace(str));
	}

	

}
