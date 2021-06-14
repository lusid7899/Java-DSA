import java.util.Scanner;

public class printSubsequences {
	
	public static void print(String str,String op) {
		if(str.length()==0) {
			System.out.println(op);
			return;
		}

		print(str.substring(1),op);
		print(str.substring(1),op+str.charAt(0));
		
		
	}
	
	public static void print(String str) {
		print(str,"");
	}

	public static void main(String[] args) {
Scanner s = new Scanner(System.in);
String str = s.next();
print(str);
	}

}
