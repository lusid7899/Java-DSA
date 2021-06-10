import java.util.Scanner;


public class AllIndexes{
	
	public static int[] find(int arr[],int x,int index,int howmany) {
		if(index>=arr.length-1) {
			return new int[howmany];
		}
	if(arr[index]==x) {
		int indarr[] = find(arr,x,index+1,howmany+1);
		indarr[howmany] = index;
		return indarr;
	}
	else {
		int indarr[] = find(arr,x,index+1,howmany);
		return indarr;
	}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n= s.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = s.nextInt();
		}
		int x = s.nextInt();
		int indexes[] = find(arr,x,0,0);
		if(indexes.length==0) {
		System.out.println("Not there");
		}
		else {
			for(int i=0;i<indexes.length;i++) {
				System.out.print(indexes[i]+" ");
			}
		}
	}

}