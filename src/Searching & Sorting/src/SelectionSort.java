import java.util.Scanner;

public class SelectionSort {
	public static int[] selectionsort(int arr[]) {
		for(int i=0;i<arr.length-1;i++) {
			int min = arr[i];
			int minIndex = i;
			for(int j = i+1;j<arr.length;j++) {
				if(arr[j]<min) {
					min = arr[j];
					minIndex = j;
				}
			}
			if(minIndex!=i) {
			arr[minIndex] = arr[i];
			arr[i] = min;
			}
		}
		return arr;
	}
	public static void main(String[] args) {
		
Scanner s = new Scanner(System.in);
int n = s.nextInt();
int arr[] = new int[n];
for(int i=0;i<n;i++) {
	arr[i] = s.nextInt();
}
int arr2[] = selectionsort(arr);
for(int i=0;i<n;i++) {
	System.out.print(arr2[i]+" ");
}

	}

}
