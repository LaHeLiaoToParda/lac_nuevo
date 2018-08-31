package data;

import model.Camiseta;
import model.Usuario;

public interface IBackOfficeDAO {
	
	public void altaUsuario(Usuario u);
//	public void bajaUsuario(Usuario u); para 3er Sprint
	public void altaCamiseta(Camiseta c);
	public void bajaCamiseta(int id);
	public void modificarCamiseta();
	public Camiseta consultarCamiseta(int id);
}
