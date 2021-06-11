import java.util.Scanner;

public class geometricSum {
	
	public static double geosum(double k) {
		if(k==0) {
			return 1.0;
		}
		
		double sa = geosum(k-1.0);
		double ans=1.0;
		for(int i=1;i<=k;i++) {
			ans = ans*(1.0/2.0);
		}

		return sa+ans;
	
	}

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		double k = s.nextInt();
		double ans = geosum(k);
		System.out.println(ans);

	}

}
