import java.util.Scanner;

public class pairStar {
	
	public static String pair(String str) {
		if(str.length()==1) {
			return str;
		}
		if(str.charAt(0)==str.charAt(1)) {
			return str.charAt(0)+"*"+pair(str.substring(1));
		}
		else {
			return str.charAt(0)+pair(str.substring(1));
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s = new Scanner(System.in);
String str = s.next();
System.out.println(pair(str));
	}

}
