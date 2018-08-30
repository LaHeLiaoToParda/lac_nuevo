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
	
	public void bajaUsuario(Usuario u) {
		backOfficeDAO.bajaUsuario(u);
	}

	public void altaCamiseta(Camiseta c) {
		backOfficeDAO.altaCamiseta(c);
	}

	public void bajaCamiseta(Camiseta c) {
		backOfficeDAO.bajaCamiseta(c);
	}
}
