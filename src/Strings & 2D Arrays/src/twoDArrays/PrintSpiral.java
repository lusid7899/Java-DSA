package twoDArrays;

import java.util.Scanner;

public class PrintSpiral {
	public static void sinewave(int n,int m) {
		int a[][] = new int[n][m];
		Scanner s = new Scanner(System.in);
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				a[i][j] = s.nextInt();
			}
		}
		int k=0,l=0;
		while(k<n && l<m) {
			for(int i = l;i<m;i++) {
				System.out.print(a[k][i]+" ");
			}k++;
			for(int i=k;i<n;i++) {
				System.out.print(a[i][m-1]+" ");
			}m--;
			if(k<n) {
			for(int i=m-1;i>=l;i--) {
				System.out.print(a[n-1][i]+" ");
			}n--;
			}
			if(l<m) {
			for(int i=n-1;i>=k;i--) {
				System.out.print(a[i][l]+" ");
			}l++;
			}
		}
		
	}
	public static void main(String[] args) {
Scanner s = new Scanner(System.in);
int t = s.nextInt(),n =s.nextInt(),m=s.nextInt();
for(int i=0;i<t;i++) {
	sinewave(n,m);
}
	}

}
