package for_loops;

import java.util.Scanner;

public class SqRoot {

	public static void main(String[] args) {
Scanner s = new Scanner(System.in);
int n = s.nextInt(),root=1;
      int i=1;
      while((n-(i*i))>=0)
      {
    	  root=i;
    	  i++;
      }
      System.out.println(root);
    	  
	}

}
