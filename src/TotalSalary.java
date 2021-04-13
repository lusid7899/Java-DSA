import java.util.Scanner;
public class TotalSalary {

	public static void main(String[] args) {
Scanner s = new Scanner(System.in);
System.out.print("Enter your basic salary and your Grade : ");
int basic = s.nextInt(),totalsalary;
double hra,allow,pf,da;
String str = s.next();
char grade = str.charAt(0);
if(grade=='A')
{
allow=1700;	
}
else if(grade=='B')
{
allow=1500;	
}
else
{
allow=1300;	
}
hra=(20.0/100)*basic;
da=(50.0/100)*basic;
pf=(11.0/100)*basic;
totalsalary = (int)(basic+hra+da+allow-pf);
System.out.println(hra);
System.out.println(da);
System.out.println(pf);
System.out.println(allow);
System.out.print("Total Salary : ");
System.out.println(totalsalary);
	}

}
