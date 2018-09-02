package control;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import data.BackOfficeDAO;
import model.Usuario;
import utilities.Pantalla;

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
		Usuario u = new Usuario();

		try {
			String operacion = request.getParameter("operacion");
			
			if(operacion.equalsIgnoreCase("alta")){
				u.setNick(request.getParameter("nick"));
				u.setNombre(request.getParameter("nombre"));
				u.setApellidos(request.getParameter("apellidos"));
				u.setContrasena(request.getParameter("contrasena"));
				u.setDireccion(request.getParameter("direccion"));
				
				boolean yaExiste = false;
				yaExiste = new BackOfficeDAO().comprobarUsuario(u.getNick());
				
				if(yaExiste) {
					Pantalla.write("No se pudo crear el nuevo usuario, el nick "+ u.getNick() + "ya existe.");
					u.setNick(null);
					request.setAttribute("usuario", u);
					RequestDispatcher view = request.getRequestDispatcher("/index.html");
					view.forward(request, response);
				} else {
					new BackOfficeDAO().altaUsuario(u);
				}
				
				
			} else if(operacion.equalsIgnoreCase("baja")) {
//				Para el 3er Sprint
//				u.setDni(request.getParameter("dni"));
				
//				new BackOfficeDAO().bajaUsuario(u);
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
