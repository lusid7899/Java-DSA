
public class ArraySortedOrNot {
	
	public static boolean check(int input[]) {
		if(input.length<=1) {
			return true;
		}
		int smallInput[] = new int[input.length-1] ;
		for(int i=1;i<input.length;i++) {
			smallInput[i-1] = input[i];
		}
		boolean checkSmall = check(smallInput);
		if(!checkSmall) {
			return false;
		}
		if(input[0]<=input[1]) {
			return true;
		}
		else {
			return false;
		}
		
	}

	public static boolean check_2(int input[]) {
		if(input.length<=1) {
			return true;
		}
		if(input[0]>input[1]) {
			return false;
		}
		int smallInput[] = new int[input.length-1] ;
		for(int i=1;i<input.length;i++) {
			smallInput[i-1] = input[i];
		}
		boolean smallCheck = check_2(smallInput);
		if(smallCheck) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static boolean checkBetter(int input[],int startIndex) {
		if(startIndex==input.length-1) {
			return true;
		}
		if(input[startIndex]>input[startIndex+1]) {
			return false;
		}
		boolean smallAns = checkBetter(input, startIndex+1);
		return smallAns;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ar[] = {1,2,3,4,7};
		System.out.println(check(ar));
		System.out.println(check_2(ar));
		System.out.println(checkBetter(ar,0));
	}

}
