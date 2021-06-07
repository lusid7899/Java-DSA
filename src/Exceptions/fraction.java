package Exceptions;



public class fraction {
	private int nom,den;
	
	public fraction(int nom,int den) throws ZeroDenominatorException{
		this.nom = nom;
		if(den<=0) {
			ZeroDenominatorException e = new ZeroDenominatorException();
			 throw e;
		}
		this.den = den;
		simplify();
	}
	
	public int getnom() {
		return nom;
	}
	public void setnom(int nom) {
		this.nom = nom;
		simplify();
	}
	public int getden() {
		return den;
	}
	public void setden(int den) throws ZeroDenominatorException{
		if(den<=0) {
			ZeroDenominatorException z = new ZeroDenominatorException();
			 throw z;
		}
		this.den = den;
		simplify();
	}
	
	public void simplify() {
		int gtc = 1;
		int smaller = Math.min(nom, den);
		for(int i=2;i<=smaller;i++){
			if(nom%i==0 && den%i==0) {
				gtc = i;
			}
		}
		nom = nom/gtc;
		den = den/gtc;
	}

	public void add(fraction f2) {
		this.nom = this.nom * f2.den + f2.nom*this.den;
		this.den = this.den * f2.den;
		simplify();
	}

	public static fraction add(fraction f1,fraction f2) throws ZeroDenominatorException{
		int newNom = f1.nom*f2.den + f2.nom*f1.den;
		int newDen = f1.den*f2.den;
		fraction f = new fraction(newNom,newDen);
		return f;
	}
	
	public void print() {
		if(den==1) {
			System.out.println(nom);
		}
		else {
			System.out.println(nom+"/"+den);
		}
	}
	
	public void mult(fraction f1){
		this.nom = this.nom*f1.nom;
		this.den = this.den*f1.den;
		simplify();
	}
}

