package br.edu.FigurasEspaciais;

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
		System.out.println("A �rea total do cone � " + areaCo);
		volume = (pi * (raio*raio)*altura) /3;
		System.out.println("O volume do cone � " + volume);
	}
}
