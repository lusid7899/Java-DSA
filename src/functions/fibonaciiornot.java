package functions;

import java.util.Scanner;

public class fibonaciiornot {
	public static boolean fibocheck(int n) {
		int f0=0,f1=1,f2;
		for(int i=1;i<=1000;i++)
		{
			f2=f0+f1;
			if(f2==n)
			{
				return true;
			}
			f0=f1;
			f1=f2;
			
		}
		return false;
		
	}

	public static void main(String[] args) {
Scanner s= new Scanner(System.in);
int n=s.nextInt();
boolean fiboornot = fibocheck(n);
System.out.println(fiboornot);
	}

}
