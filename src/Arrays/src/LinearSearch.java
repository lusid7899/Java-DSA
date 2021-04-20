import java.util.Scanner;

public class LinearSearch {
	public  static int[] takingInput() {
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		int input[] = new int[size];
		for (int i = 0;i<size;i++) {
			input[i] = s.nextInt();
		}
	
		
		return input;
	}
	public static int search(int input[]) {
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		int found=-1;
		for(int i = 0;i<input.length;i++) {
			if(x==input[i])
			{
				found=i;
			}
		}
		return found;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int cases = s.nextInt();
		int pos[]= new int[cases];
		for(int i =0;i<cases;i++) {
			int arr[] = takingInput();
			pos[i] = search(arr);
			
		}
		for(int i =0;i<cases;i++) {
			
			System.out.println(pos[i]);
		}
	}

}
