package services;

import java.util.List;
import model.Camiseta;

public interface ICamisetaService {

	public List<Camiseta> listadoCamisetas();
	public List<Camiseta> mostrarCamisetasGeneroCategoria(String genero, String categoria);
	public List<Camiseta> mostrarCamisetasGenero(String genero);
//	public List<Camiseta> mostrarCamisetasCategoria(String categoria); por ahora no lo estamos usando
	public List<Camiseta> mostrarCamisetasTalla(String talla);
	public Camiseta mostrarFichaTecnicaCamiseta(int id);
	public void Alta(Camiseta c);
	
}