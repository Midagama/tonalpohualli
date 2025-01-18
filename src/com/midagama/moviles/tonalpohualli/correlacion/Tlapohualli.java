package com.midagama.moviles.tonalpohualli.correlacion;

public class Tlapohualli {
	
	int numeral;
	String numNahuatl;
	String significado;
	String rumbo;
	String regente;
	
	
	
	public Tlapohualli(int numeral, String numNahuatl, String significado,
			String rumbo, String regente) {
		super();
		this.numeral = numeral;
		this.numNahuatl = numNahuatl;
		this.significado = significado;
		this.rumbo = rumbo;
		this.regente = regente;
	}
	
	
	public int getNumeral() {
		return numeral;
	}
	public void setNumeral(int numeral) {
		this.numeral = numeral;
	}
	public String getNumNahuatl() {
		return numNahuatl;
	}
	public void setNumNahuatl(String numNahuatl) {
		this.numNahuatl = numNahuatl;
	}
	public String getSignificado() {
		return significado;
	}
	public void setSignificado(String significado) {
		this.significado = significado;
	}
	public String getRumbo() {
		return rumbo;
	}
	public void setRumbo(String rumbo) {
		this.rumbo = rumbo;
	}
	public String getRegente() {
		return regente;
	}
	public void setRegente(String regente) {
		this.regente = regente;
	}
	
	
	

}
