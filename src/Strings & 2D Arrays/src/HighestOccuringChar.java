import java.util.Scanner;

public class HighestOccuringChar {
	public static void highest(String str) {
		char most = Character.MIN_VALUE;
		int x = Integer.MIN_VALUE;
		for(int i=0;i<str.length();i++) {
			int c = 0;
			
			for(int j = i+1;j<str.length();j++) {
				if(str.charAt(i)==most) {
					continue;
				}
				if(str.charAt(i)==str.charAt(j)) {
					c++;
				}
				
			}
			if(c>x) {
				x = c;
				most = str.charAt(i);
			}
		}
		System.out.println(most);
		
	}
	public static void main(String[] args) {
Scanner s = new Scanner(System.in);
String str  = s.nextLine();
highest(str);

	}

}
