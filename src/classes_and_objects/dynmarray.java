package classes_and_objects;

public class dynmarray {
 private int data[];
 private int nxtindx;
 
 	public dynmarray() {
 		data = new int[5];
 		nxtindx = 0; 
 	}
 	
 	public int size() {
 		return nxtindx;
 	}
 	
 	public void add(int element) {
 		if(nxtindx==data.length) {
 			restructure();
 		}
 		data[nxtindx] = element;
 		nxtindx++;
 	}
 	
 	public void restructure() {
 		int nw[] = data;
 		data = new int[data.length * 2];
 		for(int i=0;i<nw.length;i++) {
 			data[i] = nw[i];
 		}
 	}
 	
 	public void set(int index ,int element) {
 		if(index>nxtindx) {
 			return;
 		}
 		
 		if(index<nxtindx) {
 			data[index] = element;
 		}
 		else{
  			add(element);
  		}
 	}

 	public int get(int index) {
 		if(index>=nxtindx) {
 			// TODO error out
 		}
 		return data[index];
 	}

 	public int removelast() {
 		if(size()==0) {
 			// TODO error out
 		}
 		int value = data[nxtindx-1];
 		data[nxtindx-1] = 0;
 		nxtindx--;
 		return value;
 	}

 	public boolean isEmpty() {
 		if(size()==0) {
 			return true;
 		}
 		else {
 			return false;
 		}
 	}
}
