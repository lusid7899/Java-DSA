import java.util.Scanner;

public class removeX {
	
	public static String remove(String str) {
		if(str.length()<2) {
			if(str.charAt(0) == 'x') {
				return "";
			}else {
				return str;
			}
		}
		if(str.charAt(0)=='x') {
			return ""+remove(str.substring(1));
		}
		else {
			return str.charAt(0)+remove(str.substring(1));
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s = new Scanner(System.in);

String str = s.next();
System.out.println(remove(str));
	}
}