import java.util.Scanner;

public class ReverseString {
	public static String reverse(String str) {
		String s ="",k=" ";
		int e = str.length();
		for(int i = str.length()-1;i>=0;i--) {
			if(str.charAt(i)==' ') {
				s= s+str.substring(i+1, e)+k;
				e = i;
			}
			else if(i==0) {
				s=s+str.subSequence(i, e);
			}
		}
		return s;
	}

	public static void main(String[] args) {
Scanner s = new Scanner(System.in);
String str = s.nextLine();
String str2 = reverse(str);
System.out.println("reverse :" +str2);
	}

}
