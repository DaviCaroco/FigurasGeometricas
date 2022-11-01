package br.edu.poligonos;

public class quadrado extends ClassePai{
	private double lado;
		
	public quadrado() {
		
		lado = 0;
		
	}
	public void calcAreaq() {
		area = lado * lado;
	}
	public double getLado() {
		return lado;
	}
	public void setLado(double lado) {
		this.lado = lado;
	}
	
	public void calcPeri() {
		peri = lado*4;
	}

}
