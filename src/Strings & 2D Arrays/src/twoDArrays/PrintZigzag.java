package twoDArrays;

import java.util.Scanner;

public class PrintZigzag {
	public static void zigzag(int n,int m) {
Scanner s = new Scanner(System.in);
int a[][] = new int[n][m];
for(int i=0;i<n;i++) {
	for(int j=0;j<m;j++) {
		a[i][j] = s.nextInt();
	}
}
		int k=0;
		while(k<n) {
			for(int i=0;i<m;i++) {
				System.out.print(a[k][i]+" ");
			}k++;
			if(k<n) {
			for(int i=m-1;i>=0;i--) {
				System.out.print(a[k][i]+" ");
			}k++;
			}
		}
	}
	public static void main(String[] args) {
Scanner s = new Scanner(System.in);
int n = s.nextInt(),m=s.nextInt();
zigzag(n,m);
	}

}
