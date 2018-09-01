package services;

import java.util.List;

import model.Camiseta;
import model.Usuario;

public interface IBackOffice {
	
	public void altaUsuario(Usuario u);
//	public void bajaUsuario(Usuario u); funcion para ajustesCuentaUsuario.jsp o un menu de admin, para el 3er Sprint
//	public void editUserRol(Usuario u); funcion para que un admin cambie el rol de otro usuario ya registrado a administrador (para 3er Sprint)
	public void altaCamiseta(Camiseta c);
	public void bajaCamiseta(int id);
	public void modificarCamiseta();
	public List<Camiseta> consultarCamiseta(int id);
}
