import java.util.Scanner;

public class printKeypad {
	static String codes[] = {"abc","def","ghi","jkl","mno","pqr","stu","vwx","yz"};
	
	public static void print(int n,String op) {
		if(n==0) {
			System.out.println(op);
			return;
		}
		int fno = n%10;
		String codesfno = codes[fno-1];
		for(int i=0;i<codesfno.length();i++) {
			print(n/10,codesfno.charAt(i)+op);
		}
	}
	
	
	public static void print(int n) {
		print(n,"");
	}

	public static void main(String[] args) {
Scanner s = new Scanner(System.in);
int n = s.nextInt();
print(n);
	}

}
