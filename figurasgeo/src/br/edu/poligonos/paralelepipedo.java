package br.edu.poligonos;

public class paralelepipedo {
	public double areaPa;
	public double ar1;
	public double ar2;
	public double ar3;
	public double volume;
	
	public paralelepipedo() {
		
	}
	public void calcAreaPa() {
		areaPa = (2*ar1*ar2)+ (2*ar2*ar3)+ (2*ar1*ar3);
		System.out.println("A área total do paralelepipedo é " + areaPa);
		volume = ar1 * ar2 * ar3;
		System.out.println("O volume do paralelepipedo é " + volume);
	}
}
