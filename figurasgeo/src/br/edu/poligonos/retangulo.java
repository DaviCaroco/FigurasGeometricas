package br.edu.poligonos;

public class retangulo {
	public double base;
	public double altura;
	public double arear;
	public double peri;
	
	public retangulo() {
		
		base = 0;
		altura = 0;
		arear = 0;
	}
	
	public void calcArear() {
		arear = base * altura;
		System.out.println("A área do Retangulo ou do Paralelograma é " + arear);
		peri = 2 * (base + altura);
		System.out.println("O perimetro do Retangulo ou do Paralelograma é " + peri);
	}
}
