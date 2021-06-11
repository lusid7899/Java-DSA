import java.util.Scanner;

public class SumOfDigits {
	
	public static int sumdig(int a) {
		if(a==0) {
			return 0;
		}
		int ans = sumdig(a/10);
		int dig = a%10;
		return ans+dig;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int ans  = sumdig(n);
        System.out.println(ans);
	}

}
