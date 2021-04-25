import java.util.Scanner;

public class SecondHighest {
	public static int takeinput() {
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		int ar[] = new int[size];
		for(int i = 0;i<size;i++) {
			ar[i] = s.nextInt();
		}
		int n =secondhighest(ar);
		return n;
	}
	public static int secondhighest(int ar[]) {
		int x=0;
		for(int i =0;i<ar.length;i++) {
			for(int j=0;j<ar.length;j++) {
				if(ar[i]>ar[j]) {
					if(ar[j]>x) {
					x=ar[j];
					}
				}
			}
		}
		return x;
	}

	public static void main(String[] args) {
Scanner s = new Scanner(System.in);
int t = s.nextInt();
int ar[] = new int[t];
for(int i=0;i<t;i++) {
	ar[i] = takeinput();
}
for(int i=0;i<t;i++) {
	System.out.println(ar[i]);
}
	}

}
