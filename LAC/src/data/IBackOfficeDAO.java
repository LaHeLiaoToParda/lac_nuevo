package data;

import java.util.List;

import model.Camiseta;
import model.Usuario;

public interface IBackOfficeDAO {
	
	public void altaUsuario(Usuario u);
//	public void bajaUsuario(Usuario u); para 3er Sprint
	public void altaCamiseta(Camiseta c);
	public void bajaCamiseta(int id);
	public void modificarCamiseta(int id, String color, float precio, String genero, String talla, String categoria, int stock, String imagen, String descripcion);
	public List<Camiseta> consultarCamiseta(int id);
}
