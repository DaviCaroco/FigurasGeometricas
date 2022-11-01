package br.edu.poligonos;

public class circulo {
	public double raio;
	public double pi;
	public double areac;
	public double peri;
	
	public circulo() {
		raio = 0;
		pi = 3.14;
		areac = 0;
	}
	
	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	public double getAreac() {
		return areac;
	}

	public double getPeri() {
		return peri;
	}

	public void calcAreac() {
		areac = pi * (raio * raio);
	}
	public void calcPeri() {
		peri = 2 * raio * pi;
	}
}
