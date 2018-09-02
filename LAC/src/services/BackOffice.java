package services;

import java.util.List;

import data.BackOfficeDAO;
import data.IBackOfficeDAO;
import model.Camiseta;
import model.Usuario;

public class BackOffice implements IBackOffice {
	private IBackOfficeDAO backOfficeDAO = new BackOfficeDAO();

	public void altaUsuario(Usuario u) {
		backOfficeDAO.altaUsuario(u);
	}
	
//	funcion para ajustesCuentaUsuario.jsp o un menu de admin, para el 3er Sprint
//	public void bajaUsuario(Usuario u) {
//		backOfficeDAO.bajaUsuario(u);
//	}

	public void altaCamiseta(Camiseta c) {
		backOfficeDAO.altaCamiseta(c);
	}
	
	public void bajaCamiseta(int id){
		backOfficeDAO.bajaCamiseta(id);
	}
	public void modificarCamiseta(int id, String color, float precio, String genero, String talla, String categoria, int stock, String imagen, String descripcion){
		backOfficeDAO.modificarCamiseta(id, color, precio, genero, talla, categoria, stock, imagen, descripcion);
	}
	public List<Camiseta> consultarCamiseta(int id){
		return backOfficeDAO.consultarCamiseta(id);
	}
}
