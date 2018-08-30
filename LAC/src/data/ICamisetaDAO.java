package data;

import java.util.List;

import model.Camiseta;

public interface ICamisetaDAO {
 
	public List<Camiseta> listadoCamisetas();
	public List<Camiseta> mostrarCamisetasCategoriaGenero(String genero, String categoria);
	public List<Camiseta> mostrarCamisetasGenero(String genero);
	public List<Camiseta> mostrarCamisetasCategoria(String categoria);
	public List<Camiseta> mostrarCamisetasTalla(String talla);
	public Camiseta mostrarFichaTecnicaCamiseta(int id);
	public void Alta(Camiseta c);
}
