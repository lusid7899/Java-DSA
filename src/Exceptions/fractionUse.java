package Exceptions;

public class fractionUse   {

	public static void main(String[] args)throws ZeroDenominatorException{//or instead of try,catching, throw ZeroDenExc here.
		// TODO Auto-generated method stub
        fraction f1 = new fraction(10,20);
    
        f1.setden(10);
        fraction f2 = new fraction(10,20);
       fraction f3 =  fraction.add(f1, f2);
       f3.print();

	}

}
