package br.edu.poligonos;

public class quadrado {
	public double lado;
	public double areaq;
	public double peri;
	
	public quadrado() {
		
		lado = 0;
		areaq = 0;
		
	}
	public void calcAreaq() {
		areaq = lado * lado;
	}
	public double getLado() {
		return lado;
	}
	public void setLado(double lado) {
		this.lado = lado;
	}
	public double getAreaq() {
		return areaq;
	}
	public void calcPeri() {
		peri = lado*4;
	}
	public double getPeri() {
		return peri;
	}
	
}
