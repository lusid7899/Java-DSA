package assignment2;

import java.util.Scanner;

public class BinarySearch {
	
	public static int search(int[] arr,int x,int si,int ei) {
		if(si>ei) {
			return -1;
		}
		int mid = (si+ei)/2;
		if(x==arr[mid]) return mid;
		else if(x<arr[mid]) {
			return search(arr,x,si,mid-1);
		}else {
			return search(arr,x,mid+1,ei);
		}
	}

	public static void main(String[] args) {
Scanner s = new Scanner(System.in);
int n = s.nextInt();
int[] arr = new int[n];
for(int i =0;i<n;i++){
	arr[i] = s.nextInt();
}
int x = s.nextInt();
System.out.println(search(arr,x,0,n-1));
	}

}
