import java.util.Scanner;

public class TowerOfHanoi {
	
	public static void print(int n,char a,char b,char c) {
		if(n==0) {
			return;
		}
		print(n-1,a,c,b);
		System.out.println(n+" "+a+"->"+b);
		print(n-1,c,b,a);
	}
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	int n = s.nextInt();
	print(n,'a','b','c');
}
}
