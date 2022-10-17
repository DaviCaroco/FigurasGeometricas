package br.edu.poligonos;

public class cubo {
	public double areaTc;
	public double aresta;
	public double volume;
	
	public cubo() {
		
		areaTc = 0;
		aresta = 0;
	}
	public void calcAreaTc() {
		areaTc = 6*(aresta * aresta);
		System.out.println("A área total do cubo é " + areaTc);
		volume = aresta * aresta * aresta;
		System.out.println("O volume do cubo é " + volume);
	}
}
