import java.util.Scanner;

public class TripletSum {
	public static int[] takinginput() {
	Scanner s = new Scanner(System.in);
	int size = s.nextInt();
	int ar[] = new int[size];
	for(int i = 0;i<size;i++) {
		ar[i] = s.nextInt();
	}
	return ar;
	}
    public static int pair(int input []) {
    	Scanner s = new Scanner(System.in);
    	int x = s.nextInt(),k=0;
    	for(int i=0;i<input.length;i++) {
    		for(int j=i+1;j<input.length;j++) {
    			for(int p=j+1;p<input.length;p++) {
    			if(input[i]+input[j]+input[p]==x) {
    				k++;
    			}
    			}
    		}
    	}
    	return k;
    	
    }
	public static void main(String[] args) {
Scanner s = new Scanner(System.in);
int t = s.nextInt();
int pairs[]  = new int[t];

for(int i=0;i<t;i++) {
	int arr[]=takinginput();
	pairs[i] = pair(arr);
}
for(int i=0;i<t;i++) {
System.out.println(pairs[i]);
}

	}

}
