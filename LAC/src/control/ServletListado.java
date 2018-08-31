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
import utilities.Pantalla;

/**
 * Servlet implementation class ServletListado
 */
/**
 * Maneja las peticiones de usuario de que categoria o genero quiere elegir para ver camisetas
 */

@WebServlet("/ServletListado")
/**
 * 
 * redireccion hacia el servlet, en los jsp para referirse a este servlet deben poner esta ruta
 *
 */
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
	protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		List<Camiseta> cam;

		try {
			String operacion = request.getParameter("operacion");
			String genero = request.getParameter("genero");
			String categoria = request.getParameter("categoria");
			String talla = request.getParameter("talla");
			
			if(operacion.equalsIgnoreCase("5")) {
				//GENERO y CATEGORIA Y TALLA
				if(genero.equalsIgnoreCase("hombre")) {
					//hombre y categoria y talla
					cam = new CamisetaDAO().mostrarCamisetasGeneroCategoriaTalla(genero, categoria, talla);
					request.setAttribute("Lista", cam);
					RequestDispatcher view = request.getRequestDispatcher("/camisetasHombre.jsp");
					view.forward(request, response);
				} else {
					//mujer y categoria y talla
					cam = new CamisetaDAO().mostrarCamisetasGeneroCategoriaTalla(genero, categoria, talla);
					request.setAttribute("Lista", cam);
					RequestDispatcher view = request.getRequestDispatcher("/camisetasMujer.jsp");
					view.forward(request, response);
				}
				
			} else if(operacion.equalsIgnoreCase("4")) {
				//GENERO y CATEGORIA
				if(genero.equalsIgnoreCase("hombre")) {
					//hombre y categoria
					cam = new CamisetaDAO().mostrarCamisetasGeneroCategoria(genero, categoria);
					request.setAttribute("Lista", cam);
					RequestDispatcher view = request.getRequestDispatcher("/camisetasHombre.jsp");
					view.forward(request, response);
				} else {
					//mujer y categoria
					cam = new CamisetaDAO().mostrarCamisetasGeneroCategoria(genero, categoria);
					request.setAttribute("Lista", cam);
					RequestDispatcher view = request.getRequestDispatcher("/camisetasMujer.jsp");
					view.forward(request, response);
				}
			} else if(operacion.equalsIgnoreCase("3")) {
				//GENERO
				if(genero.equalsIgnoreCase("hombre")) {
					//hombre y genero
					cam = new CamisetaDAO().mostrarCamisetasGenero(genero);
					request.setAttribute("Lista", cam);
					RequestDispatcher view = request.getRequestDispatcher("/camisetasHombre.jsp");
					view.forward(request, response);
					
				} else {
					//mujer y genero
					cam = new CamisetaDAO().mostrarCamisetasGenero(genero);
					request.setAttribute("Lista", cam);
					RequestDispatcher view = request.getRequestDispatcher("/camisetasMujer.jsp");
					view.forward(request, response);
				}
			} else if(operacion.equalsIgnoreCase("2")) {
				//TODAS
				cam = new CamisetaDAO().listadoCamisetas();
				request.setAttribute("Lista", cam);
				RequestDispatcher view = request.getRequestDispatcher("/camisetas_Todas.jsp");
				view.forward(request, response);
				
			} else if(operacion.equalsIgnoreCase("1")) {
				//ID
				Camiseta camiseta = new Camiseta();
				String id = request.getParameter("id");
				int idCamiseta= Integer.parseInt(id);
				camiseta = new CamisetaService().mostrarFichaTecnicaCamiseta(idCamiseta);
				request.setAttribute("Camiseta", camiseta);
				RequestDispatcher view = request.getRequestDispatcher("/fichaTecnica.jsp");
				view.forward(request, response);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
						
			
			
			
//			//antiguo/////////////////
//			if (operacion.equalsIgnoreCase("genero")) {
//				genero = request.getParameter("genero");
//				
//				
//				/**
//				 * si el genero es de hombre , cargamos nuestra LIST con todas las camisetas de genero HOMBRE
//				 */
//				if (genero.equalsIgnoreCase("HOMBRE")) {
//					
//					/**
//					 * segun la categoria que recoja el enlace , cargamos nuestra LIST con todas las camisetas de genero HOMBRE y categoria elegida
//					 */
//					String categoria = request.getParameter("categoria");
//					cam = new CamisetaDAO().mostrarCamisetasCategoriaGenero(genero, categoria);
//					request.setAttribute("Lista", cam);
//					
//					
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
//					
//					/**
//					 * si el genero es de hombre , cargamos nuestra LIST con todas las camisetas de genero HOMBRE
//					 */
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
//				
//				/**
//				 * si la operacion del enlace href="ServletListado?operacion=listado"
//				 */
//			} else if (operacion.equalsIgnoreCase("listado")) {
//				cam = new CamisetaDAO().listadoCamisetas();
//				request.setAttribute("Lista", cam);
//				RequestDispatcher view = request.getRequestDispatcher("/camisetas_Todas.jsp");
//				view.forward(request, response);
//			}
//			/**
//			 * si la operacion del enlace href="ServletListado?operacion=listado"
//			 */
//			else if(operacion.equalsIgnoreCase("id")){
//				Camiseta camiseta = new Camiseta();
//				/**
//				 * recoge el id del boton de la camiseta
//				 */
//				String id = request.getParameter("id");
//				int idCamiseta= Integer.parseInt(id);
//				
//				/**
//				 * llamamos al metodo fichatecnica segun el id que se le pase
//				 */
//				camiseta = new CamisetaService().mostrarFichaTecnicaCamiseta(idCamiseta);
//				request.setAttribute("Camiseta", camiseta);
//				/**
//				 * redireccion al jsp fichaTecnica.jsp
//				 */
//				RequestDispatcher view = request.getRequestDispatcher("/fichaTecnica.jsp");
//				view.forward(request, response);
//			}


	

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
