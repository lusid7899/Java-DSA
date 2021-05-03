package twoDArrays;

import java.util.Scanner;

public class sinWave {
	public static void sinewave(int n,int m) {
		int arr[][] = new int[n][m];
		Scanner s = new Scanner(System.in);
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				arr[i][j] = s.nextInt();
			}
		}
		for(int j =0;j<m;j++) {
			int i=0;
			while(i<n) {
				System.out.print(arr[i][j]+" ");
				i++;
			}
			j++;
			i--;
		while(i>=0 && j<m) {
			System.out.print(arr[i][j]+" ");
			i--;
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
