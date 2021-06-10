import java.util.Scanner;

public class FibonaciNumber {
	public static int fib(int n) {
		
		if(n==0 || n==1) {
			return n;
		}
		
		return fib(n-1)+fib(n-2); 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int ans  = fib(n);
        System.out.println(n+"th fibonaci number is : "+ans);
	}

}
