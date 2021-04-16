package for_loops;

import java.util.Scanner;

public class SumOrProduct {

	public static void main(String[] args) {
Scanner s = new Scanner(System.in);
int n = s.nextInt(),c = s.nextInt(),sum=0,prod=1;
  if(n>=1 && n<=12)
  {
	 switch(c)
	 {
	   case 1 : for(int i =1;i<=n;i++)
	            {
		         sum = sum+i;
	            }
	           System.out.println(sum);
	           break;
	   case 2 : for(int i =1;i<=n;i++)
       {
        prod = prod*i;
       }
      System.out.println(prod);
      break;
      default : System.out.println("-1");
	 }
  }
  else
  {
	  System.out.println("Invalid Input");
  }
	}

}
