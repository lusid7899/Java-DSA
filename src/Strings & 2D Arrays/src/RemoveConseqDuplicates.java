import java.util.Scanner;

public class RemoveConseqDuplicates {
	public static void remove(String s) {
		int i=0;
		String n = "";
		
		while(i<s.length()-1) {
			
			if(s.charAt(i)==s.charAt(i+1)) {
				i++;
				
				continue;
			}
			else {
				n = n+s.charAt(i);
				i++;
			}
	
		}
		n = n+s.charAt(s.length()-1);
		System.out.println(n);
	}
	public static void main(String[] args) {
Scanner s = new Scanner(System.in);
String str = s.next();
remove(str);
	}

}
