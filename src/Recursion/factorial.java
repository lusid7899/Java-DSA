import java.util.Scanner;

public class factorial {
	
	public static int fact(int n) {
		if(n==0) {
			return 1;
		}
		int shortAns = fact(n-1);
		return n*shortAns;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int ans  = fact(n);
        System.out.println("factorial of "+n+" : "+ans);
	}

}