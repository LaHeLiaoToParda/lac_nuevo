package services;

import model.Camiseta;
import model.Usuario;

public interface IBackOffice {
	
	public void altaUsuario(Usuario u);
	public void altaCamiseta(Camiseta c);
	public void bajaCamiseta(Camiseta c);
}
