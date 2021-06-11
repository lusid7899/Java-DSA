import java.util.Scanner;

public class palindrome {
	
	public static boolean check(String str,int i,int j) {
		if(j==0) {
			return true;
		}
		boolean ans = check(str,i+1,j-1);
		if(ans==true) {
			if(str.charAt(i)==str.charAt(j)) {
				return ans;
			}else {
				return false;
			}	
		}
		else {
			return false;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String str = new String();
		str = s.next();
		System.out.println(check(str,0,str.length()-1));

	}

}
