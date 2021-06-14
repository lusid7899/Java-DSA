import java.util.Scanner;

public class QuickSort {
	
	public static void sort(int r[],int si,int ei) {
		if(si>=ei) {
			return;
		}
		int pivotpos = partition(r,si,ei);
		sort(r,si,pivotpos-1);
		sort(r,pivotpos+1,ei);
	
	}
	
	public static int partition(int r[],int si,int ei) {
		int count = 0,temp;
		for(int i=si+1;i<=ei;i++) {
			if(r[si]>=r[i]) {
				count++;
			}
		}
		int pivotpos = si+count;
		temp = r[count+si];
		r[count+si]=r[si];
		r[si] = temp;
		int i=si,j=ei;
		while(i<pivotpos && j>pivotpos) {
			if(r[i]<=r[count+si]) {
				i++;
			}
			else {
				if(r[j]<=r[count+si]) {
					temp = r[j];
					r[j] = r[i];
					r[i] = temp;
					i++;
					j--;
				}
				else {
					j--;
				}
			}
		}
		return pivotpos;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s = new Scanner(System.in);
int n = s.nextInt();
int r[] = new int[n];
for(int i=0;i<n;i++) {
	r[i]=s.nextInt();
}
sort(r,0,n-1);
for(int i=0;i<n;i++) {
	System.out.print(r[i]+" ");
}

	}

}
