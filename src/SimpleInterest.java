import java.util.Scanner;
public class SimpleInterest {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int p=s.nextInt(),r=s.nextInt(),t=s.nextInt(),si;
		si=p*r*t/100;
		System.out.println(si);
	}

}
