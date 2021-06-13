import java.util.Scanner;

public class StringToInteger {

	public static int convert(String str) {
		if(str.length()==1) {
			return str.charAt(0)-'0';
		}
		double small = str.charAt(0)-'0';
		double faith = convert(str.substring(1));
		
		return (int)(small*Math.pow(10, str.length()-1)+faith);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String str = s.next();
		int st = convert(str);
		System.out.println(st);
	}

}
