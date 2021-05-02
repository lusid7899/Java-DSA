import java.util.Scanner;

public class CountWords {
	public static int count(String str) {
		int i=1;
		for(int j=0;j<str.length();j++) {
			if(str.charAt(j)==' ') {
				i++;
			}
		}
		return i;
	}

	public static void main(String[] args) {
Scanner s = new Scanner(System.in);
 	String str = "hii how are you";
 	int a = count(str);
 	System.out.println(a + " words");
	}

}
