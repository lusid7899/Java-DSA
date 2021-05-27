package classes_and_objects;

public class dynmArrayuse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dynmarray d = new dynmarray();
		dynmarray d1 = new dynmarray();
		
		for(int i=0;i<=5;i++) {
			d.add(i+2);
		}
		for(int i=0;i<=5;i++) {
			System.out.print(d.get(i)+" ");
		}
		System.out.println();
		for(int i=0;i<=6;i++) {
			d1.add(i+3);
		}
		for(int i=0;i<=6;i++) {
			System.out.print(d1.get(i)+" ");
		}
	
		
	}

}
