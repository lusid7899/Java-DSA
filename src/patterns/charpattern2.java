import java.util.Scanner;

public class charpattern2 {

	public static void main(String[] args) {
Scanner s= new Scanner(System.in);
   int n=s.nextInt();
   int i=1;
   while(i<=n)
   {
	   int j=1;
	   char firstchar=(char)('A'+i-1);
	    while(j<=n)
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
