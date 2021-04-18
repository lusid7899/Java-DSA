package functions;

import java.util.Scanner;

public class FahToCel {
	public static void converter(int s,int e,int w) {
		
		while(s<=e)
		{
			int c=(int)((5.0/9)*(s-32));
			
			System.out.println(s+" "+c);
			s=s+w;
		}
	}

	public static void main(String[] args) {
Scanner scn = new Scanner(System.in);
int s = scn.nextInt(),e=scn.nextInt(),w=scn.nextInt();
converter(s,e,w);
	}

}
