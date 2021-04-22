import java.util.Scanner;

public class SwapAlternate {
	
	public  static void takingInput() {
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		int input[] = new int[size];
		for (int i = 0;i<size;i++) {
			input[i] = s.nextInt();
		}
		swap(input);
	
	}
	public static void swap(int input[]) {
		int temp = 0;
		for(int i = 0;i<input.length-1;i+=2) {
			temp = input[i];
			input[i] = input[i+1];
			input[i+1] = temp;
			
		}
		for(int i = 0;i<input.length;i++) {
			System.out.print(input[i]+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
Scanner s = new Scanner(System.in);
int t = s.nextInt();

for(int i = 0;i<t;i++) {
	 takingInput();
	
}
	}

}
