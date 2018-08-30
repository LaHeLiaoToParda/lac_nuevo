package services;

import data.BackOfficeDAO;
import data.IBackOfficeDAO;

public class BackOffice implements IBackOffice {
	private IBackOfficeDAO backOfficeDAO = new BackOfficeDAO();

	public void altaUsuario() {
		backOfficeDAO.altaUsuario();
	}

	public void altaCamiseta() {
		backOfficeDAO.altaCamiseta();
	}

	public void bajaCamiseta() {
		backOfficeDAO.bajaCamiseta();
	}
}
