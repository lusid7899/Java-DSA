import java.util.Scanner;

public class rotateArray {
	public static int[] takeinput() {
		Scanner s = new Scanner(System.in);

		int size = s.nextInt();
		int ar[] = new int[size];
	
		int k =0;
		for(int i=0;i<size;i++) {
			ar[i] = s.nextInt();
		}
		int x = s.nextInt();
		for(int i = 0;i<size;i++) {
			k++;
			if(x==ar[i]) {
				break;
			}
			
		}
		for(int i = 0;i<k;i++) {
			int temp = ar[0];
			for(int j = 0;j<size-1;j++) {
				ar[j] = ar[j+1];
			}
			ar[size-1] = temp;
		}
		return ar;
	}
	public static void main(String[] args) {
Scanner s = new Scanner(System.in);
int t = s.nextInt();

for(int i =0;i<t;i++) {
	int ar[] = takeinput();
	for(int j =0;j<ar.length;j++) {
		System.out.print(ar[j] +" ");
		
	}
	System.out.println();
}
	}

}
