import java.util.Scanner;

public class XtoThePowerOfN {
	
	public static int power(int x,int n) {
		if(n==1) {
			return x;
		}
		n--;
		return x*power(x,n);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("Enter Number(X) and Power(N) : ");
		int x = s.nextInt(),n = s.nextInt();
		int ans = power(x,n);
		System.out.println(x+"^"+n+" : "+ans);

	}

}
