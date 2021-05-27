package classes_and_objects;
public class student {
	 public String name;
	 private int rollNum;
	 
	 //constructor(name same as class)
	private static int studentCount;
	 public student(String n, int rn) {
		 name = n;
		 rollNum = rn; 
		 studentCount++;
	 }
	 public static int getstudentCount() {
		 return studentCount;
	 }
	 
	 public void setRollNUm(int rn) {//setter
		 if(rn<=0) {
			 return;
		 }
		 rollNum = rn;
	 }
	 public int getRollNum() {//getter
		 return rollNum;
	 }
	 public void print() {
		 System.out.println(name +" : "+rollNum);
	 }
	}

