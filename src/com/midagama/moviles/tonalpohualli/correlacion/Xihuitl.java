package com.midagama.moviles.tonalpohualli.correlacion;

public class Xihuitl {
	
	private String nombre;
	private String nombreEspaniol;
	private String significado;
	private String rumbo;
	private int orden;
	
	

	public Xihuitl(String nombre, String nombreEspaniol, String significado,
			String rumbo, int orden) {
		super();
		this.nombre = nombre;
		this.nombreEspaniol = nombreEspaniol;
		this.significado = significado;
		this.rumbo = rumbo;
		this.orden = orden;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombreEspaniol() {
		return nombreEspaniol;
	}
	public void setNombreEspaniol(String nombreEspaniol) {
		this.nombreEspaniol = nombreEspaniol;
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
	public int getOrden() {
		return orden;
	}
	public void setOrden(int orden) {
		this.orden = orden;
	}
	
	
		
		

}
