package model;

import utilities.Pantalla;
/**
 * 
 * @author Ruben Martin
 *
 */

/**
 * Clase Usuario con todos sus atributos necesarios segun la base de datos
 */
public class Usuario {
	/**
	 * id es un entero que se genera automaticamente al añadir un nuevo usuario a la bbdd. Representa la PK de la tabla usuarios.
	 */
	private int id;
	/**
	 * nick es un String unico de cada usuario, con el que se logearan en la web, representa el nick en la bbdd.
	 */
	private String nick;
	/**
	 * nombre es un String que representa el nombre real del usuario en la bbdd.
	 */
	private String nombre;
	/**
	 * apellidos es un String que representa el apellido/s de un usuario, representa el campo apellidos en la bbdd
	 */
	private String apellidos;
	/**
	 * rol es un enumerado (user,admin) que representa el rol de un usuario en la web. Los usuarios con rol admin podran modificar/añadir/eliminar/consultar productos. Los usuarios con rol user podran navegar en la web como clientes.
	 */
	private Rol rol;
	/**
	 * contrasena es un String con el que un usuario se registra y logea en la web. Representa el campo contrasena en la bbdd
	 */
	private String contrasena;
	/**
	 * direccion es un String que representa la residencia de un usuario. Representa el campo direccion en la bbdd
	 */
	private String direccion;

	
	//constructores////////////////////////////////////////////
	/**
	 * constructor para crear un objeto de la clase usuario sin datos
	 */
	public Usuario() {
		
	}
	/**
	 * metodo para crear un usuario con unos parametros especificos
	 * @param id - Establece el id de un usuario
	 * @param nick - Establece el nick de un usuario en un String
	 * @param nombre - Establece el nombre dle usuario en un string
	 * @param apellidos - Establece el/los apellidos de un usuario con un string
	 * @param rol - Establece el rol del usuario en un enumerado
	 * @param contrasena - Estable la contraseña del usuario en un string
	 * @param direccion - Estable la direccion de un usuario en un string
	 */
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
	/**
	 * 
	 * @return devuelve el valor entero del id del usuario
	 */
	public int getId() {
		return id;
	}
	/**
	 * 
	 * @param id establece el valor entero del id del usuario
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * 
	 * @return devuelve el nick del usuario
	 */
	public String getNick() {
		return nick;
	}
	/**
	 * 
	 * @param nick establece el valor del nick del usuario
	 */
	public void setNick(String nick) {
		this.nick = nick;
	}
	/**
	 * 
	 * @return devuelve el valor del nombre del usuario
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * 
	 * @param nombre establece el valor del nombre del usuario
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * 
	 * @return devuelve el/los apellido/s del usuario
	 */
	public String getApellidos() {
		return apellidos;
	}
	/**
	 * 
	 * @param apellidos establece el valor de el/los apellido/s del usuario
	 */
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	/**
	 * 
	 * @return devuelve el rol del usuario
	 */
	public Rol getRol() {
		return rol;
	}
	/**
	 * 
	 * @param rol establece el rol del usuario
	 */
	public void setRol(Rol rol) {
		this.rol = rol;
	}
	/**
	 * 
	 * @return devuelve la contrasena del usuario
	 */
	public String getContrasena() {
		return contrasena;
	}
	/**
	 * 
	 * @param contrasena establece el valor de la contrasena del usuario
	 */
	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}
	/**
	 * 
	 * @return devuelve la direccion del usuario
	 */
	public String getDireccion() {
		return direccion;
	}
	/**
	 * 
	 * @param direccion establece la direccion del usuario
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	//metodos///////////////////////////////////////////////////
	/**
	 * Metodo que muestra en consola el valor de los atributos del usuario
	 */
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
