import java.util.Scanner;

public class reversenum {

	public static void main(String[] args) {
Scanner s= new Scanner(System.in);
int n=s.nextInt();
int i=1;
 while(i<=n)
 {
	 int j=1;
	  int lastnum=i;
	  while(j<=i)
      {
	
		System.out.print(lastnum);
		System.out.print(" ");
	    lastnum--;
		j++;
	  }
	  System.out.println();
	i++;  
 }
	}

}
