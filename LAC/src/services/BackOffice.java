package services;

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
	
// 3er Sprint
//	public void bajaCamiseta(Camiseta c) {
//		backOfficeDAO.bajaCamiseta(c);
//	}
}
