import java.util.Scanner;

public class pattern3 {

	public static void main(String[] args) {
Scanner s = new Scanner(System.in);
int n= s.nextInt(), i=1;
   while(i<=n)
   {
	   int j=1;
	   while(j<=n)
	   {
		   System.out.print(j);
		   System.out.print(" ");
		   j++;
	   }
	   System.out.println();
	   i++;
   }
	}

}
