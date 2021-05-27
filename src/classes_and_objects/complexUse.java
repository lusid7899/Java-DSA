package classes_and_objects;

import java.util.Scanner;

public class complexUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		complex c1 = new complex(2,3);
		c1.print();
		complex c2 = new complex(1,2);
		c2.print();
		c1.add(c2);
		c1.print();
		complex c = complex.add(c1, c2);
		c.print();
		complex x = c.conjugate();
		x.print();
		c1.setReal(1);
		c1.setimg(2);
		c2.setReal(1);
		c2.setimg(2);
		c1.print();c2.print();
		c1.mult(c2);
		c1.print();
		complex my = new complex(s.nextInt(),s.nextInt());
		my.print();
		complex my1 = new complex(s.nextInt(),s.nextInt());
		my1.print();
		System.out.print("adds to : ");
		complex c3 = complex.add(my, my1);
		c3.print();
		
	}

}
