package control;

/**
 * @author Opazo
 */

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

import services.CamisetaService;

/**
 * Servlet implementation class ServletListado
 */

/**
 * 
 * redireccion hacia el servlet, en los jsp para referirse a este servlet deben poner esta ruta
 *
 */
@WebServlet("/ServletListado")
public class ServletListado extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ServletListado() {
		super();

	}
	
	/**
	 * Metodo que recoge datos del jsp  y envia elementos al jsp
	 * @param request
	 * @param response
	 * @throws ServletException
	 * @throws IOException
	 */
	protected void processRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		/**
		 * Lista que se usara para almacenar los datos de la base de datos
		 */
		List<Camiseta> cam;

		try {

		/**
		 * request.getParameter("operacion") --> recoge el valor de operacion en el href="ServletListado?operacion=genero&genero=HOMBRE"
		 */
			String operacion = request.getParameter("operacion");
			String genero;
			if (operacion.equalsIgnoreCase("genero")) {
				genero = request.getParameter("genero");
				
				
				/**
				 * si el genero es de hombre , cargamos nuestra LIST con todas las camisetas de genero HOMBRE
				 */
				if (genero.equalsIgnoreCase("HOMBRE")) {
					
					/**
					 * segun la categoria que recoja el enlace , cargamos nuestra LIST con todas las camisetas de genero HOMBRE y categoria elegida
					 */
					String categoria = request.getParameter("categoria");
					cam = new CamisetaDAO().mostrarCamisetasCategoriaGenero(genero, categoria);
					request.setAttribute("Lista", cam);
					if (categoria.equalsIgnoreCase("MANGA_CORTA")) {
						RequestDispatcher view = request.getRequestDispatcher("/camisetasHombre.jsp");
						view.forward(request, response);
					} else if (categoria.equalsIgnoreCase("MANGA_LARGA")) {
						RequestDispatcher view = request.getRequestDispatcher("/camisetasHombre.jsp");
						view.forward(request, response);
					} else if (categoria.equalsIgnoreCase("TIRANTES")) {
						RequestDispatcher view = request.getRequestDispatcher("/camisetasHombre.jsp");
						view.forward(request, response);
					} else if (categoria.equalsIgnoreCase("SOLO")) {
						cam = new CamisetaDAO().mostrarCamisetasGenero(genero);
						request.setAttribute("Lista", cam);
						RequestDispatcher view = request.getRequestDispatcher("/camisetasHombre.jsp");
						view.forward(request, response);
					}
					
					/**
					 * si el genero es de hombre , cargamos nuestra LIST con todas las camisetas de genero HOMBRE
					 */
				} else if (genero.equalsIgnoreCase("MUJER")) {
					String categoria = request.getParameter("categoria");
					cam = new CamisetaDAO().mostrarCamisetasCategoriaGenero(genero, categoria);
					request.setAttribute("Lista", cam);
					if (categoria.equalsIgnoreCase("MANGA_CORTA")) {
						RequestDispatcher view = request.getRequestDispatcher("/camisetasMujer.jsp");
						view.forward(request, response);
					} else if (categoria.equalsIgnoreCase("MANGA_LARGA")) {
						RequestDispatcher view = request.getRequestDispatcher("/camisetasMujer.jsp");
						view.forward(request, response);
					} else if (categoria.equalsIgnoreCase("TIRANTES")) {
						RequestDispatcher view = request.getRequestDispatcher("/camisetasMujer.jsp");
						view.forward(request, response);
					} else if (categoria.equalsIgnoreCase("SOLO")) {
						cam = new CamisetaDAO().mostrarCamisetasGenero(genero);
						request.setAttribute("Lista", cam);
						RequestDispatcher view = request.getRequestDispatcher("/camisetasMujer.jsp");
						view.forward(request, response);
					}
				}
				
				/**
				 * si la operacion del enlace href="ServletListado?operacion=listado"
				 */
			} else if (operacion.equalsIgnoreCase("listado")) {
				cam = new CamisetaDAO().listadoCamisetas();
				request.setAttribute("Lista", cam);
				RequestDispatcher view = request.getRequestDispatcher("/camisetas_Todas.jsp");
				view.forward(request, response);
				
			}
			/**
			 * si la operacion del enlace href="ServletListado?operacion=listado"
			 */
			else if(operacion.equalsIgnoreCase("id")){
				Camiseta camiseta = new Camiseta();
				/**
				 * recoge el id del boton de la camiseta
				 */
				String id = request.getParameter("id");
				int idCamiseta= Integer.parseInt(id);
				
				/**
				 * llamamos al metodo fichatecnica segun el id que se le pase
				 */
				camiseta = new CamisetaService().mostrarFichaTecnicaCamiseta(idCamiseta);
				request.setAttribute("Camiseta", camiseta);
				/**
				 * redireccion al jsp fichaTecnica.jsp
				 */
				RequestDispatcher view = request.getRequestDispatcher("/fichaTecnica.jsp");
				view.forward(request, response);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// response.getWriter().append("Served at:
		// ").append(request.getContextPath());
		processRequest(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// doGet(request, response);
		processRequest(request, response);
	}

}
