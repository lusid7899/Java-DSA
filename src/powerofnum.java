import java.util.Scanner;
public class powerofnum {

	public static void main(String[] args) {
Scanner s= new Scanner(System.in);
int x=s.nextInt(),n=s.nextInt(),ans=1,i=1;
if(n==0)
{
	ans=1;
}
else
{
 while(i<=n)
 {
	 ans=x*ans;
	 i++;
 }
}
System.out.println(ans);
	}

}
