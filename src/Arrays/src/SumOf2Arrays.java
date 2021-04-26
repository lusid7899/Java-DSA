import java.util.Scanner;

public class SumOf2Arrays {
    public static int[] takeinput() {
    	Scanner s = new Scanner(System.in);
    	int n = s.nextInt();
    	int ar1[] = new int[n];
  for(int i=0;i<n;i++) {
	  ar1[i] = s.nextInt();
  }
  int m =s.nextInt();
  int ar2[] = new int[m];
  for(int i=0;i<m;i++) {
	  ar2[i] = s.nextInt();
  }
if(n>=m) {
	return sum(ar1,ar2);
}
else {
	return sum(ar2,ar1);
}
 
    }
    public static int[] sum(int ar1[],int ar2[]) {
    	int s=0,c=0,i=ar1.length-1,j=ar2.length-1,k=ar1.length;
    	int arr[] = new int[k+1];
    	while(j>=0) {
    		s = ar1[i]+ar2[j]+c;
    		arr[k] =s%10;
    		c = s/10;
    		i--;
    		j--;
    		k--;
    	}
    	while(i>=0) {
    		s = ar1[i]+c;
    		arr[k] =s%10;
    		c = s/10;
    		i--;
    		k--;
    	}
    	while(k>=0) {
    		arr[k] = c;
    		c=0;
    		k--;
    	}
    	return arr;
    }

	public static void main(String[] args) {
Scanner s = new Scanner(System.in);
int t = s.nextInt();
for(int i = 0;i<t;i++) {
	int arr[] = takeinput();
	for(int j = 0;j<arr.length;j++) {
		System.out.print(arr[j] +" ");
	}
	System.out.println();
}
	}

}
