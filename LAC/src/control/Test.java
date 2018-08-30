package control;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import data.CamisetaDAO;
import data.ConexionDB;
import model.Camiseta;
import model.Categoria;
import model.Color;
import model.Genero;
import model.Talla;

public class Test {

	public Test() {
		
	}
	
	public  void prueba1() {
		Camiseta cam1 = new Camiseta(1,Categoria.MANGA_CORTA,15, Talla.L, Genero.HOMBRE, Color.AZUL, "/imagenes1.jpg",4);
		Camiseta cam2 = new Camiseta(2,Categoria.MANGA_LARGA,20, Talla.M, Genero.HOMBRE, Color.VERDE, "/imagenes2.jpg",5);
		Camiseta cam3 = new Camiseta(3,Categoria.TIRANTES,12, Talla.S, Genero.MUJER, Color.ROJO, "/imagenes3.jpg",7);
		Camiseta cam4 = new Camiseta(4,Categoria.MANGA_CORTA,15, Talla.L, Genero.HOMBRE, Color.AZUL, "/imagenes4.jpg",3);
		Camiseta cam5 = new Camiseta(5,Categoria.MANGA_CORTA,15, Talla.M, Genero.MUJER, Color.AZUL, "/imagenes5.jpg",7);
		Camiseta cam6 = new Camiseta(6,Categoria.TIRANTES,12, Talla.XL, Genero.HOMBRE, Color.ROJO, "/imagenes6.jpg",3);
		Camiseta cam7 = new Camiseta(7,Categoria.MANGA_LARGA,12, Talla.XL, Genero.HOMBRE, Color.ROJO, "/imagenes7.jpg",6);
		Camiseta cam8 = new Camiseta(8,Categoria.MANGA_LARGA,40, Talla.XL, Genero.HOMBRE, Color.ROJO, "/imagenes8.jpg",33);
		Camiseta cam9 = new Camiseta(33,Categoria.MANGA_LARGA,40, Talla.XL, Genero.HOMBRE, Color.ROJO, "/imagenes8.jpg",33);
		//metodo Alta() no implementado, ya que deberia de ser una ventana en el navegador web con un formulario para introducir los datos
		new CamisetaDAO().Alta(cam8);
//		new CamisetaDAO().Alta(cam2);
//		new CamisetaDAO().Alta(cam3);
//		new CamisetaDAO().Alta(cam4);
//		new CamisetaDAO().Alta(cam5);
//		new CamisetaDAO().Alta(cam6);
//		new CamisetaDAO().Alta(cam7);
		
		
	}
	
}
