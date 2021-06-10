import java.util.Scanner;

public class multiply {
	
	public static int mult(int a,int b) {
		if(a==0 || b==0) {
			return 0;
		}
		if(b==1) {
			return a;
		}
		int ans = a+ mult(a,b-1);
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s = new Scanner(System.in);
int a=s.nextInt(),b=s.nextInt();
int ans = mult(a,b);
System.out.println(ans);
	}

}
