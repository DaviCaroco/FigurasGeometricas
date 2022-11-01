package br.edu.poligonos;

public class hexagono extends ClassePai{
	private double base;
	private double altura;
	private double areap;
	private double lado;
	
	public hexagono() {
		
		base = 0;
		altura = 0;
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


	public double getLado() {
		return lado;
	}


	public void setLado(double lado) {
		this.lado = lado;
	}


	public void calcAreahex() {
		areap = (base *altura) /2;
		area = areap * 6;
		peri = lado*6;
	}
	
}
