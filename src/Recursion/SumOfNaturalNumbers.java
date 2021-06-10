import java.util.Scanner;

public class SumOfNaturalNumbers {

    public static int sum(int n) {
    	if(n==1) {
    		return 1;
    	}
    	return n+sum(n-1);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the Natural Number : ");
		int n = s.nextInt();
		int ans = sum(n);
		System.out.println("Sum : "+ans);
	}

}
