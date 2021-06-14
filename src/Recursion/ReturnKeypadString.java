import java.util.Scanner;

public class ReturnKeypadString {
	
	public static String[] keypad(int n) {
		if(n==0) {
			String ans[] = {""};
			return ans;
				}
		int fno = n%10;
		String smallAns[] = keypad(n/10);
		String codefno = codes[fno-1];
		String ans[] = new String[codefno.length()*smallAns.length];
		int k=0;
		for(int i=0;i<smallAns.length;i++) {
			for(int j=0;j<codefno.length();j++) {
				ans[k] = smallAns[i]+codefno.charAt(j);
				k++;
			}
		}
		return ans;
	}
	
	static String codes[] = {"abc","def","ghi","jkl","mno","pqr","stu","vwx","yz"};

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s = new Scanner(System.in);
int n = s.nextInt();
String str[] = keypad(n);
for(int i=0;i<str.length;i++) {
	System.out.println(str[i]);
}
	}

}
