package br.edu.poligonos;

public class piramide {
	public double areaTp;
	public double areaLa;
	public double areaBa;
	public double altura;
	public double volume;
	
	public piramide() {
		
	}
	public void calcAreaTp() {
		areaTp = areaLa + areaBa;
		System.out.println("A �rea total da pir�mide � " + areaTp);
		volume = (areaBa*altura) /3;
		System.out.println("O volume da pir�mide � " + volume);
	}
}
