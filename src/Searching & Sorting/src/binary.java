import java.util.Scanner;

public class binary {
	public static int binarysearch(int arr[],int x) {
		int start = 0,end=arr.length-1,mid=0;
       while(start<=end){
        	mid = (start+end)/2;
        	if(x==arr[mid]) {
        		return mid;
        	}
        	else if(x>arr[mid]) {
        		start = mid+1;
        	}
        	else  {

        		end = mid-1;
        	}
        	
        }
        return -1;
	}
public static void main (String args[]) {
	Scanner s = new Scanner(System.in); 
	int n = s.nextInt();
	int arr[] = new int[n];
	for(int i=0;i<n;i++) {
		arr[i] = s.nextInt();
	}
	int t = s.nextInt();
	int ans[] = new int[t];
	for(int i=0;i<t;i++) {
		int x = s.nextInt();
		ans[i] = binarysearch(arr,x);
	}
	for(int i=0;i<t;i++) {
		System.out.println(ans[i]);
	}
	
}
}
