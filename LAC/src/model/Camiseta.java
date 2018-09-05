package model;

import model.Categoria;
import model.Color;
import model.Genero;
import model.Talla;
import services.ICamisetaService;
import utilities.Pantalla;

/**
 * Esta clase define el objeto Camiseta.
 * @author admin
 *
 */
public  class Camiseta {
	private  int id;
	private  Color color;
	private  float precio;
	private  Genero genero;
	private Talla talla;
	private Categoria categoria;
	private int stock;
	private String url;
	private String descripcion;
	
	
/**
 * Constructor vacio.
 */
	public Camiseta() {
		super();
	}
/**
 * COnstructor con todos los  atributos del objeto camiseta.
 * @param id El parámetro id define el orden de cración de las camisetas.
 * @param categoria El parámetro categoría es un enumerado que define los tipos de camisetas.
 * @param precio El parámetro precio define el valor de las camisetas en euros.
 * @param talla El parámetro talla define es un enumerado para definir el tamaño de las camisetas.
 * @param genero El parámetro genero es un enumero, diferencia entre productos de hombre y de mujer. 
 * @param color El parámetro color es un enumero donde se almacenan los posibles colores de las camisetas.
 * @param url El parámetro url es donde se almacena la dirección de la foto de las camisetas.
 * @param stock El parámetro stock 
 * @param descripcion En el parámetrod escripción se va a almacenar un texto en el que se indican ciertas características del producto.
 */
	public Camiseta(int id, Categoria categoria, float precio, Talla talla, Genero genero, Color color,String url, int stock, String descripcion){
		super();
		this.id = id;
		this.color = color;
		this.precio = precio;
		this.genero = genero;
		this.talla = talla;
		this.categoria = categoria;
		this.stock = stock;
		this.url = url;
		this.descripcion = descripcion;
	}

	
	/**
	 * Método que devulve el id de las camiseta.
	 * @return
	 */
	public int getId() {
		return id;
	}
	/**
	 * Método que define el id de una camiseta.
	 * @param id
	 */
	public void setId(int id) {
		this.id = id;
	}
	/*
	 * Método que devulve el color de una camiseta.
	 */
	public Color getColor() {
		return color;
	}
	/**
	 * Método que define el color de una camiseta.
	 * @param color
	 */
	public void setColor(Color color) {
		this.color = color;
	}
	/**
	 * Método que devulve el precio de la camiseta.
	 * @return
	 */
	public float getPrecio() {
		return precio;
	}
	/**
	 * Método que define el precio de una camiseta.
	 * @param id
	 */
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	/**
	 * Método que devulve el género de la camiseta.
	 * @return
	 */
	public Genero getGenero() {
		return genero;
	}
	/**
	 * Método que define el género de una camiseta.
	 * @param id
	 */
	public void setGenero(Genero genero) {
		this.genero = genero;
	}
	/**
	 * Método que devulve la talla de la camiseta.
	 * @return
	 */
	public Talla getTalla() {
		return talla;
	}
	/**
	 * Método que define el talla de una camiseta.
	 * @param id
	 */
	public void setTalla(Talla talla) {
		this.talla = talla;
	}
	/**
	 * Método que devulve la categoría de la camiseta.
	 * @return
	 */
	public Categoria getCategoria() {
		return categoria;
	}
	/**
	 * Método que define la categoría de una camiseta.
	 * @param id
	 */
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	/**
	 * Método que devulve el stock de las camiseta.
	 * @return
	 */
	public int getStock() {
		return stock;
	}
	/**
	 * Método que define el stock de una camiseta.
	 * @param id
	 */
	public void setStock(int stock) {
		this.stock = stock;
	}
	/**
	 * Método que devulve la url de la camiseta.
	 * @return
	 */
	public String getUrl() {
		return url;
	}
	/**
	 * Método que define la url de una camiseta.
	 * @param id
	 */
	public void setUrl(String url) {
		this.url = url;
	}
	/**
	 * Método que devulve la descripción de la camiseta.
	 * @return
	 */
	public String getDescripcion() {
		return descripcion;
	}
	/**
	 * Método que define la descripción de una camiseta.
	 * @param id
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	/**
	 * Sobreescribe el método toString para adapatarlo.
	 */
	@Override
	public String toString() {
		return "Camiseta [id=" + id + ", color=" + color + ", precio=" + precio + ", genero=" + genero + ", talla="
				+ talla + ", categoria=" + categoria + ", stock=" + stock + ", url=" + url + ", descripcion="
				+ descripcion + "]";
	}
/**
 * Método para mostrar los datos de una camiseta por consola.
 */
	public void mostrarDatos() {
		Pantalla.write(getId());
		Pantalla.write(getColor());
		Pantalla.write(getPrecio());
		Pantalla.write(getGenero());
		Pantalla.write(getTalla());
		Pantalla.write(getCategoria());
		Pantalla.write(getStock());
		Pantalla.write(getUrl());
		Pantalla.write(getDescripcion());
	}

}
