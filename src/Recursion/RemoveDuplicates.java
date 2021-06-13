import java.util.Scanner;

public class RemoveDuplicates {
	
	public static String remove(String str) {
		if(str.length()==1) {
			return str;
		}
		
		if(str.charAt(0)==str.charAt(1)) {
			return remove(str.substring(1));
		
		}
		else {
			return str.charAt(0)+remove(str.substring(1));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String str = s.next();
		System.out.println(remove(str));

	}

}
