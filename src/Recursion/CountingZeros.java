import java.util.Scanner;

public class CountingZeros {
	
	public static int countzero(int n) {
		if(n==0) {
			return 0;
		}
		int k= n%10;
		n = n/10;
		int sa = countzero(n);
		if(k==0) {
		return sa+1;
		}else {
			return sa;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int ans  = countzero(n);
        System.out.println("No. of Zeros in "+n+" : "+ans);
	}

}
