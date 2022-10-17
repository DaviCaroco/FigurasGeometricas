package br.edu.poligonos;

public class esfera {
	public double areaEs;
	public double pi;
	public double volume;
	public double raio;
	
	public esfera() {
		pi = 3.14;
	}
	public void calcAreaEs() {
		areaEs = 4*pi * (raio * raio);
		System.out.println("A área total da Esfera é " + areaEs);
		volume = (4 * pi *(raio * raio * raio))/3;
		System.out.println("O volume do Esfera é " + volume);
	}
}
