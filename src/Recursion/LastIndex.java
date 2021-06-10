import java.util.Scanner;


public class LastIndex{
	
	public static int find(int arr[],int x,int index) {
		if(index>=arr.length-1) {
			return -1;
		}
		int k = find(arr,x,index+1);
		if(k==-1) {
			if(arr[index]==x) {
				return index;
			}
			else {
				return -1;
			}
		}
		else {
			return k;
		}
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
