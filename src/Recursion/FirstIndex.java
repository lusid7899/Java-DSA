import java.util.Scanner;

public class FirstIndex {
	
	public static int find(int arr[],int x,int index) {
		if(index>= arr.length-1 && arr[index]!=x) {
			return -1;
		}
		if(arr[index]==x) {
			return index;
		}
		int ans = find(arr,x,index+1);
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n= s.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = s.nextInt();
		}
		int x = s.nextInt();
		int index = find(arr,x,0);
		System.out.println(index);
	}

}
