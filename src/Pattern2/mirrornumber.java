package Pattern2;

import java.util.Scanner;

public class mirrornumber {

	public static void main(String[] args) {
Scanner s= new Scanner(System.in);
int n= s.nextInt(),i=1;
while(i<=n)
{
	int j=1;
	while(j<=(n-i))
	{
		System.out.print("  ");
		j++;
	}
	j=1;
	while(j<=i)
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
