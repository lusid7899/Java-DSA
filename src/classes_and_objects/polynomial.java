package classes_and_objects;



public class polynomial {
	
	dynmarray coefficient;
	
	public polynomial() {
	coefficient = new dynmarray();
	}
  
public void setcoeff(int deg,int coeff) {
	if(deg>coefficient.size()) {
		for(int i= coefficient.size();i<deg;i++) {
			coefficient.add(0);
		}
		coefficient.add(coeff);
	}
	else if(deg<=coefficient.size()) {
		coefficient.set(deg, coeff);
	}
}

public void print() {
	for(int i=0;i<coefficient.size();i++) {
		if(i==0 && coefficient.get(i)!=0) {
			System.out.print(coefficient.get(i)+" ");
		}
		if(coefficient.get(i)!=0 && i!=0) {
			if(i==coefficient.size()-1) {
				if(coefficient.get(i)>0) {
				System.out.print(" + "+coefficient.get(i)+"x^"+i);
				}
				else {
					int k = -coefficient.get(i);
					System.out.print(" - "+k+"x^"+i);
					}
			}
			else {
				if(coefficient.get(i)>0) {
	System.out.print(" + "+coefficient.get(i)+"x^"+i);
				}
				else {
				int m = -coefficient.get(i);
				System.out.print(" - "+m+"x^"+i);
				}
			}
		}
	}
	System.out.println();
}

public int getcoeff(int deg) {
	if(deg>coefficient.size()) {
		//TODO error out
		return -1;
	}
	else {
		return coefficient.get(deg);
	}
}

public int degree() {
	return coefficient.size()-1;
}

public void add(polynomial p) {
	int i=0,j=0;
	if(coefficient.size()>=p.coefficient.size()) {
		while(j<p.coefficient.size()) {
			int m = coefficient.get(j)+p.coefficient.get(j);
			coefficient.set(j, m);
			j++;
		}
	}
	else {
while(i<coefficient.size()) {
	int k = coefficient.get(i)+p.coefficient.get(i);
	coefficient.set(i, k);
	i++;
}
while(i<p.coefficient.size()) {
	coefficient.add(p.coefficient.get(i));
	i++;
}
	}

}

public void minus(polynomial p) {
	int i=0;
	if(coefficient.size()>=p.coefficient.size()) {
		while(i<p.coefficient.size()) {
			int k = coefficient.get(i)-p.coefficient.get(i);
			coefficient.set(i, k);
			i++;
		}
	}
	else{
		i=0;
		while(i<coefficient.size()) {
			int k = coefficient.get(i)-p.coefficient.get(i);
			coefficient.set(i, k);
			i++;
		}
		while(i<p.coefficient.size()) {
			int k = -p.coefficient.get(i);
			coefficient.add(k);
			i++;
		}
	}
}

public static polynomial add(polynomial p1,polynomial p2) {
	int i=0,j=0;
	polynomial ans = new polynomial();
	if(p1.coefficient.size()>=p2.coefficient.size()) {
		while(j<p2.coefficient.size()) {
			int m = p1.coefficient.get(j)+p2.coefficient.get(j);
			ans.coefficient.add(m);
			j++;
		}
		while(j<p1.coefficient.size()) {
		int m = p1.coefficient.get(j);
		ans.coefficient.add(m);
		j++;
		}
	}
	else {
while(i<p1.coefficient.size()) {
	int k = p1.coefficient.get(i)+p2.coefficient.get(i);
	ans.coefficient.set(i, k);
	i++;
}
while(i<p2.coefficient.size()) {
	ans.coefficient.add(p2.coefficient.get(i));
	i++;
}
	}
	return ans;
}

public void multiply(polynomial p) {
	dynmarray temp = coefficient;
	coefficient = new dynmarray();
	int newdeg,newcoeff;
	int size = temp.size()+p.coefficient.size();
	for(int i=0;i<size;i++) {
		coefficient.add(0);
	}
	for(int i=0;i<temp.size();i++) {
		for(int j=0;j<p.coefficient.size();j++) {
			newdeg = i+j;
			newcoeff = (temp.get(i)*p.coefficient.get(j))+coefficient.get(newdeg);
			
			coefficient.set(newdeg, newcoeff);
		}
	}
}

public static int evaluate(polynomial p,int x) {
	int sum=p.coefficient.get(0);
	for(int i=1;i<p.coefficient.size();i++) {
		int j = i;
		int ev = 1;
		while(j!=0) {
			ev = ev*x;
			j--;
		}
		sum = sum + p.coefficient.get(i)*ev;
	}
	return sum;
}

}