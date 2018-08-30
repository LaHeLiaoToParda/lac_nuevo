package services;

import model.Camiseta;
import model.Usuario;

public interface IBackOffice {
	
	public void altaUsuario(Usuario u);
	public void bajaUsuario(Usuario u);
	//public void editUserRol(Usuario u); funcion para que un admin cambie el rol de otro usuario ya registrado a administrador (para 3er Sprint)
	public void altaCamiseta(Camiseta c);
	public void bajaCamiseta(Camiseta c);
}
