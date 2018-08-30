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

/**
 * Servlet implementation class Controlador
 */
@WebServlet("/Controlador")
public class Controlador extends HttpServlet {
	private static final long serialVersionUID = 1L;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        List<Camiseta> cam;
 
        try {
 
            String busqueda = request.getParameter("search");// devuelve lo del
                                                                // buscador
 
            if (busqueda.equalsIgnoreCase("hombre") || busqueda.equalsIgnoreCase("camisetas de hombre")
                    || busqueda.equalsIgnoreCase("camisetas de chico") || busqueda.equalsIgnoreCase("camiseta chico")
                    || busqueda.equalsIgnoreCase("camisetas hombre") || busqueda.equalsIgnoreCase("camisetas chico")
                    || busqueda.equalsIgnoreCase("camiseta hombre"))//
            {
                cam = new CamisetaDAO().mostrarCamisetasGenero("hombre");
                request.setAttribute("Lista", cam);
                RequestDispatcher view = request.getRequestDispatcher("/camisetasHombre.jsp");
                view.forward(request, response);
            } else if (busqueda.equalsIgnoreCase("mujer") || busqueda.equalsIgnoreCase("camisetas de mujer")
                    || busqueda.equalsIgnoreCase("camisetas de chica") || busqueda.equalsIgnoreCase("camiseta chica")
                    || busqueda.equalsIgnoreCase("camisetas mujer") || busqueda.equalsIgnoreCase("camisetas chica")
                    || busqueda.equalsIgnoreCase("camiseta mujer"))//
            {
                cam = new CamisetaDAO().mostrarCamisetasGenero("mujer");
                request.setAttribute("Lista", cam);
                RequestDispatcher view = request.getRequestDispatcher("/camisetasMujer.jsp");
                view.forward(request, response);
            } else if (busqueda.equalsIgnoreCase("camisetas") || busqueda.equalsIgnoreCase("camiseta")
                    || busqueda.equalsIgnoreCase("camis"))//
            {
                cam = new CamisetaDAO().listadoCamisetas();
                request.setAttribute("Lista", cam);
                RequestDispatcher view = request.getRequestDispatcher("/camisetas_Todas.jsp");
                view.forward(request, response);
            } else if (busqueda.equalsIgnoreCase("manga corta") || busqueda.equalsIgnoreCase("camisetas corta")
                    || busqueda.equalsIgnoreCase("camiseta corta") || busqueda.equalsIgnoreCase("camiseta manga corta")
                    || busqueda.equalsIgnoreCase("corta"))//
            {
                cam = new CamisetaDAO().mostrarCamisetasCategoria("MANGA_CORTA");
                request.setAttribute("Lista", cam);
                RequestDispatcher view = request.getRequestDispatcher("/camisetas_Manga_Corta.jsp");
                view.forward(request, response);
            }
            else if (busqueda.equalsIgnoreCase("manga larga") || busqueda.equalsIgnoreCase("camisetas larga")
                    || busqueda.equalsIgnoreCase("camiseta larga") || busqueda.equalsIgnoreCase("camiseta manga larga")
                    || busqueda.equalsIgnoreCase("larga"))//
            {
                cam = new CamisetaDAO().mostrarCamisetasCategoria("MANGA_LARGA");
                request.setAttribute("Lista", cam);
                RequestDispatcher view = request.getRequestDispatcher("camisetas_Manga_Larga.jsp");
                view.forward(request, response);
            }
            else if (busqueda.equalsIgnoreCase("sin manga") || busqueda.equalsIgnoreCase("camisetas tirantes")
                    || busqueda.equalsIgnoreCase("camiseta tirantes") || busqueda.equalsIgnoreCase("camiseta sin mangas")
                    || busqueda.equalsIgnoreCase("tirantes")|| busqueda.equalsIgnoreCase("tirante"))//
            {
                cam = new CamisetaDAO().mostrarCamisetasCategoria("TIRANTES");
                request.setAttribute("Lista", cam);
                RequestDispatcher view = request.getRequestDispatcher("camisetas_Tirantes.jsp");
                view.forward(request, response);
            }
 
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
