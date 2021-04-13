import java.util.Scanner;

public class biggestofall {

	public static void main(String[] args) {
Scanner s = new Scanner(System.in);
int a=s.nextInt(),b=s.nextInt(),c=s.nextInt();
boolean isAbiggest = ( a >= b ) && ( a >= c );
System.out.println(isAbiggest);
}

       }
