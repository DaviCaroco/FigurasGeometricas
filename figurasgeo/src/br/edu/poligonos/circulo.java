package br.edu.poligonos;

public class circulo extends ClassePai {
	private double raio;
	private double pi;
	
	public circulo() {
		raio = 0;
		pi = 3.14;
	}
	
	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	public void calcAreac() {
		area = pi * (raio * raio);
	}
	public void calcPeri() {
		peri = 2 * raio * pi;
	}
}
