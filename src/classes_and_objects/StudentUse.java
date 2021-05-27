package classes_and_objects;


public class StudentUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student s1 = new student("siddhu",47);
		s1.print();
		student s2 = new student("siddhu",47);
		s2.print();
		System.out.println(student.getstudentCount());
	}

}
