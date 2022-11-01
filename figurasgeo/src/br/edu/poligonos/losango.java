package br.edu.poligonos;

public class losango extends ClassePai {
	private double diag1;
	private double diag2;
	private double lado;
	
	public losango() {
		diag1 = 0;
		diag2 = 0;
	}
	
	
	public double getDiag1() {
		return diag1;
	}


	public void setDiag1(double diag1) {
		this.diag1 = diag1;
	}


	public double getDiag2() {
		return diag2;
	}


	public void setDiag2(double diag2) {
		this.diag2 = diag2;
	}


	public double getLado() {
		return lado;
	}


	public void setLado(double lado) {
		this.lado = lado;
	}

	public void calcAreaL() {
		area = (diag1 * diag2) /2;
		peri = lado*4;
	}
}
