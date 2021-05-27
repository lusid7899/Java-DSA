package classes_and_objects;

public class complex {
	private int real,img;
	
	public complex(int real,int img) {
		this.real = real;
		this.img = img;
	}
	
	public int getReal() {
		return real;
	}
	public void setReal(int real) {
		this.real = real;
	}
	public int getImg() {
		return img;
	}
	public void setimg(int img) {
		this.img = img;
	} 
	
	public void print() {

		if(img>=0)
		System.out.println(real+" + "+img+"i");
		else {
			int temp;
			temp = -img;
			System.out.println(real+" - "+temp+"i");
		}
	}
	public void add(complex c) {
		this.real = this.real + c.real;
		this.img = this.img + c.img;
	}
	
	public static complex add(complex c1,complex c2) {
		int newReal = c1.real + c2.real;
		int newImg = c1.img + c2.img;
		complex c = new complex(newReal,newImg);
		return c;
	}

	public void mult(complex c) {
		int r = real,i = img;
	 real = r*c.real - i*c.img;
	 img = r*c.img + i*c.real;
	}

	public complex conjugate() {
		int newReal = real,newImg;
		
		if(img>=0) {
			newImg = -img;
			
		}
		else {
			newImg = -img;
		}
		complex c = new complex(newReal,newImg);
		return c;
	}
}


