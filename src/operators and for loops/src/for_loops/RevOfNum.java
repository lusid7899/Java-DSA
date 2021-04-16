package for_loops;

import java.util.Scanner;

public class RevOfNum {

	public static void main(String[] args) {
Scanner s = new Scanner(System.in);
int num = s.nextInt(),rev=0;
          while(num!=0)
          {
        	  int d = num%10;
        	  rev = rev*10 + d;
        	  num = num/10;
          }
          System.out.println("Reverse : "+rev);
	}

}
