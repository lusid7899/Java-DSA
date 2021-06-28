package assignment2;

import java.util.Scanner;

public class ReturnPermutations {
	
	public static String[] returnper(String str,int ci) {
	if(str.length()==1) {
		String ans[]= {""};
		ans[0] = ans[0] + str.charAt(0);
		return ans;
	}
	String ss = "";
	for(int i=0;i<str.length();i++) {
		if(str.charAt(ci)==str.charAt(i)) {
			continue;
		}
		ss=ss+str.charAt(i);
	}
	String smallans[] = returnper(ss, 0);
	if(ci==str.length()-1) {
		String ans[] = new String[smallans.length];
		for(int i=0;i<ans.length;i++) {
			ans[i] = str.charAt(ci)+smallans[i];
		}
		return ans;
	}
	String nextAns[]= returnper(str,ci+1);
	String ans[] = new String[smallans.length+nextAns.length];
	for(int i=0;i<smallans.length;i++) {
		ans[i] = str.charAt(ci) + smallans[i];
	}
	for(int i=smallans.length;i<ans.length;i++) {
		ans[i] = nextAns[i-smallans.length];
	}
	return ans;
	}

	public static void main(String[] args) {
Scanner s = new Scanner(System.in);
String str = s.next();
String ans[] = returnper(str,0);
for(int i=0;i<ans.length;i++) {
	System.out.println(ans[i]);
}
	}

}
