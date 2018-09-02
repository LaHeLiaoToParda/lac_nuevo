package control;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import data.BackOfficeDAO;
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
		Camiseta cam1 = new Camiseta(0,Categoria.MANGA_CORTA,15, Talla.L, Genero.HOMBRE, Color.AZUL, "/imagenes1.jpg",4,"descripcion");
		Camiseta cam2 = new Camiseta(0,Categoria.MANGA_LARGA,20, Talla.M, Genero.HOMBRE, Color.VERDE, "/imagenes2.jpg",5,"descripcion");
		Camiseta cam3 = new Camiseta(0,Categoria.TIRANTES,12, Talla.S, Genero.MUJER, Color.ROJO, "/imagenes3.jpg",7,"descripcion");
		Camiseta cam4 = new Camiseta(0,Categoria.MANGA_CORTA,15, Talla.L, Genero.HOMBRE, Color.AZUL, "/imagenes4.jpg",3,"descripcion");
		Camiseta cam5 = new Camiseta(0,Categoria.MANGA_CORTA,15, Talla.M, Genero.MUJER, Color.AZUL, "/imagenes5.jpg",7,"descripcion");
		Camiseta cam6 = new Camiseta(0,Categoria.TIRANTES,12, Talla.XL, Genero.HOMBRE, Color.ROJO, "/imagenes6.jpg",3,"descripcion");
		Camiseta cam7 = new Camiseta(0,Categoria.MANGA_LARGA,12, Talla.XL, Genero.HOMBRE, Color.ROJO, "/imagenes7.jpg",6,"descripcion");
		Camiseta cam8 = new Camiseta(0,Categoria.MANGA_LARGA,40, Talla.XL, Genero.HOMBRE, Color.ROJO, "/imagenes8.jpg",33,"descripcion");
		Camiseta cam9 = new Camiseta(0,Categoria.MANGA_LARGA,40, Talla.XL, Genero.HOMBRE, Color.ROJO, "/imagenes8.jpg",33,"descripcion");
		//metodo Alta() no implementado, ya que deberia de ser una ventana en el navegador web con un formulario para introducir los datos
//		new CamisetaDAO().Alta(cam8);
//		new CamisetaDAO().Alta(cam2);
//		new CamisetaDAO().Alta(cam3);
//		new CamisetaDAO().Alta(cam4);
//		new CamisetaDAO().Alta(cam5);
//		new CamisetaDAO().Alta(cam6);
//		new CamisetaDAO().Alta(cam7);
		
		
	}
	public static void prueba2(){
		
		List<Camiseta> cam = new ArrayList<Camiseta>();
		cam = new BackOfficeDAO().consultarCamiseta(16);
		for(Camiseta e : cam){
			System.out.println(e.toString());
		}
		
	}
	
	public static void p3() throws SQLException {
		String user = "pepe";
		boolean cam;
		cam = new BackOfficeDAO().comprobarUsuario(user);
		
		if(cam) {
			System.out.println("Usuario "+user+" ya existe");
		} else {
			System.out.println("Usuario "+user+" no existe");
			
		}
	}
	
}
