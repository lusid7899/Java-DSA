package for_loops;

import java.util.Scanner;

public class allprime {

	public static void main(String[] args) {
Scanner s = new Scanner(System.in);
int n = s.nextInt();
for(int i=2;i<=n;i++)
{
	boolean c=true;
	for(int d=2;d<i;d++)
	{
	  if(i%d==0)
	  {
		  c=false;
		  break;
	  }
	  
	}
	if(c)
	{
	System.out.println(i);
	}
}
	}

}
