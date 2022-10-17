package br.edu.poligonos;

public class pirâmide {
	public double areaTp;
	public double areaLa;
	public double areaBa;
	public double altura;
	public double volume;
	
	public pirâmide() {
		
	}
	public void calcAreaTp() {
		areaTp = areaLa + areaBa;
		System.out.println("A área total da pirâmide é " + areaTp);
		volume = (areaBa*altura) /3;
		System.out.println("O volume da pirâmide é " + volume);
	}
}
