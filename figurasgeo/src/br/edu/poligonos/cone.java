package br.edu.poligonos;

public class cone {
	public double areaCo;
	public double pi;
	public double raio;
	public double geratriz;
	public double volume;
	public double altura;
	
	public cone() {
		pi = 3.14;
		
	}
	public void calcAreaCo() {
		areaCo = pi * raio *(raio + geratriz);
		System.out.println("A área total do cone é " + areaCo);
		volume = (pi * (raio*raio)*altura) /3;
		System.out.println("O volume do cone é " + volume);
	}
}
