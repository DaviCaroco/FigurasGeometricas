package br.edu.FigurasEspaciais;

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
		System.out.println("A ?rea total do cubo ? " + areaTc);
		volume = aresta * aresta * aresta;
		System.out.println("O volume do cubo ? " + volume);
	}
}
