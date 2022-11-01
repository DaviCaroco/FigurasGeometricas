package br.edu.poligonos;

public class trapezio extends ClassePai{
	private double lado;
	private double baseM;
	private double basem;
	private double altura;
	
	public trapezio() {
		
		baseM = 0;
		basem = 0;

	}
	
	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	public double getBaseM() {
		return baseM;
	}

	public void setBaseM(double baseM) {
		this.baseM = baseM;
	}

	public double getBasem() {
		return basem;
	}

	public void setBasem(double basem) {
		this.basem = basem;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public void calcAreaT() {
		area = (basem + baseM) * altura;
		peri = lado*4;
	}
}
