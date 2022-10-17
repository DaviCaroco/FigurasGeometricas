package br.edu.poligonos;

public class losango {
	public double diag1;
	public double diag2;
	public double areaL;
	public double peri;
	public double lado;
	
	public losango() {
		diag1 = 0;
		diag2 = 0;
		areaL = 0;
		peri = 0;
	}
	
	public void calcAreaL() {
		areaL = (diag1 * diag2) /2;
		System.out.println("A area do Losangulo é " + areaL);
		peri = lado*4;
		System.out.println("O Perimetro do losangulo é " + peri);
	}
}
