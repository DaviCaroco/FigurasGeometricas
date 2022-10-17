package br.edu.poligonos;

public class hexagono {
	public double base;
	public double altura;
	public double areaT;
	public double areaHex;
	public double peri;
	public double lado;
	
	public hexagono() {
		
		base = 0;
		altura = 0;
	}
	public void calcAreahex() {
		areaT = (base *altura) /2;
		areaHex = areaT * 6;
		System.out.println("A área do Hexagono é " + areaHex);
		peri = lado*6;
		System.out.println("O Perimetro do Hexagono é " + peri);
	}
}
