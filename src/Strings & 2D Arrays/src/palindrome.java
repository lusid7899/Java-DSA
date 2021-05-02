import java.util.Scanner;

public class palindrome {
	public static boolean check(String st) {
		int i=0,j=st.length()-1;
		boolean k = true;
		while(i<st.length() && j>0) {
			
			if(st.charAt(i) != st.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return k;
	}

	public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    String st = s.next();
    boolean k = check(st);
    System.out.println(k);
	
	}
}