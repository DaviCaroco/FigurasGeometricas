package br.edu.poligonos;

public class trapézio {
	public double lado;
	public double baseM;
	public double basem;
	public double areaT;
	public double altura;
	public double peri;
	
	public void trapezio() {
		baseM = 0;
		basem = 0;
		areaT = 0;
		peri = 0;
	}
	public void calcAreaT() {
		areaT = (basem + baseM) * altura;
		System.out.println("A area do trapézio é " + areaT);
		peri = lado*4;
		System.out.println("O Perimetro do trapézio é " + peri);
	}
}
