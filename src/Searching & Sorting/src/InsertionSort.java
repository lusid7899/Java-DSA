import java.util.Scanner;

public class InsertionSort {
	public static void insertionsort(int[] arr) {
		for(int i=1;i<arr.length;i++) {
		int j = i-1;
		int temp = arr[i];
		while(j>=0 && arr[j]>temp) {
			arr[j+1] = arr[j];
			j--;
		}
			arr[j+1] = temp;
		}
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int ar[] = new int[n];
		for(int i=0;i<n;i++) {
			ar[i] = s.nextInt();
		}
		insertionsort(ar);
		for(int i=0;i<n;i++) {
			System.out.print(ar[i]+" ");
		}
	}

}
