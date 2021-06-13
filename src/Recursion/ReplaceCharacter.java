import java.util.Scanner;

public class ReplaceCharacter {
	
	public static String replace(String str,char a,char b) {
		if(str.length()<2) {
			if(str.charAt(0) == a) {
				return ""+b;
			}else {
				return str;
			}
		}
		if(str.charAt(0)==a) {
			return b+replace(str.substring(1),a,b);
		}
		else {
			return str.charAt(0)+replace(str.substring(1),a,b);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s = new Scanner(System.in);

String str = s.next();
char a=s.next().charAt(0);
char b = s.next().charAt(0);
System.out.println(replace(str,a,b));
	}
}