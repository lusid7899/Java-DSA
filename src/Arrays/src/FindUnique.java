import java.util.Scanner;

public class FindUnique {
	public static int takeinput() {
		Scanner s = new Scanner(System.in);
		int size = s.nextInt(),n;
		int arr[]  = new int[size];
		for(int i = 0;i<size;i++) {
			arr[i] = s.nextInt();
		}
		n = unique(arr);
		return n;
	}
	public static int unique(int input[]) {
		int n=0;
		for(int i=0;i<input.length;i++) {
			int k =0;
			for(int j=0;j<input.length;j++) {
				if(input[i]==input[j]) {
					k++;
				}
				
			}
			if(k<2)
			{
				n = input[i];
			}	
		}
		
	return n;
	}

	public static void main(String[] args) {
Scanner s = new Scanner(System.in);
int t = s.nextInt();
int arr[]= new int[t];
for(int i = 0;i<t;i++) {
arr[i] =	takeinput();
	
}
for(int i = 0;i<t;i++)
{
	System.out.println(arr[i]);
}

	}

}
