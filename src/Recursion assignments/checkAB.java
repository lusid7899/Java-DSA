package assignment2;

import java.util.Scanner;

public class checkAB {
	
	public static boolean checkAB(String s) 
	{
	    if (s.length()==0) 
	        return true;
	    if (s.charAt(0) != 'a')
	        return false;
	    if (s.length() >= 3 && "abb".equals(s.substring(0,3)))
	        return checkAB(s.substring(3));
	    else
	        return checkAB(s.substring(1));
	}

	public static void main(String[] args) {
Scanner s = new Scanner(System.in);
String str = s.next();
System.out.println(checkAB(str));
	}

}
