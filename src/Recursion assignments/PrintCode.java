package assignment2;

import java.util.Scanner;

public class PrintCode {
	
	public static char helper(int k) {
		char[] ch = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};

		return ch[k-1];
	}
	
	public static void printCodes(String str,String op) {
		if(str.length()==0) {
			System.out.println(op);
			return;
		}
		if(str.length()==1) {
			int k = (int)(str.charAt(0)-'0');
			op = op+helper(k);
			System.out.println(op);
			return;
		}
		int i= (int)(str.charAt(0)-'0');
		int j= (int)(str.charAt(1)-'0');
		int k= i*10 + j;
		if(k>26) {
			printCodes(str.substring(1),op+helper(i));
		}
		else {
			printCodes(str.substring(1),op+helper(i));
			printCodes(str.substring(2),op+helper(k));
		}
	}
	
	public static void printCodes(String str) {
		
		 printCodes(str,"");
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.next();
	 printCodes(str);
		
	}
}
