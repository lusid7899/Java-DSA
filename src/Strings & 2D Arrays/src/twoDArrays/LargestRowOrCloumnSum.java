package twoDArrays;

import java.util.Scanner;

public class LargestRowOrCloumnSum {
	public static void rowcolumnsum(int n,int m) {
		Scanner in = new Scanner(System.in);
		int arr[][] = new int[n][m];
	
		int largestr =Integer.MIN_VALUE,largestc = Integer.MIN_VALUE;
		int row=0,col=0;
		for(int i=0;i<n;i++) {
			int s = 0;
			for(int j = 0;j<m;j++) {
			arr[i][j] = in.nextInt();
			s=s+arr[i][j];
			}
			if(s>largestr) {
				largestr = s;
				row = i;
			}
		}
		for(int j=0;j<m;j++) {
			int s = 0;
			for(int i = 0;i<n;i++) {
			s=s+arr[i][j];
			}
			if(s>largestc) {
				largestc = s;
				col=j;
			}
		}
		if(largestr>=largestc) {
			System.out.println("Row "+row+" "+largestr);
		}
		else {
			System.out.println("Column "+col+" "+largestc);
		}
	
	}


	public static void main(String[] args) {
Scanner s = new Scanner(System.in);
int t = s.nextInt();
for(int i=0;i<t;i++) {
	int n = s.nextInt(),m=s.nextInt();
	rowcolumnsum(n,m);
}
	}

}
