package control;

public class Persona implements Comparable<Persona>{
private String nombre;
private String apellido;
private int edad;
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public String getApellido() {
	return apellido;
}
public void setApellido(String apellido) {
	this.apellido = apellido;
}
public int getEdad() {
	return edad;
}
public void setEdad(int edad) {
	this.edad = edad;
}
@Override
public String toString() {
	return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + "]";
}
public Persona(String nombre, String apellido, int edad) {
	super();
	this.nombre = nombre;
	this.apellido = apellido;
	this.edad = edad;
}
@Override
public int compareTo(Persona pers) {
	// TODO Auto-generated method stub
	return this.getApellido().compareTo(pers.getApellido());
}
}

