package oops2;

public class car extends vehicle{
	int numGear;
	boolean isConvertible;
	
	public car(int maxspeed,int numGear) {
		super(maxspeed);
		this.numGear = numGear;
		
		System.out.println("car cunstructor");
	}

	public boolean isConvertible() {
		return isConvertible;
	}
	public void print() {
		super.print();
		System.out.println("Number of gears : "+numGear+"\nConvertible : "+isConvertible);
	}

}
