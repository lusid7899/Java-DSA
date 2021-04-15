package for_loops;

import java.util.Scanner;

public class fibonacci {

	public static void main(String[] args) {
Scanner s = new Scanner(System.in);
int n = s.nextInt(),f1 = 1,f2=1,f3;
System.out.print(f1+" "+f2);
for(int i=2;i<=n;i++)
{
	f3 = f1+f2;
	System.out.print(" "+f3);
	f1 = f2;
	f2 = f3;
	if (i==n)
	{
		System.out.println();
		System.out.println(i+"th no of fibonachi series : "+f3);
	}
	
}

	}

}
