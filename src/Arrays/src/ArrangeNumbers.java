import java.util.Scanner;

public class ArrangeNumbers {
	
	public static void arrange(int n[]) {
		
		
		for(int i=0;i<n.length;i++) {
			int a=0;
			int arr[] = new int[n[i]];
		for(int j=1;j<=n[i];j++) {
			if(j%2==1)
			{
				arr[a] = j;
				a++;
			}
		}
		for(int j=n[i];j>=1;j--) {
			if(j%2==0)
			{
				arr[a] = j;
				a++;
			}
		}
			
	output(arr);	
		}
	}
	public static void output(int input[]) {
		for(int i = 0;i<input.length;i++) {
			System.out.print(input[i]);
		}
		System.out.println();
	}

	public static void main(String[] args) {
Scanner s = new Scanner(System.in);
int t =s.nextInt();
int n[] = new int[t];
for(int i= 0;i<t;i++) {
	n[i] = s.nextInt();
}
arrange(n);
	}

}
