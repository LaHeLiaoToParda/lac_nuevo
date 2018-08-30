package control;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import data.CamisetaDAO;
import model.Camiseta;
import model.Usuario;
import services.CamisetaService;

/**
 * Servlet implementation class ServletUsuario
 */
@WebServlet("/ServletUsuario")
public class ServletUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletUsuario() {
        super();
    }
    
	protected void processRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		List<Usuario> usu;

		try {

			String operacion = request.getParameter("operacion");
			String genero;
//			if (operacion.equalsIgnoreCase("genero")) {
//				genero = request.getParameter("genero");
//				
//				if (genero.equalsIgnoreCase("HOMBRE")) {
//					String categoria = request.getParameter("categoria");
//					cam = new CamisetaDAO().mostrarCamisetasCategoriaGenero(genero, categoria);
//					request.setAttribute("Lista", cam);
//					if (categoria.equalsIgnoreCase("MANGA_CORTA")) {
//						RequestDispatcher view = request.getRequestDispatcher("/camisetasHombre.jsp");
//						view.forward(request, response);
//					} else if (categoria.equalsIgnoreCase("MANGA_LARGA")) {
//						RequestDispatcher view = request.getRequestDispatcher("/camisetasHombre.jsp");
//						view.forward(request, response);
//					} else if (categoria.equalsIgnoreCase("TIRANTES")) {
//						RequestDispatcher view = request.getRequestDispatcher("/camisetasHombre.jsp");
//						view.forward(request, response);
//					} else if (categoria.equalsIgnoreCase("SOLO")) {
//						cam = new CamisetaDAO().mostrarCamisetasGenero(genero);
//						request.setAttribute("Lista", cam);
//						RequestDispatcher view = request.getRequestDispatcher("/camisetasHombre.jsp");
//						view.forward(request, response);
//					}
//				} else if (genero.equalsIgnoreCase("MUJER")) {
//					String categoria = request.getParameter("categoria");
//					cam = new CamisetaDAO().mostrarCamisetasCategoriaGenero(genero, categoria);
//					request.setAttribute("Lista", cam);
//					if (categoria.equalsIgnoreCase("MANGA_CORTA")) {
//						RequestDispatcher view = request.getRequestDispatcher("/camisetasMujer.jsp");
//						view.forward(request, response);
//					} else if (categoria.equalsIgnoreCase("MANGA_LARGA")) {
//						RequestDispatcher view = request.getRequestDispatcher("/camisetasMujer.jsp");
//						view.forward(request, response);
//					} else if (categoria.equalsIgnoreCase("TIRANTES")) {
//						RequestDispatcher view = request.getRequestDispatcher("/camisetasMujer.jsp");
//						view.forward(request, response);
//					} else if (categoria.equalsIgnoreCase("SOLO")) {
//						cam = new CamisetaDAO().mostrarCamisetasGenero(genero);
//						request.setAttribute("Lista", cam);
//						RequestDispatcher view = request.getRequestDispatcher("/camisetasMujer.jsp");
//						view.forward(request, response);
//					}
//				}
//			} else if (operacion.equalsIgnoreCase("listado")) {
//				cam = new CamisetaDAO().listadoCamisetas();
//				request.setAttribute("Lista", cam);
//				RequestDispatcher view = request.getRequestDispatcher("/camisetas_Todas.jsp");
//				view.forward(request, response);
//				
//			} else if(operacion.equalsIgnoreCase("id")){
//				Camiseta camiseta = new Camiseta();
//				String id = request.getParameter("id");
//				int idCamiseta= Integer.parseInt(id);
//				
//				camiseta = new CamisetaService().mostrarFichaTecnicaCamiseta(idCamiseta);
//				request.setAttribute("Camiseta", camiseta);
//				RequestDispatcher view = request.getRequestDispatcher("/fichaTecnica.jsp");
//				view.forward(request, response);
//			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
	}

}
