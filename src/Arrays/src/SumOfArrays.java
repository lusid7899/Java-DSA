import java.util.Scanner;

public class SumOfArrays {
	
	public  static int[] takingInput() {
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		int input[] = new int[size];
		for (int i = 0;i<size;i++) {
			input[i] = s.nextInt();
		}
		return input;
	}
	public static int sum(int input[]) {
		int sum=0;
		for(int i = 0;i<input.length;i++) {
			sum = sum + input[i];
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int cases = s.nextInt();
		int sum[]= new int[cases];
		for(int i =0;i<cases;i++) {
			int arr[] = takingInput();
			sum[i] = sum(arr);
			
		}
		for(int i =0;i<cases;i++) {
			
			System.out.print(sum[i]+" ");
		}
	}

}
