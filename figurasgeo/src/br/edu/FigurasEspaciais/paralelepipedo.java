package br.edu.FigurasEspaciais;

public class paralelepipedo extends ClassePaiE{

	public double ar1;
	public double ar2;
	public double ar3;

	
	public paralelepipedo() {
		
	}
	
	public double getAr1() {
		return ar1;
	}

	public void setAr1(double ar1) {
		this.ar1 = ar1;
	}

	public double getAr2() {
		return ar2;
	}

	public void setAr2(double ar2) {
		this.ar2 = ar2;
	}

	public double getAr3() {
		return ar3;
	}

	public void setAr3(double ar3) {
		this.ar3 = ar3;
	}

	public void calcAreaPa() {
		area = (2*ar1*ar2)+ (2*ar2*ar3)+ (2*ar1*ar3);
		volume = ar1 * ar2 * ar3;
	}
}
