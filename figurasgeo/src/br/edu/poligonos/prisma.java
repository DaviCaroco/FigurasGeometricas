package br.edu.poligonos;

public class prisma {
	public double areaTpr;
	public double areaBa;
	public double SomaArea;
	public double volume;
	public double altura;
	
	public prisma() {

	}
	public void calcAreaTc() {
		areaTpr = 2*areaBa + SomaArea;
		System.out.println("A área total do prisma é " + areaTpr);
		volume = areaBa * altura;
		System.out.println("O volume do prisma é " + volume);
	}
}
