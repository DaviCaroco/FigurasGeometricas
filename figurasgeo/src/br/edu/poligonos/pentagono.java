package br.edu.poligonos;

public class pentagono extends ClassePai {
	private double lado;
	private double apote;
	
	public pentagono() {
		
		lado = 0;
		apote = 0;
		
	}
	
	public double getLado() {
		return lado;
	}


	public void setLado(double lado) {
		this.lado = lado;
	}


	public double getApote() {
		return apote;
	}


	public void setApote(double apote) {
		this.apote = apote;
	}

	public void calcAreap() {
		area = 5*lado*apote;
		peri = lado*5;
	}
}
