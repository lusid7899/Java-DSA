import java.util.Scanner;

public class removeCharacters {
	public static void remove(String str, String x) {
		String nu = "";
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==x.charAt(0)) {
				continue;
			}
			nu = nu+str.charAt(i);
		}
		System.out.println(nu);
	}
	public static void main(String[] args) {
Scanner s = new Scanner(System.in);
String str = s.nextLine();
String x = s.next();
remove(str,x);
	}

}
