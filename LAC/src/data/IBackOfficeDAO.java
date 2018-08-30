package data;

import model.Camiseta;
import model.Usuario;

public interface IBackOfficeDAO {
	
	public void altaUsuario(Usuario u);
	public void altaCamiseta(Camiseta c);
	public void bajaCamiseta(Camiseta c);
}
