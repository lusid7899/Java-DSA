package twoDArrays;

import java.util.Scanner;

public class AllRowsSum {
	public static void rowsum(int n,int m) {
		Scanner in = new Scanner(System.in);
		int arr[][] = new int[n][m];
		int sum[] = new int[n];
		for(int i=0;i<n;i++) {
			int s = 0;
			for(int j = 0;j<m;j++) {
			arr[i][j] = in.nextInt();
			s=s+arr[i][j];
			}
			sum[i] = s;
		}
		for(int i=0;i<n;i++) {
			System.out.print(sum[i]+" ");
		}
	}


	public static void main(String[] args) {
Scanner s = new Scanner(System.in);
int t = s.nextInt();
for(int i=0;i<t;i++) {
	int n = s.nextInt(),m=s.nextInt();
	rowsum(n,m);
}
	}

}
