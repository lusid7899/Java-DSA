import java.util.Scanner;

public class CompressString {
	public static void compress(String str) {
		String nu = "";
		int n = str.length()-1;
		int c=1,i=0;
		while(i<n) {
			if(str.charAt(i)==str.charAt(i+1)) {
				i++;
				c++;
			}else {
				if(c>1) {
				nu = nu +str.charAt(i)+c;
				c=1;
				i++;
				}else {
					nu = nu+str.charAt(i);
					i++;
				}
				
			}
		}
		if(str.charAt(n)==str.charAt(n-1)) {
			c++;
			nu = nu + str.charAt(n)+c;
		}else
			nu = nu+str.charAt(n);
		System.out.println(nu);
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str  = s.nextLine();
		compress(str);
	}

}
