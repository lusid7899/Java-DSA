import java.util.Scanner;

public class Merge2SortedArrays {
	public static int[] merge(int ar1[],int ar2[]) {
		int i=0,j=0,k=0;
		int ar3[] = new int[ar1.length+ar2.length];
		while(i<ar1.length && j<ar2.length) {
			if(ar1[i]<ar2[j]) {
				ar3[k] = ar1[i];
				i++;
				k++;
			}else {
				ar3[k] = ar2[j];
				j++;
				k++;
			}
		}
		while(i<ar1.length) {
			ar3[k] = ar1[i];
			i++;
			k++;
		}
		while(j<ar1.length) {
			ar3[k] = ar2[j];
			j++;
			k++;
		}
		return ar3;
	}
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	int n = s.nextInt();
	int ar1[] = new int[n];
	for(int i=0;i<n;i++) {
		ar1[i] = s.nextInt();
	}
	int m = s.nextInt();
	int ar2[] = new int[n];
	for(int i=0;i<n;i++) {
		ar2[i] = s.nextInt();
	}
	int ar3[] = merge(ar1,ar2);
	for(int i=0;i<ar3.length;i++) {
		System.out.print(ar3[i]+" ");
	}
}
}
