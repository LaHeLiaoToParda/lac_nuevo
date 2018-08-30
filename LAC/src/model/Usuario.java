package model;

public class Usuario
{

	private String nombre;
	private String apellidos;
	private String contrasenia;
	private Rol rol;
	private String dni;
	
	public Usuario(String nombre, String apellidos, String contrasenia, Rol rol, String dni)
	{
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.contrasenia = contrasenia;
		this.rol = rol;
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

	public String getContrasenia() {
		return contrasenia;
	}

	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}

	public Rol getRol() {
		return rol;
	}

	public void setRol(Rol rol) {
		this.rol = rol;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public Usuario()
	{
		// TODO Auto-generated constructor stub
	}

}
