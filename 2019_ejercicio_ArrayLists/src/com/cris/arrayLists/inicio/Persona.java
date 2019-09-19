package com.cris.arrayLists.inicio;

public class Persona {

	private String nombre;
	private String apellidos;
	private int telefono;
	private String ciudad;
	private int edad;
	private int peso;
	
	public Persona(String nombre, String apellidos, int telefono, String ciudad, int edad, int peso) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.telefono = telefono;
		this.ciudad = ciudad;
		this.edad = edad;
		this.peso = peso;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public int getTelefono() {
		return telefono;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellidos=" + apellidos + ", telefono=" + telefono + ", ciudad="
				+ ciudad + ", edad=" + edad + ", peso=" + peso + "]";
	}

}
