package Ejercicio1;

public class Persona {
 private String nombre;
 private String apellido;
 private String dniPersona;
 
 
 public Persona () {
	 this.nombre = "Desconocido";
	 this.apellido = "Desconocido";
	 this.dniPersona = "Nulo";
 }
public Persona(String nombre, String apellido, String dniPersona) {
	this.nombre = nombre;
	this.apellido = apellido;
	this.dniPersona = dniPersona;
}
@Override
public String toString() {
	return "Peronsa [nombre=" + nombre + ", apellido=" + apellido + ", dniPersona=" + dniPersona + "]";
}
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
public String getDniPersona() {
	return dniPersona;
}
public void setDniPersona(String dniPersona) {
	this.dniPersona = dniPersona;
}
 
}
