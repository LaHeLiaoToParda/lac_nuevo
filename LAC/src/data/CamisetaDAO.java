package data;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


import model.Camiseta;
import model.Categoria;
import model.Color;
import model.Genero;
import model.Talla;
import utilities.Pantalla;


public class CamisetaDAO implements ICamisetaDAO {
	
    // Not thread-safe
    public Connection con = null;

    // package level access
    public CamisetaDAO() {
    	con = new ConexionDB().getConnection();
    }
	
	public ArrayList<Camiseta> listadoCamisetas() {
		ArrayList listadoCamisetas = new ArrayList<Camiseta>();
        Statement st = null;
        ResultSet rs = null;
        
        try {
            ConexionDB con = new ConexionDB();
            st = con.getConnection().createStatement();
            rs = st.executeQuery("SELECT * FROM camisetas;" );
            while (rs.next()) {   	
            	Camiseta c = new Camiseta();
            	c.setId(rs.getInt("id"));
                c.setColor(Color.valueOf(rs.getString("color")));
                c.setPrecio((rs.getFloat("precio")));
                c.setGenero(Genero.valueOf(rs.getString("genero")));
                c.setTalla(Talla.valueOf(rs.getString("talla")));
                c.setCategoria(Categoria.valueOf(rs.getString("categoria")));
                c.setStock(rs.getInt("stock"));
                c.setUrl(rs.getString("imagen"));
                c.setDescripcion(rs.getString("descripcion"));
                listadoCamisetas.add(c);
            }
            con.getConnection().close();
        } catch (SQLException ex) {
            Logger.getLogger(CamisetaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listadoCamisetas;
	}

	//devolver coleccion segun categoria y genero
	public List<Camiseta> mostrarCamisetasGeneroCategoria(String genero, String categoria) {
		List camiCatGenero = new ArrayList<Camiseta>();
        Statement st = null;
        ResultSet rs = null;
        
        try {
            ConexionDB con = new ConexionDB();
            st = con.getConnection().createStatement();
            rs = st.executeQuery("SELECT * FROM camisetas WHERE genero ='" + genero
            					+"' AND categoria ='" + categoria + "';" );
            while (rs.next()) {   	
            	Camiseta c = new Camiseta();
            	c.setId(rs.getInt("id"));
                c.setColor(Color.valueOf(rs.getString("color")));
                c.setPrecio((rs.getFloat("precio")));
                c.setGenero(Genero.valueOf(rs.getString("genero")));
                c.setTalla(Talla.valueOf(rs.getString("talla")));
                c.setCategoria(Categoria.valueOf(rs.getString("categoria")));
                c.setStock(rs.getInt("stock"));
                c.setUrl(rs.getString("imagen"));
                c.setDescripcion(rs.getString("descripcion"));
                camiCatGenero.add(c);
            }
            con.getConnection().close();
        } catch (SQLException ex) {
            Logger.getLogger(CamisetaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return camiCatGenero;
	}
	
	//devolver coleccion segun genero
	public List<Camiseta> mostrarCamisetasGenero(String genero) {
		List camisetasGenero = new ArrayList<Camiseta>();
        Statement st = null;
        ResultSet rs = null;
        
        try {
            ConexionDB con = new ConexionDB();
            st = con.getConnection().createStatement();
            rs = st.executeQuery("SELECT * FROM camisetas WHERE genero ='" + genero + "'");
            while (rs.next()) {   	
            	Camiseta c = new Camiseta();
            	c.setId(rs.getInt("id"));
                c.setColor(Color.valueOf(rs.getString("color")));
                c.setPrecio((rs.getFloat("precio")));
                c.setGenero(Genero.valueOf(rs.getString("genero")));
                c.setTalla(Talla.valueOf(rs.getString("talla")));
                c.setCategoria(Categoria.valueOf(rs.getString("categoria")));
                c.setStock(rs.getInt("stock"));
                c.setUrl(rs.getString("imagen"));
                c.setDescripcion(rs.getString("descripcion"));
                camisetasGenero.add(c);
            }
            con.getConnection().close();
        } catch (SQLException ex) {
            Logger.getLogger(CamisetaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return camisetasGenero;
	}
	
	//devolver coleccion segun categoria
	public List<Camiseta> mostrarCamisetasCategoria(String categoria) {
		List camisetasCategoria = new ArrayList<Camiseta>();
        Statement st = null;
        ResultSet rs = null;
        
        try {
            ConexionDB con = new ConexionDB();
            st = con.getConnection().createStatement();
            rs = st.executeQuery("SELECT * FROM camisetas WHERE categoria ='" + categoria + "'");
            while (rs.next()) {   	
            	Camiseta c = new Camiseta();
            	c.setId(rs.getInt("id"));
                c.setColor(Color.valueOf(rs.getString("color")));
                c.setPrecio((rs.getFloat("precio")));
                c.setGenero(Genero.valueOf(rs.getString("genero")));
                c.setTalla(Talla.valueOf(rs.getString("talla")));
                c.setCategoria(Categoria.valueOf(rs.getString("categoria")));
                c.setStock(rs.getInt("stock"));
                c.setUrl(rs.getString("imagen"));
                c.setDescripcion(rs.getString("descripcion"));
                camisetasCategoria.add(c);
            }
            con.getConnection().close();
        } catch (SQLException ex) {
            Logger.getLogger(CamisetaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return camisetasCategoria;
	}
	
	//devolver coleccion segun talla
	public List<Camiseta> mostrarCamisetasTalla(String talla) {
		List camisetasTalla = new ArrayList<Camiseta>();
        Statement st = null;
        ResultSet rs = null;
        
        try {
            ConexionDB con = new ConexionDB();
            st = con.getConnection().createStatement();
            rs = st.executeQuery("SELECT * FROM camisetas WHERE talla ='" + talla + "'");
            while (rs.next()) {   	
            	Camiseta c = new Camiseta();
            	c.setId(rs.getInt("id"));
                c.setColor(Color.valueOf(rs.getString("color")));
                c.setPrecio((rs.getFloat("precio")));
                c.setGenero(Genero.valueOf(rs.getString("genero")));
                c.setTalla(Talla.valueOf(rs.getString("talla")));
                c.setCategoria(Categoria.valueOf(rs.getString("categoria")));
                c.setStock(rs.getInt("stock"));
                c.setUrl(rs.getString("imagen"));
                c.setDescripcion(rs.getString("descripcion"));
                camisetasTalla.add(c);
            }
            con.getConnection().close();
        } catch (SQLException ex) {
            Logger.getLogger(CamisetaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return camisetasTalla;
	}
	
	//devolver ficha tecnica de una camiseta
	public Camiseta mostrarFichaTecnicaCamiseta(int id) {
		Camiseta c = new Camiseta();
        Statement st = null;
        ResultSet rs = null;
        
        try {
            ConexionDB con = new ConexionDB();
            st = con.getConnection().createStatement();
            rs = st.executeQuery("SELECT c.id, c.color, c.precio, c.genero, c.talla,"
            					+" c.categoria, c.stock, c.imagen, c.descripcion"
            					+" FROM camisetas c"
            					+" WHERE id ='" +id+ "'");
            while (rs.next()) {   	
            	c.setId(rs.getInt("id"));
                c.setColor(Color.valueOf(rs.getString("color")));
                c.setPrecio((rs.getFloat("precio")));
                c.setGenero(Genero.valueOf(rs.getString("genero")));
                c.setTalla(Talla.valueOf(rs.getString("talla")));
                c.setCategoria(Categoria.valueOf(rs.getString("categoria")));
                c.setStock(rs.getInt("stock"));
                c.setUrl(rs.getString("imagen"));
                c.setDescripcion(rs.getString("descripcion"));
            }
            con.getConnection().close();
        } catch (SQLException ex) {
            Logger.getLogger(CamisetaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return c;
	}
	
	//temporal
    public void Alta(Camiseta c) {
        Statement st = null;
        try {
            ConexionDB con = new ConexionDB();
            st = con.getConnection().createStatement();
            //Camiseta(int id, Categoria categoria, float precio, Talla talla, Genero genero, Color color,String url, int stock){
            String q = "INSERT INTO `camisetas` VALUES ('" + c.getId() + "','"+ c.getCategoria() +"','" + c.getPrecio() + c.getPrecio() + "','" + c.getGenero() + "','" + c.getTalla() + "','" + c.getCategoria() + "','" + c.getStock() +"','" + c.getUrl() + "','" + c.getDescripcion()+ "')";
            Pantalla.write(q);
            st.executeUpdate(q);
            con.getConnection().close();

        } catch (SQLException ex) {
            Logger.getLogger(CamisetaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    //devuelve una coleccion de camisetas segun el genero, la categoria y la talla
    public List<Camiseta> mostrarCamisetasGeneroCategoriaTalla(String genero, String categoria, String talla) {
		List<Camiseta> camisetas = new ArrayList<Camiseta>();
        Statement st = null;
        ResultSet rs = null;
        try {
            ConexionDB con = new ConexionDB();
            st = con.getConnection().createStatement();
            rs = st.executeQuery("SELECT * FROM `lac`.`camisetas`"
            					+"WHERE genero='"+genero+"' AND categoria='"+categoria+"' AND  talla='"+talla+"';");
            while (rs.next()) {
            	Camiseta c = new Camiseta();
            	c.setId(rs.getInt("id"));
                c.setColor(Color.valueOf(rs.getString("color")));
                c.setPrecio((rs.getFloat("precio")));
                c.setGenero(Genero.valueOf(rs.getString("genero")));
                c.setTalla(Talla.valueOf(rs.getString("talla")));
                c.setCategoria(Categoria.valueOf(rs.getString("categoria")));
                c.setStock(rs.getInt("stock"));
                c.setUrl(rs.getString("imagen"));
                c.setDescripcion(rs.getString("descripcion"));
                camisetas.add(c);
            }
            con.getConnection().close();
        } catch (SQLException ex) {
            Logger.getLogger(CamisetaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return camisetas;
    }
    
}
