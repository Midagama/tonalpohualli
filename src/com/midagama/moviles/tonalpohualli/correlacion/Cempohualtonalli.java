package com.midagama.moviles.tonalpohualli.correlacion;


public class Cempohualtonalli {

	private String nombre;
	private String nombreEspaniol;
	private String fechaGregorianaInicio;
	private String fechaGregorianaTermino;
	private String significado;
	private int orden;
	
	public Cempohualtonalli(String nombre, String nombreEspaniol,
			String fechaGregorianaInicio, String fechaGregorianaTermino,
			String significado, int orden) {
		super();
		this.nombre = nombre;
		this.nombreEspaniol = nombreEspaniol;
		this.fechaGregorianaInicio = fechaGregorianaInicio;
		this.fechaGregorianaTermino = fechaGregorianaTermino;
		this.significado = significado;
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

	public String getFechaGregorianaInicio() {
		return fechaGregorianaInicio;
	}
	public void setFechaGregorianaInicio(String fechaGregorianaInicio) {
		this.fechaGregorianaInicio = fechaGregorianaInicio;
	}
	public String getFechaGregorianaTermino() {
		return fechaGregorianaTermino;
	}
	public void setFechaGregorianaTermino(String fechaGregorianaTermino) {
		this.fechaGregorianaTermino = fechaGregorianaTermino;
	}
	public String getSignificado() {
		return significado;
	}
	public void setSignificado(String significado) {
		this.significado = significado;
	}
	public int getOrden() {
		return orden;
	}
	public void setOrden(int orden) {
		this.orden = orden;
	}
	
	
}
