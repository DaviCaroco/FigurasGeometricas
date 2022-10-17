package br.edu.poligonos;

public class Cilindro {
	public double areaCi;
	public double areaBa;
	public double volume;
	public double pi;
	public double raio;
	public double altura;
	
	public Cilindro() {
		pi = 3.14;
	}
	public void calcAreaCi() {
		areaCi = 2*pi*raio * (altura + raio);
		System.out.println("A área total do Cilindro é " + areaCi);
		areaBa = pi * (raio *raio);
		volume = areaBa * altura;
		System.out.println("O volume do Cilindro é " + volume);
	}
}
