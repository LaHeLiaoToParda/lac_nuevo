package data;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

import model.Camiseta;
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
			String q = "INSERT INTO `lac`.`usuarios` (`dni`, `nombre`, `apellidos`, `rol`, `contrasena`, `direccion`)"
					+ "VALUES (`" + u.getDni() + "`, `" + u.getNombre() + "`, `" + u.getApellidos() + "`, `"
					+ u.getRol() + "`, `" + u.getContrasena() + "`, `" + u.getDni() + "`);";
			Pantalla.write(q);
			st.executeQuery(q);
			con.getConnection().close();
		} catch (SQLException ex) {
			Logger.getLogger(BackOfficeDAO.class.getName()).log(Level.SEVERE, null, ex);
		}
	}

	public boolean comprobarUsuarios(String usuario, String contrasena) throws SQLException {
		Statement st = null;
		ConexionDB con = new ConexionDB();
		st = con.getConnection().createStatement();

		String q = "SELECT nick, contrasena FROM usuarios WHERE nick ='" + usuario + "' AND contrasena='" + contrasena
				+ "'";
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
	public void altaCamiseta(Camiseta c) {
		Statement st = null;
		try {
			ConexionDB con = new ConexionDB();
			st = con.getConnection().createStatement();
			String q = "INSERT INTO `lac`.`camisetas` VALUES ('" + c.getId() + "','" + c.getColor() + "','"
					+ c.getPrecio() + "','" + c.getGenero() + "','" + c.getTalla() + "','" + c.getCategoria() + "','"
					+ c.getStock() + "','" + c.getUrl() + "','" + c.getDescripcion() + "')";
			Pantalla.write(q);
			st.executeQuery(q);
			con.getConnection().close();
		} catch (SQLException ex) {
			Logger.getLogger(BackOfficeDAO.class.getName()).log(Level.SEVERE, null, ex);
		}
	}

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
