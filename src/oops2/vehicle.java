package oops2;

public class vehicle {
	String color;
	private int maxspeed;
	
	public vehicle(int maxspeed) {
		this.maxspeed = maxspeed;
		System.out.println("Vehicle constructor");
	}

	public void setMaxspeed(int maxspeed) {
		this.maxspeed = maxspeed;
	}
	public int getMaxspeed() {
		return maxspeed;
	}
	
	public void print() {
		System.out.println("Colour : "+color+"\nMaxspeed : "+maxspeed);
	}

}
