package for_loops;

import java.util.Scanner;

public class TermsOfAP {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int x = s.nextInt();
		int ap = 0,p=0;
	
		for(int i = 1 ;i<=1000;i++)
		{
			
			ap = 3*i + 2;
			if(ap%4==0)
			{
				continue;
			}
			System.out.print(ap+" ");
			p++;
			if(p>=x)
				break;
			
		}
		
	}

}
