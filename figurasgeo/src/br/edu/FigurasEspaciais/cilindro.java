package br.edu.FigurasEspaciais;

public class cilindro {
	public double areaCi;
	public double areaBa;
	public double volume;
	public double pi;
	public double raio;
	public double altura;
	
	public cilindro() {
		pi = 3.14;
	}
	public void calcAreaCi() {
		areaCi = 2*pi*raio * (altura + raio);
		System.out.println("A �rea total do Cilindro � " + areaCi);
		areaBa = pi * (raio *raio);
		volume = areaBa * altura;
		System.out.println("O volume do Cilindro � " + volume);
	}
}
