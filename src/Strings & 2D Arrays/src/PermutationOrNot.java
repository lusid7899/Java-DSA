import java.util.Scanner;

public class PermutationOrNot {
	public static boolean check(String s,String t) {
		boolean b=true;
		if(s.length() == t.length()) {
			for(int i=0;i<s.length();i++) {
				int k=0;
				for(int j=0;j<t.length();j++) {
					if(s.charAt(i)==t.charAt(j)) {
						k++;
						break;
					}
					
				}
				if(k==0) {
					b = false;
				}
			}
		}else { 
			b =false;
		}
		return b;
	}

	public static void main(String[] args) {
Scanner in = new Scanner(System.in);
String s = in.next();
String t = in.next();
boolean b = check(s,t);
System.out.println(b);
	}

}
