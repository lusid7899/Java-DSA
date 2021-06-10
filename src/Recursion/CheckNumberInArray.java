import java.util.Scanner;

public class CheckNumberInArray {
	
	public static boolean checkNum(int arr[],int x) {
		if(arr[0]==x) {
			return true;
		}
		if(arr.length==1 && arr[0]!=x){
			return false;
		}
		int smallArr[] = new int[arr.length-1];
		for(int i=1;i<arr.length;i++) {
			smallArr[i-1] = arr[i]; 
		}
		boolean smallCheck = checkNum(smallArr,x);
		return smallCheck;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = s.nextInt();
		}
		int x = s.nextInt();
		System.out.println(checkNum(arr,x));
	}

}
