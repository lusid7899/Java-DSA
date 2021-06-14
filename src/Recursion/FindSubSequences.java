import java.util.Scanner;

public class FindSubSequences {
	 
	public static String[] find(String str) {
		if(str.length()==0) {
			String ans[] = {""};
			return ans;
		}
		
		String smallAns[] = find(str.substring(1));
		String ans[] = new String[2*smallAns.length];
		for(int i=0;i<smallAns.length;i++) {
			ans[i] = smallAns[i];
		}
		for(int i=0;i<smallAns.length;i++) {
			ans[i+smallAns.length] = str.charAt(0)+ smallAns[i];
		}
		return ans;
	}
	
	public static void main(String[] args) {
Scanner s = new Scanner(System.in);
String str = s.next();
String ans[] = find(str);
for(int i=0;i<ans.length;i++) {
	System.out.print(ans[i]+" ");
}
	}

}
