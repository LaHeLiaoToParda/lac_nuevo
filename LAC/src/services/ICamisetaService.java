package services;

import java.util.List;
import model.Camiseta;

public interface ICamisetaService {

	public List<Camiseta> listadoCamisetas();
	public List<Camiseta> mostrarCamisetasCategoriaGenero(String genero, String categoria);
	public List<Camiseta> mostrarCamisetasGenero(String genero);
	public Camiseta mostrarFichaTecnicaCamiseta(int id);
	
	
}