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
	}
	public void calcPeri() {
		peri = 2 * (base + altura);
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getArear() {
		return arear;
	}

	public double getPeri() {
		return peri;
	}
	
}
