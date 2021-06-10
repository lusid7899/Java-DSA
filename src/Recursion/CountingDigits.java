import java.util.Scanner;

public class CountingDigits {
	
	public static int countDigits(int n) {
		if(n==0) {
			return 0;
		}
		n = n/10;
		int sa = countDigits(n);
		return sa+1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int ans  = countDigits(n);
        System.out.println("No. of Digits in "+n+" : "+ans);
	}

}
