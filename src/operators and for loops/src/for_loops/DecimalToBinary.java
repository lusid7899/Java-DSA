package for_loops;

import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {
Scanner s = new Scanner(System.in);
int dec = s.nextInt(),dig;
long bin=0,mult =1;
       while(dec!=0)
       {
    	 
    	   dig=dec%2;
    	   dec /= 2;
    	   if(dig==1)
    	   {
    		   bin = bin + mult;

    		   mult = mult*10;
    		  
    	   }
    
           
    	   else
    	   {
    		   mult=mult*10;

    		
    	   }
    	 }
     
   System.out.println(bin);
	}	

}
