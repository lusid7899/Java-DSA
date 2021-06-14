import java.util.Scanner;

public class MergeSort {
	
	public static void mergeSort(int inp[],int si,int ei) {
		if(si>=ei) {
			return ;
		}
		int mi = (si+ei)/2;
		mergeSort(inp, si, mi);
		mergeSort(inp, mi+1, ei);
		merge(inp,si,ei);
		
	}
	
	public static void merge(int inp[],int si,int ei) {
		int mid = (si+ei)/2;
		int ar[] = new int[ei-si+1];
		int i = si;
		int j = mid+1;
		int k=0;
		while(i<=mid&&j<=ei) {
			if(inp[i]<=inp[j]) {
				ar[k]=inp[i];
				i++;
				k++;
			}
			else {
				ar[k] = inp[j];
				j++;
				k++;
			}
		}
		while(i<=mid) {
			ar[k] = inp[i];
			i++;
			k++;
		}
		while(j<=ei) {
			ar[k] = inp[j];
			j++;
			k++;
		}
		for(int m = 0;m<ar.length;m++) {
			inp[m+si] = ar[m];
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s = new Scanner(System.in);
int n = s.nextInt();
int arr[] = new int[n];
for(int i=0;i<n;i++) {
	arr[i] = s.nextInt();
}
mergeSort(arr,0,n-1);
for(int i=0;i<n;i++) {
	System.out.print(arr[i]+" ");
}
	}

}
