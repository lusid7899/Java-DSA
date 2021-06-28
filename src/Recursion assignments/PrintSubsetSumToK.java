package assignment2;
import java.util.Scanner;

public class PrintSubsetSumToK {
	
	public static void print(int[] ip,int si,int[] op,int pi,int x) {
		if(si==ip.length) {
			int sum = 0;
			for(int i=0;i<pi;i++) {
				sum = sum + op[i];
			}
			if(sum==x) {
			for(int i=0;i<pi;i++) {
				System.out.print(op[i]+" ");
			}
			System.out.println();
			return;
			}
			else {
				return;
			}
		}
		print(ip,si+1,op,pi,x);
		op[pi] = ip[si];
		print(ip,si+1,op,pi+1,x);
	}
	
	public static void print(int[] ip,int si,int x) {
		int op[] = new int[ip.length] ;
		print(ip,si,op,0,x);
	}

	public static void main(String[] args) {
Scanner s = new Scanner(System.in);
int n = s.nextInt();
int[] arr = new int[n];
for(int i=0;i<n;i++) {
	arr[i] = s.nextInt();
}
int x = s.nextInt();
print(arr,0,x);

	}

}

