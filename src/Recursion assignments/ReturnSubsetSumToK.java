package assignment2;

import java.util.Scanner;

public class ReturnSubsetSumToK {
	
	public static int[][] returnSubset(int arr[],int ei){
		if(ei==0) {
			int ans[][] = {{},{arr[ei]}};
			return ans;
		}
		
		int num = arr[ei];
		
		int smallans[][] = returnSubset(arr,ei-1);
		int ans[][]  = new int[2*smallans.length][]; 
		int count = 0;
	
		for(int i=0;i<smallans.length;i++) {
			ans[i] = new int[smallans[i].length];
			for(int j = 0;j<smallans[i].length;j++) {
			ans[i][j] = smallans[i][j];	
			}
		}
		for(int i=0;i<smallans.length;i++) {
			ans[i+smallans.length] = new int[smallans[i].length+1];
		
			for(int j = 0;j<smallans[i].length;j++) {
				ans[i+smallans.length][j] = smallans[i][j];
			}
			ans[i+smallans.length][smallans[i].length] = num;		
			}

		return ans;
	}
	
	public static int[][] returnSubsetSum(int[] arr, int ei,int k) {
		int subsets[][] = returnSubset(arr,ei);
		int count=0,temp=0;
		for(int i=0;i<subsets.length;i++) {
			int sum = 0;
			for(int j=0;j<subsets[i].length;j++) {
			sum = sum+subsets[i][j];
			}
			if(sum==k) {
				count++;
			}
		}
		int ans[][] = new int[count][];
		for(int i=0;i<subsets.length;i++) {
			int sum=0;
			for(int j=0;j<subsets[i].length;j++) {
			sum = sum+subsets[i][j];
			}
			if(sum==k) {
				 
					ans[temp] = new int[subsets[i].length];
					for(int j=0;j<subsets[i].length;j++) {
					ans[temp][j] = subsets[i][j];	

				}
					temp++;
			}
		}
		return ans;
	}
	

	public static void main(String[] args) {
Scanner s = new Scanner(System.in);
int n = s.nextInt();
int[] arr = new int[n];
for(int i=0;i<n;i++) {
	arr[i] = s.nextInt();
}
int k = s.nextInt();
int ans[][] = returnSubsetSum(arr,n-1,k);
for(int i=0;i<ans.length;i++) {
	for(int j = 0;j<ans[i].length;j++) {
		System.out.print(ans[i][j]+" ");
	}
	System.out.println();
}

	}

}
