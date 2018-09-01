package data;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import model.Camiseta;
import model.Categoria;
import model.Color;
import model.Genero;
import model.Talla;
import model.Usuario;
import utilities.Pantalla;

public class BackOfficeDAO implements IBackOfficeDAO {

	// Not thread-safe
	public Connection con = null;

	// package level access
	public BackOfficeDAO() {
		con = new ConexionDB().getConnection();
	}

	// añade un nuevo usuario a la bbdd
	public void altaUsuario(Usuario u) {
		Statement st = null;
		try {
			ConexionDB con = new ConexionDB();
			st = con.getConnection().createStatement();

			String q = "INSERT INTO `lac`.`usuarios` (nick, nombre, apellidos, contrasena, direccion)" + " VALUES ('"
					+ u.getNick() + "', '" + u.getNombre() + "', '" + u.getApellidos() + "', '" + u.getContrasena()
					+ "', '" + u.getDireccion() + "');";
			Pantalla.write(q);
			st.executeUpdate(q);
			con.getConnection().close();
		} catch (SQLException ex) {
			Logger.getLogger(BackOfficeDAO.class.getName()).log(Level.SEVERE, null, ex);
		}
	}

	// Añade camisetas a la base de datos
	public void altaCamiseta(Camiseta c) {
		Statement st = null;
		try {
			ConexionDB con = new ConexionDB();
			st = con.getConnection().createStatement();
			String q = "INSERT INTO `lac`.`camisetas` (color, precio, genero, talla, categoria, stock, imagen, descripcion)"
					+ " VALUES ('" + c.getColor() + "', '" + c.getPrecio() + "', '" + c.getGenero() + "', '"
					+ c.getTalla() + "', '" + c.getCategoria() + "', '" + c.getStock() + "', '" + c.getUrl() + "', '"
					+ c.getDescripcion() + "');";
			Pantalla.write(q);
			st.executeUpdate(q);
			con.getConnection().close();
		} catch (SQLException ex) {
			Logger.getLogger(BackOfficeDAO.class.getName()).log(Level.SEVERE, null, ex);
		}
	}

	// Elimina camisetas de la base de datos
	public void bajaCamiseta(int id) {

		Statement st = null;
		try {
			ConexionDB con = new ConexionDB();
			st = con.getConnection().createStatement();

			String q = "DELETE FROM camisetas WHERE id='" + id + "'";
			st.executeUpdate(q);
			con.getConnection().close();
		} catch (SQLException ex) {
			Logger.getLogger(BackOfficeDAO.class.getName()).log(Level.SEVERE, null, ex);
		}
	}

	// Cambia los atributos de la camiseta en la base de datos
	public void modificarCamiseta(int id, String color, float precio, String genero, String talla, String categoria, int stock,
			String imagen, String descripcion) {

		Statement st = null;
		try {
			ConexionDB con = new ConexionDB();
			st = con.getConnection().createStatement();
			String q = "UPDATE camisetas SET color = '" + color + "', precio = '" + precio + "', genero = '" + genero
					+ "', talla = '" + talla + "', categoria = '" + categoria + "', stock = '" + stock + "', imagen = '"
					+ imagen + "', descripcion = '" + descripcion + "' WHERE id = '" +  id + "'";
			st.executeUpdate(q);
			con.getConnection().close();
		} catch (SQLException ex) {
			Logger.getLogger(BackOfficeDAO.class.getName()).log(Level.SEVERE, null, ex);
		}

	}

	// Devuelve un camiseta de la base de datos pasandole un id
	public ArrayList<Camiseta> consultarCamiseta(int id) {
		ArrayList<Camiseta> listadoCamisetas = new ArrayList<Camiseta>();
		Statement st = null;
		ResultSet rs = null;

		try {
			ConexionDB con = new ConexionDB();
			st = con.getConnection().createStatement();
			String q = "SELECT * FROM camisetas WHERE id='" + id + "'";
			rs = st.executeQuery(q);
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

	public boolean comprobarUsuario(String nick) throws SQLException {
		Statement st = null;
		ConexionDB con = new ConexionDB();
		st = con.getConnection().createStatement();

		String q = "SELECT * FROM `lac`.`usuarios` WHERE nick ='" + nick + "';";
		st.executeQuery(q);

		if (st.getResultSet() == null) {
			return false;
		} else {
			return true;
		}
	}

	public boolean validarUsuario(String nick, String contrasena) throws SQLException {
		Statement st = null;
		ConexionDB con = new ConexionDB();
		st = con.getConnection().createStatement();

		String q = "SELECT nick, contrasena FROM usuarios WHERE nick ='" + nick + "' AND contrasena='" + contrasena
				+ "';";
		st.executeQuery(q);

		if (st.getResultSet() != null) {
			return true;
		} else {
			return false;
		}
	}

	// elimina un usuario de la bbdd segun el dni (Para el 3er Sprint)
	// public void bajaUsuario(Usuario u) {
	// Statement st = null;
	// try {
	// ConexionDB con = new ConexionDB();
	// st = con.getConnection().createStatement();
	// String q = "DELETE FROM `lac`.`usuarios` WHERE dni ='" + u.getDni() +
	// "';";
	// Pantalla.write(q);
	// st.executeQuery(q);
	// con.getConnection().close();
	// } catch (SQLException ex) {
	// Logger.getLogger(BackOfficeDAO.class.getName()).log(Level.SEVERE, null,
	// ex);
	// }
	//
	// }

	// añade una nueva camiseta a la bbdd

	// elimina una camiseta de la bbdd segun el id
	// para el 3er sprint
	// public void bajaCamiseta(Camiseta c) {
	// Statement st = null;
	// try {
	// ConexionDB con = new ConexionDB();
	// st = con.getConnection().createStatement();
	// String q = "DELETE FROM `lac`.`camisetas` WHERE id ='" + c.getId() +
	// "';";
	// Pantalla.write(q);
	// st.executeQuery(q);
	// con.getConnection().close();
	// } catch (SQLException ex) {
	// Logger.getLogger(BackOfficeDAO.class.getName()).log(Level.SEVERE, null,
	// ex);
	// }
	//
	// }

}
