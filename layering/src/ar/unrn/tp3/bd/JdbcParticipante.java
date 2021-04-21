package ar.unrn.tp3.bd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import ar.unrn.tp3.modelo.Participante;
import ar.unrn.tp3.modelo.RepositorioDeParticipantes;
import ar.unrn.tp3.modelo.ValidacionException;

public class JdbcParticipante implements RepositorioDeParticipantes {

	private Connection dbConn;

	@Override
	public void guardarParticipante(String nombre, String telefono, String region) throws ValidacionException {
		// TODO Auto-generated method stub
		PreparedStatement st = null;
		try {

			Participante p = new Participante(nombre, telefono, region);

			st = dbConn.prepareStatement("insert   into   participantes(nombre,   telefono,   region)values(?,?,?)");

			st.setString(1, p.nombre());
			st.setString(2, p.telefono());
			st.setString(3, p.region());
			st.executeUpdate();

			st.close();

		} catch (SQLException e) {
			throw new ValidacionException("No se pudo guardar al participante");
		}
	}

	@Override
	public void setUpBaseDatos() throws ValidacionException {
		// TODO Auto-generated method stub
		try {

			String url = "jdbc:derby://localhost:1527/participantes";
			String user = "app";
			String password = "app";
			this.dbConn = DriverManager.getConnection(url, user, password);

		} catch (SQLException e) {
			throw new ValidacionException("No se pudo establecer la conexion con la base de datos");
		}
	}
}