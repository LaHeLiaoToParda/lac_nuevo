package control;
/**
 * @author Jorge
 */
import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import data.BackOfficeDAO;
import data.CamisetaDAO;
import data.IBackOfficeDAO;
import model.Camiseta;
import model.Usuario;

/**
 * Servlet login que utiliza sesiones para almacenar la información
 */
/**
 * 
 * ruta que utilizará el jsp para mostrar las peticiones del servlet en pantalla
 *
 */
@WebServlet("/ControlLogin")
/**
 * 
 * clase httpServlet que hereda la clase contrologin para utilizar sus métodos y realizar la petición del usuario y llevarlo al jsp
 *
 */

public class ControlLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControlLogin()
    {
        super();
        // TODO Auto-generated constructor stub
    }
    
    /**
	 * Metodo que realiza el login de un usuario, comparando en la BBDD si existe usuario y contreseña.
	 * @param request
	 * @param response
	 * @throws ServletException
	 * @throws IOException
	 */

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        List<Camiseta> cam;
        Usuario m= new Usuario();
        Usuario u= new Usuario();
    	
        try
        {
        	boolean validado = false;
        	String nick = request.getParameter("nick");
    		String pass = request.getParameter("pass");
			validado = new BackOfficeDAO().validarUsuario(nick,pass);
        	
        		if(validado==true){
        			/**
        			 * Objeto que guarda la información de la sesión
        			 * @param HttpSesion
        			 */
        			HttpSession session = request.getSession();
    				
    				
    				
    				
//    				m.setNick((String) session.getAttribute("nick"));
//    				m.setNombre((String) session.getAttribute("nombre"));
    				//colocar variables en la sesión
    				session.setAttribute("usuario", nick);
    				
     			   RequestDispatcher view = request.getRequestDispatcher("/index.jsp");
     			   view.forward(request, response);
        		}else{
        			response.sendRedirect("login.jsp");
        			
        			
        		}
			   
//        		//deberíamos buscar el usuario en la base de datos, pero dado que se escapa de este tema, ponemos un ejemplo en el mismo código
//                if(usu.equals("admin") && pass.equals("admin") && sesion.getAttribute("usuario") == null){
//                    //si coincide usuario y password y además no hay sesión iniciada
//                    sesion.setAttribute("usuario", usu);
//                    //redirijo a página con información de login exitoso
//                    response.sendRedirect("loginExito.jsp");
//                }else{
//                    //lógica para login inválido
//                }
//            }
			   
			   
			   
			   
				
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		processRequest(request,response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		processRequest(request,response);
	}
	
}
