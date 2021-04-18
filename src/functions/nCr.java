package functions;
import java.util.Scanner;

public class nCr {
	public static int factorial(int n) {
		int ans=1;
		for(int i =1;i<=n;i++) {
			ans=ans*i;
		}
		return ans;
	}

	public static void main(String[] args) {
Scanner s = new Scanner(System.in);
int n = s.nextInt(),r = s.nextInt();
int ans= factorial(n)/(factorial(r)*factorial(n-r));
System.out.println(ans);
	}

}
