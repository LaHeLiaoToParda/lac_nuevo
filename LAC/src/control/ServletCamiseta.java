package control;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import data.BackOfficeDAO;
import model.Camiseta;
import model.Categoria;
import model.Color;
import model.Genero;
import model.Talla;


/**
 * Servlet implementation class ServletCamiseta
 */
@WebServlet("/ServletCamiseta")
public class ServletCamiseta extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletCamiseta() {
        super();
    }
    
	protected void processRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		Camiseta c = new Camiseta();

		try {
			String operacion = request.getParameter("operacion");
			
			if(operacion.equalsIgnoreCase("alta")) 
			{
				c.setColor(Color.valueOf(request.getParameter("color")));
				c.setPrecio(Float.parseFloat(request.getParameter("precio")));
				c.setGenero(Genero.valueOf(request.getParameter("genero")));
				c.setTalla(Talla.valueOf(request.getParameter("talla")));
				c.setCategoria(Categoria.valueOf(request.getParameter("categoria")));
				c.setStock(Integer.parseInt(request.getParameter("stock")));
				c.setUrl(request.getParameter("url"));
				c.setDescripcion(request.getParameter("descripcion"));
				
				new BackOfficeDAO().altaCamiseta(c);
//				RequestDispatcher view = request.getRequestDispatcher("/index.html");
//				view.forward(request, response);
				
			} else if(operacion.equalsIgnoreCase("baja")) 
			{
				
				int id = Integer.parseInt(request.getParameter("id"));
				
				new BackOfficeDAO().bajaCamiseta(id);
				RequestDispatcher view = request.getRequestDispatcher("/index.html");
				view.forward(request, response);
		
			} else if(operacion.equalsIgnoreCase("modificar")) 
			{
				
			}else if(operacion.equalsIgnoreCase("consulta"))
			{
				
				int id = Integer.parseInt(request.getParameter("id"));
				
				new BackOfficeDAO().consultarCamiseta(id);
				RequestDispatcher view = request.getRequestDispatcher("/index.html");
				view.forward(request, response);
				
			}
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
