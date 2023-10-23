package modelo;

import java.io.Serializable;

public class Alumno implements Serializable {
	
	private int id;
	private int nivel;
	private String apellido;
	private String nombre;

	public Alumno() {
		super();
	}

	public Alumno(int nivel, String apellido, String nombre) {
		super();
		this.nivel = nivel;
		this.apellido = apellido;
		this.nombre = nombre;
	}

	public int getNivel() {
		return nivel;
	}

	public void setNivel(int nivel) {
		this.nivel = nivel;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Alumno [nivel=" + nivel + ", apellido=" + apellido + ", nombre=" + nombre + "]";
	}

}
