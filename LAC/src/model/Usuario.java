package model;

import utilities.Pantalla;

public class Usuario {

	private String dni;
	private String nombre;
	private String apellidos;
	private Rol rol;
	private String contrasena;
	private String direccion;
	
	//constructores////////////////////////////////////////////
	public Usuario() {
		
	}
	public Usuario(String dni, String nombre, String apellidos, Rol rol, String contrasena, String direccion) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.rol = rol;
		this.contrasena = contrasena;
		this.direccion = direccion;
	}

	
	//getters y setters////////////////////////////////////////
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public Rol getRol() {
		return rol;
	}
	public void setRol(Rol rol) {
		this.rol = rol;
	}
	public String getContrasena() {
		return contrasena;
	}
	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	//metodos///////////////////////////////////////////////////
	public void mostrarDatos() {
		Pantalla.write(getDni());
		Pantalla.write(getNombre());
		Pantalla.write(getApellidos());
		Pantalla.write(getRol());
		Pantalla.write(getContrasena());
		Pantalla.write(getDireccion());
	}

}
