package Pattern2;

import java.util.Scanner;

public class triangleofnumbers {

	public static void main(String[] args) {
Scanner s= new Scanner(System.in);
int n=s.nextInt(),i=1;
 while(i<=n)
 {
	 int j=1;
	 while(j<=2*(n-i))
	 {
		System.out.print(" "); 
		j++;
	 }
	 j=1;
	 int firstnumber = i;
	 while(j<=i)
	 {
		 System.out.print(firstnumber);
		 firstnumber++;
		 j++;
	 }
	 firstnumber=firstnumber-2;
	 j=1;
	 while(j<=i-1)
	 {
		 System.out.print(firstnumber);
		 firstnumber--;
		 j++;
	 }
	 System.out.println();
	 i++;
 }

	}

}
