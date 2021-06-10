import java.util.Scanner;

public class SumOfArray {
	
	public static int sum(int arr[]) {
		if(arr.length<=1) {
			return arr[0];
		}
		int smallArr[] = new int[arr.length-1];
		for(int i=1;i<arr.length;i++) {
			smallArr[i-1] = arr[i]; 
		}
		return arr[0]+sum(smallArr);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s = new Scanner(System.in);
System.out.print("Enter size of array : ");
int n = s.nextInt();
System.out.print("Enter elements of Array : ");
int arr[] = new int[n];
for(int i=0;i<n;i++) {
	arr[i] = s.nextInt();
}
System.out.println("Sum of elements : "+sum(arr));
	}

}
