import java.util.Scanner;

public class squarepattern {

	public static void main(String[] args) {
Scanner s = new Scanner(System.in);
int n= s.nextInt(), i=1;
if(n>=0 && n<=50)
{
   while(i<=n)
   {
	   int j=1;
	   while(j<=n)
	   {
		   System.out.print(n);
		   System.out.print(" ");
		   j++;
	   }
	   System.out.println();
	   i++;
   }
	}
else System.out.println("wrong input");
}

}
