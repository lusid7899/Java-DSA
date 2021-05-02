import java.util.Scanner;

public class BubbleSort {
	public static void bubblesort(int[] arr) {
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int ar[] = new int[n];
		for(int i=0;i<n;i++) {
			ar[i] = s.nextInt();
		}
		bubblesort(ar);
		for(int i=0;i<n;i++) {
			System.out.print(ar[i]+" ");
		}

			}

}


