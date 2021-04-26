import java.util.Scanner;

public class sort012 {
	public static int[] takeinput() {
		Scanner s = new Scanner(System.in);
		int size = s.nextInt(),c=0,p=0;
		int arr[] = new int[size];
		for(int i=0;i<size;i++) {
			int n = s.nextInt();
			if(n==0) {
				c++;
			}
			else if(n==1) {
				p++;
			}
		}
		for(int i=c;i<c+p;i++) {
			arr[i]=1;
		}
		for(int i=p+c;i<size;i++) {
			arr[i]=2;
		}
		return arr;
		
	}

	public static void main(String[] args) {
Scanner s = new Scanner(System.in);
int t = s.nextInt();
for(int i = 0;i<t;i++) {
	int arr[] = takeinput();
	for(int j=0;j<arr.length;j++) {
		System.out.print(arr[j] +" ");
	}
	System.out.println();
}

	}

}
