package control;

/**
 * @author admin
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

/**
 * Servlet implementation class Controlador
 */

/**
 * Reciba el argumento de la barra de busqueda y segun su contenido muestra lo que busques.
 */

@WebServlet("/ServletBarraBusqueda")
/**
 * 
 * el WebServlet es el nombre del servlet para llamarlo desde un jsp o hmtl y que te redirija aqui
 *
 */
public class ServletBarraBusqueda extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * Metodo que ejecuta el servlet, en el esta contenido todo el cuerpo del servlet, se ejecuta en el doGet y doPost
	 * @param request
	 * @param response
	 * @throws ServletException
	 * @throws IOException
	 */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        /**
         * Coleccion tipo Lista para recoger los datos de la base de datos segun el metodo que llamemos de la interfaz CamisetaDAO
         */
        List<Camiseta> cam;
 
        try {
 
        	/**
        	 * request.getParameter("elemento") --> metodo para recoger elementos del jsp o html
        	 */
            String busqueda = request.getParameter("search");// devuelve lo del
            /**
             * request.setAttribute("elem",elem)--> para introducirle elementos al jsp o html que despues redirija y usarlos en los jsp.
             * En este caso le  pasamos el titulo que le vamos a pintar en el jsp con la busqueda realizada
             * EJ: si escribes pepe, te saldra en el jsp de salida el titulo pepe entre comillas
             * 
             */
            request.setAttribute("titulo", busqueda);                                                    // buscador
 
            
            /**
             * Depenediendo de lo que escribas en el input mostraremos segun los parametros lo que el usuario esta buscando
             */
            /**
             * En este caso es todo lo relacionado con camisetas de hombre
             */
            if (busqueda.equalsIgnoreCase("hombre") || busqueda.equalsIgnoreCase("camisetas de hombre")
            
                    || busqueda.equalsIgnoreCase("camisetas de chico") || busqueda.equalsIgnoreCase("camiseta chico")
                    || busqueda.equalsIgnoreCase("camisetas hombre") || busqueda.equalsIgnoreCase("camisetas chico")
                    || busqueda.equalsIgnoreCase("camiseta hombre"))//
            {
                cam = new CamisetaDAO().mostrarCamisetasGenero("hombre");
                /**
                 * cargamos nuestra LISTA con el metodo segun genero de nuestra interfaz CamisetasDAO
                 */
                request.setAttribute("Lista", cam);
                /**
                 * enviamos la coleccion con el atributo cam, con este atributo manejaremos la coleccion en el jsp de salida 
                 * en nuestro caso recorreremos la LISTA con el foreach
                 */
                RequestDispatcher view = request.getRequestDispatcher("/busqueda.jsp");
                /**
                 * con view , pintaremos el archivo jsp seleccionado
                 */
                view.forward(request, response);
                /**
                 * con view.forward ejecutamos el metodo.
                 */
            } else if (busqueda.equalsIgnoreCase("mujer") || busqueda.equalsIgnoreCase("camisetas de mujer")
                    || busqueda.equalsIgnoreCase("camisetas de chica") || busqueda.equalsIgnoreCase("camiseta chica")
                    || busqueda.equalsIgnoreCase("camisetas mujer") || busqueda.equalsIgnoreCase("camisetas chica")
                    || busqueda.equalsIgnoreCase("camiseta mujer"))//
            {
                cam = new CamisetaDAO().mostrarCamisetasGenero("mujer");
                request.setAttribute("Lista", cam);
                RequestDispatcher view = request.getRequestDispatcher("/busqueda.jsp");
                view.forward(request, response);
            } else if (busqueda.equalsIgnoreCase("camisetas") || busqueda.equalsIgnoreCase("camiseta")
                    || busqueda.equalsIgnoreCase("camis"))//
            {
                cam = new CamisetaDAO().listadoCamisetas();
                request.setAttribute("Lista", cam);
                RequestDispatcher view = request.getRequestDispatcher("/busqueda.jsp");
                view.forward(request, response);
            } else if (busqueda.equalsIgnoreCase("manga corta") || busqueda.equalsIgnoreCase("camisetas corta")
                    || busqueda.equalsIgnoreCase("camiseta corta") || busqueda.equalsIgnoreCase("camiseta manga corta")
                    || busqueda.equalsIgnoreCase("corta"))//
            {
                cam = new CamisetaDAO().mostrarCamisetasCategoria("MANGA_CORTA");
                request.setAttribute("Lista", cam);
                RequestDispatcher view = request.getRequestDispatcher("/busqueda.jsp");
                view.forward(request, response);
            }
            else if (busqueda.equalsIgnoreCase("manga larga") || busqueda.equalsIgnoreCase("camisetas larga")
                    || busqueda.equalsIgnoreCase("camiseta larga") || busqueda.equalsIgnoreCase("camiseta manga larga")
                    || busqueda.equalsIgnoreCase("larga"))//
            {
                cam = new CamisetaDAO().mostrarCamisetasCategoria("MANGA_LARGA");
                request.setAttribute("Lista", cam);
                RequestDispatcher view = request.getRequestDispatcher("/busqueda.jsp");
                view.forward(request, response);
            }
            else if (busqueda.equalsIgnoreCase("sin manga") || busqueda.equalsIgnoreCase("camisetas tirantes")
                    || busqueda.equalsIgnoreCase("camiseta tirantes") || busqueda.equalsIgnoreCase("camiseta sin mangas")
                    || busqueda.equalsIgnoreCase("tirantes")|| busqueda.equalsIgnoreCase("tirante"))//
            {
                cam = new CamisetaDAO().mostrarCamisetasCategoria("TIRANTES");
                request.setAttribute("Lista", cam);
                RequestDispatcher view = request.getRequestDispatcher("/busqueda.jsp");
                view.forward(request, response);
            }
            else
            {
            	/**
                 * En el caso de que la palabra recogida del input no entren en ningun filtro, llegara aqui y le redireccionaremos
                 * a un jsp donde le especifacara al usuario su busqueda y que no se han encontrado productos.
                 */
            	RequestDispatcher view = request.getRequestDispatcher("/busqueda.jsp");
            	view.forward(request, response);
            }
 
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    
    /**
     * Tanto los metodos doGet como doPost implementaran el metodo ProcessRequest.
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
