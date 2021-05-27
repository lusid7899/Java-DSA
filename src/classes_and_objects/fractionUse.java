package classes_and_objects;

public class fractionUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fraction f1 = new fraction(2,4);
		f1.print();
		fraction f2 = new fraction(8,12);
		f2.print();
		f1.add(f2);
		f1.print();
		fraction f = fraction.add(f1,f2);
		f.print();
		f1.setnom(1);
		f1.setden(3);
		f2.setnom(1);
		f2.setden(3);
		f1.print();
		f2.print();
	f1.mult(f2);
		f1.print();
	}

	

}
