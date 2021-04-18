package functions;

import java.util.Scanner;

public class printPrime {
	public static boolean primecheck(int n) {
		int d=2;
		while(d<n) {
			if(n%d==0) {
				return false;
			}
			d++;
		}
		return true;
	}
	
    public static void printprime (int n)
    {
    	for(int i=1;i<=n;i++)
    	{
    		boolean ifprime = primecheck(i);
    		if(ifprime) {
    			System.out.println(i);
    		}
    	}
    }
	public static void main(String[] args) {
Scanner s= new Scanner(System.in);
int n = s.nextInt();
printprime(n);

	}

}
