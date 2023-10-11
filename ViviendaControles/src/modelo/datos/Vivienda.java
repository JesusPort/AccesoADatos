package modelo.datos;

public class Vivienda {
	
	private String tipoCalle;
	private String nombre;
	private int numero;
	private String descripcion;
	
	
	public String getTipoCalle() {
		return tipoCalle;
	}
	public void setTipoCalle(String tipoCalle) {
		this.tipoCalle = tipoCalle;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	@Override
	public String toString() {
		return "Vivienda [tipoCalle=" + tipoCalle + ", nombre=" + nombre + ", numero=" + numero + ", descripcion="
				+ descripcion + "]";
	}
	public Vivienda(String tipoCalle, String nombre, int numero, String descripcion) {
		super();
		this.tipoCalle = tipoCalle;
		this.nombre = nombre;
		this.numero = numero;
		this.descripcion = descripcion;
	}
}
