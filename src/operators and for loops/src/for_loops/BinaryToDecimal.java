package for_loops;

import java.util.Scanner;

public class BinaryToDecimal {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
int bin = s.nextInt(),dec=0,dig,q=0;
        while(bin!=0)
        {
         dig = bin%10;
         bin = bin/10;
         if(dig==1)
         {
        	 if(q==0)
        	 {
        		 dec=1;
        		 q++;
        	 }
        	 else
        	 {
        		 int prod=1;
        		 for(int i=1;i<=q;i++)
        		 {
        			prod=prod*2; 
        		 }
        	 dec=dec+prod;
        	 q++;
        	 }
         }
         else
         {
        	 q++;
        	 continue;
         }
        
         
        }
        System.out.println("decimal : "+dec);
	}

}
