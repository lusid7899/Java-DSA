import java.util.Scanner;

public class interesting {

	public static void main(String[] args) {
Scanner s= new Scanner(System.in);
   int n=s.nextInt();
   int i=1;
   while(i<=n)
   {
	   int j=1;
	   char firstchar=(char)('A'+n-i);
	    while(j<=i)
	    {
	    	System.out.print(firstchar);
	    	System.out.print(' ');
	    	firstchar = (char)(firstchar + 1);
	    	j++;
	    }
	   System.out.println();
	   i++;
   }
	}

}
