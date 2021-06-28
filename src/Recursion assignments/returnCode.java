package assignment2;

import java.util.Scanner;



public class returnCode {
	
	public static char helper(int k) {
		char[] ch = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};

		return ch[k-1];
	}								
	
	
	
	public static String[] returnCodes(String str) {
		
		if(str.length()==1) {
			int i = (int)(str.charAt(0)-'0');
			char c = helper(i);
		String ans[] = {""};
		ans[0] = ans[0] + c;
		return ans;
		}
		
		if(str.length()==2) {
			int i = (int)(str.charAt(0)-'0');
			int j = (int)(str.charAt(1)-'0');
			int k = 10*i + j;
			if(k>26) {
				String ans[] = {""};
				ans[0] = ans[0]+helper(i)+helper(j);
				return ans;
			}
			else {
				String ans[] = {"",""};
				ans[0] = ans[0] + helper(i)+helper(j);
				ans[1] = ans[1] + helper(k);
				return ans;
			}
		}
	
		int i = (int)(str.charAt(0)-'0');
		int j = (int)(str.charAt(1)-'0');
		int k = 10*i + j;
		if(k>26) {
			String smallans[] = returnCodes(str.substring(1));
			String ans[] = new String[smallans.length];
			char c = helper(i);
			for(int m=0;m<ans.length;m++) {
				ans[m]= c+smallans[m];
			}
			return ans;
		}
		else {
			
		String smallans1[] = returnCodes(str.substring(1));
		String smallans2[] = returnCodes(str.substring(2));
		String ans[]  = new String[smallans1.length+smallans2.length];
		char c1 = helper(i);
		char c2 = helper(k);
		for(int m=0;m<ans.length;m++) {
			if(m<smallans1.length) {
			ans[m] = c1+smallans1[m];
			}
			else {
				ans[m] = c2 + smallans2[m-smallans1.length];
			}
		}
		return ans;
		}
		
	}

	public static void main(String[] args) {
Scanner s = new Scanner(System.in);
String str = s.next();
String ans[] = returnCodes(str);
for(int i=0;i<ans.length;i++) {
	System.out.println(ans[i]);
}


	}

}
