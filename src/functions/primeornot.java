package functions;

import java.util.Scanner;

public class primeornot {
	public static boolean primecheck(int n) {
		int i=2;
		while(i<n) {
			
			if(n%i==0) {
				return false;
		     }
			i++;
		}
		return true;
		
	}

	public static void main(String[] args) {
Scanner s = new Scanner(System.in);
int n = s.nextInt();
boolean isprime = primecheck(n);
System.out.println(isprime);
	}

}
