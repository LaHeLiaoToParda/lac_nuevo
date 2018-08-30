package model;


import model.Categoria;
import model.Color;
import model.Genero;
import model.Talla;
import services.ICamisetaService;
import utilities.Pantalla;


public  class Camiseta {
	private  int id;
	private  Color color;
	private  float precio;
	private  Genero genero;
	private Talla talla;
	private Categoria categoria;
	private int stock;
	private String url;
	
	
	//constructores/////////////////////////////////////////////
	public Camiseta() {
		super();
	}
	//Camiseta cam1 = new Camiseta(1,Categoria.Manga_corta,15, Talla.L, Genero.HOMBRE, Color.AZUL, "/imagenes1.jpg");
	public Camiseta(int id, Categoria categoria, float precio, Talla talla, Genero genero, Color color,String url, int stock){
		super();
		this.id = id;
		this.color = color;
		this.precio = precio;
		this.genero = genero;
		this.talla = talla;
		this.categoria = categoria;
		this.stock = stock;
		this.url = url;
	}

	
	//getters y setters/////////////////////////////////////////
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Color getColor() {
		return color;
	}
	public void setColor(Color color) {
		this.color = color;
	}
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	public Genero getGenero() {
		return genero;
	}
	public void setGenero(Genero genero) {
		this.genero = genero;
	}
	public Talla getTalla() {
		return talla;
	}
	public void setTalla(Talla talla) {
		this.talla = talla;
	}
	public Categoria getCategoria() {
		return categoria;
	}
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	
	
	//metodos///////////////////////////////////////////////////
	public void mostrarDatos() {
		Pantalla.write(getId());
		Pantalla.write(getColor());
		Pantalla.write(getPrecio());
		Pantalla.write(getGenero());
		Pantalla.write(getTalla());
		Pantalla.write(getCategoria());
		Pantalla.write(getStock());
		Pantalla.write(getUrl());
	}

}
