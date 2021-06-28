package assignment2;

import java.util.Scanner;

public class printPermutations {
	
	public static void printper(String str,String op) {
		if(str.length()==0) {
			System.out.println(op);
			return;
		}
		for(int i=0;i<str.length();i++) {
			String newop = op+str.charAt(i);
			String newstr = str.substring(0, i) + str.substring(i+1);
			printper(newstr,newop);
		}
	}
	
	public static void printper(String str) {
		printper(str,"");
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.next();
		printper(str);
	}

}
