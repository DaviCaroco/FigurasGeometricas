package br.edu.poligonos;

public class pentagono {
	public double lado;
	public double apote;
	public double areaP;
	public double peri;
	
	public pentagono() {
		lado = 0;
		apote = 0;
		areaP = 0;
		peri = 0;
	}
	public void calcAreap() {
		areaP = 5*lado*apote;
		System.out.println("A area do Pentagono é " + areaP);
		peri = lado*5;
		System.out.println("O Perimetro do pentagono é " + peri);
	}
}
