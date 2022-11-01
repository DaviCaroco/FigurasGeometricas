package br.edu.poligonos;
import java.util.Scanner;

public class esfera {
	private double areaEs;
	private double pi;
	private double volume;
	private double raio;
	Scanner sc = new Scanner(System.in);
	
	public esfera() {
	}
	public void recebeRaio(double pRaio) {
	    raio = pRaio;
	}
	public void recebePi(double Ppi) {
		Ppi = pi;
	}
	public void calcAreaEs() {
		areaEs = 4*pi * (raio * raio);
	}
	public void calcVolumeEs() {
		volume = (4 * pi *(raio * raio * raio))/3;
	}
	public double mostraAreaEs() {
		return areaEs;
	}
	public double mostraVoluES() {
		return volume;
	}
}
