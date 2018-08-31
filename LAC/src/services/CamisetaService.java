package services;

import java.util.List;
import data.CamisetaDAO;
import data.ICamisetaDAO;
import model.Camiseta;

public class CamisetaService implements ICamisetaService {
	
	private ICamisetaDAO CamisetaDAO = new CamisetaDAO();

	
	public List<Camiseta> listadoCamisetas() {
		return CamisetaDAO.listadoCamisetas();
	}

	public List<Camiseta> mostrarCamisetasGeneroCategoria(String genero, String categoria) {
		return CamisetaDAO.mostrarCamisetasGeneroCategoria(genero, categoria);
	}

	public List<Camiseta> mostrarCamisetasGenero(String genero) {
		return CamisetaDAO.mostrarCamisetasGenero(genero);
	}

	public Camiseta mostrarFichaTecnicaCamiseta(int id) {
		return CamisetaDAO.mostrarFichaTecnicaCamiseta(id);
	}

//	Por ahora no loe stamos usando
//	public List<Camiseta> mostrarCamisetasCategoria(String categoria) {
//		return CamisetaDAO.mostrarCamisetasCategoria(categoria);
//	}

	public List<Camiseta> mostrarCamisetasTalla(String talla) {
		return CamisetaDAO.mostrarCamisetasTalla(talla);
	}

	public void Alta(Camiseta c) {
		CamisetaDAO.Alta(c);
	}
	
	
}
