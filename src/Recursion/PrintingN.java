import java.util.Scanner;

public class PrintingN {
	
	public static void print(int n) {
		if(n==1) {
			System.out.print("1 ");
			return;
			
		}
		print(n-1);
		System.out.print(n+" ");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the Natural Number : ");
		int n = s.nextInt();
			print(n);


	}

}
