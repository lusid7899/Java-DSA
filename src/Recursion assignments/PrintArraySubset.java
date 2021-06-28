package assignment2;
import java.util.Scanner;

public class PrintArraySubset {
	
	public static void print(int[] ip,int si,int[] op,int pi) {
		if(si==ip.length) {
			for(int i=0;i<pi;i++) {
				System.out.print(op[i]+" ");
			}
			System.out.println();
			return;
		}
		print(ip,si+1,op,pi);
		op[pi] = ip[si];
		print(ip,si+1,op,pi+1);
	}
	
	public static void print(int[] ip,int si) {
		int op[] = new int[ip.length] ;
		print(ip,si,op,0);
	}

	public static void main(String[] args) {
Scanner s = new Scanner(System.in);
int n = s.nextInt();
int[] arr = new int[n];
for(int i=0;i<n;i++) {
	arr[i] = s.nextInt();
}
print(arr,0);

	}

}
