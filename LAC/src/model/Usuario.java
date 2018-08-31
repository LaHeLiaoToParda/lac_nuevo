package model;

import utilities.Pantalla;

public class Usuario {
	
	private int id;
	private String nick;
	private String nombre;
	private String apellidos;
	private Rol rol;
	private String contrasena;
	private String direccion;
	
	//constructores////////////////////////////////////////////
	public Usuario() {
		
	}
	public Usuario(int id,String nick, String nombre, String apellidos, Rol rol, String contrasena, String direccion) {
		super();
		this.id= id;
		this.nick = nick;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.rol = rol;
		this.contrasena = contrasena;
		this.direccion = direccion;
	}

	
	//getters y setters////////////////////////////////////////
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNick() {
		return nick;
	}
	public void setNick(String nick) {
		this.nick = nick;
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
		Pantalla.write(getId());
		Pantalla.write(getNick());
		Pantalla.write(getNombre());
		Pantalla.write(getApellidos());
		Pantalla.write(getRol());
		Pantalla.write(getContrasena());
		Pantalla.write(getDireccion());
	}

}
