package control;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
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
import services.ICamisetaService;

/**
 * Servlet implementation class ServletListado
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

	protected void processRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		List<Camiseta> cam;

		try {

			String operacion = request.getParameter("operacion");
			String genero;
			if (operacion.equalsIgnoreCase("genero"))// 1
			{

				genero = request.getParameter("genero");

				if (genero.equalsIgnoreCase("HOMBRE"))// 2
				{
					String categoria = request.getParameter("categoria");
					cam = new CamisetaDAO().mostrarCamisetasCategoriaGenero(genero, categoria);
					request.setAttribute("Lista", cam);
					if (categoria.equalsIgnoreCase("MANGA_CORTA")) {
						RequestDispatcher view = request.getRequestDispatcher("/camisetas_Manga_Corta.jsp");
						view.forward(request, response);
					} else if (categoria.equalsIgnoreCase("MANGA_LARGA")) {
						RequestDispatcher view = request.getRequestDispatcher("/camisetas_Manga_Larga.jsp");
						view.forward(request, response);
					} else if (categoria.equalsIgnoreCase("TIRANTES")) {
						RequestDispatcher view = request.getRequestDispatcher("/camisetas_Tirantes.jsp");
						view.forward(request, response);
					} else if (categoria.equalsIgnoreCase("SOLO")) {
						cam = new CamisetaDAO().mostrarCamisetasGenero(genero);
						request.setAttribute("Lista", cam);
						RequestDispatcher view = request.getRequestDispatcher("/camisetasHombre.jsp");
						view.forward(request, response);
					}

				} else if (genero.equalsIgnoreCase("MUJER")) {
					String categoria = request.getParameter("categoria");
					cam = new CamisetaDAO().mostrarCamisetasCategoriaGenero(genero, categoria);
					request.setAttribute("Lista", cam);
					if (categoria.equalsIgnoreCase("MANGA_CORTA")) {
						RequestDispatcher view = request.getRequestDispatcher("/camisetas_Manga_Corta.jsp");
						view.forward(request, response);
					} else if (categoria.equalsIgnoreCase("MANGA_LARGA")) {
						RequestDispatcher view = request.getRequestDispatcher("/camisetas_Manga_Larga.jsp");
						view.forward(request, response);
					} else if (categoria.equalsIgnoreCase("TIRANTES")) {
						RequestDispatcher view = request.getRequestDispatcher("/camisetas_Tirantes.jsp");
						view.forward(request, response);
					} else if (categoria.equalsIgnoreCase("SOLO")) {
						cam = new CamisetaDAO().mostrarCamisetasGenero(genero);
						request.setAttribute("Lista", cam);
						RequestDispatcher view = request.getRequestDispatcher("/camisetasMujer.jsp");
						view.forward(request, response);
					}
				}
			} else if (operacion.equalsIgnoreCase("listado")) {
				cam = new CamisetaDAO().listadoCamisetas();
				request.setAttribute("Lista", cam);
				RequestDispatcher view = request.getRequestDispatcher("/camisetas_Todas.jsp");
				view.forward(request, response);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/*
	 * operacion = request.getParameter("operacion"); DAOPais op = new
	 * DAOPais();
	 * 
	 * if (operacion.equals("alta")) { //ALTA op.Alta(recogerDatos(request));
	 * response.sendRedirect("paises?operacion=listado"); } else if
	 * (operacion.equals("baja")) { // BAJA
	 * op.Baja(request.getParameter("cod"));
	 * response.sendRedirect("paises?operacion=listado"); } else if
	 * (operacion.equals("detalle")) { // DETALLE request.setAttribute("paises",
	 * op.Detalle(request.getParameter("cod"))); RequestDispatcher view =
	 * request.getRequestDispatcher("/detalle.jsp"); view.forward(request,
	 * response); } else if (operacion.equals("modificacion")) { // MODIFICACION
	 * request.setAttribute("paises", op.Detalle(request.getParameter("cod")));
	 * RequestDispatcher view = request.getRequestDispatcher("/update.jsp");
	 * view.forward(request, response); } else if (operacion.equals("update")) {
	 * // UPDATE op.Update(recogerDatos(request));
	 * response.sendRedirect("paises?operacion=listado"); } else if
	 * (operacion.equals("listado")) { // LISTADO request.setAttribute("paises",
	 * op.Listado()); RequestDispatcher view =
	 * request.getRequestDispatcher("/listado.jsp"); view.forward(request,
	 * response); }
	 * 
	 */

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
