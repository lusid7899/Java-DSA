package classes_and_objects;

public class PolynomialUse {

	public static void main(String[] args) {

		polynomial p1 = new polynomial();
		polynomial p2 = new polynomial();
      p1.setcoeff(0, 1);
      p1.setcoeff(1, 2);
      p1.setcoeff(2, 3);
     
    
   p1.print();

 
int k  = polynomial.evaluate(p1, 10);
System.out.println(k);
	}

}
