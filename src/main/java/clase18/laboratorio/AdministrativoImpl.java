package clase18.laboratorio;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class AdministrativoImpl implements DAO<Integer, Persona>, ConexionMySql {

	@Override
	public boolean save(Persona p) {

		Administrativo admin = (Administrativo) p;

		String sql = "INSERT INTO administrativo (nombre, apellido, tipoDocumento, numeroDocumento, fechaNacimiento, fechaCargo, sueldo) "
				+ "VALUES  (?,?,?,?,?,?,?);";

		try (Connection conexion = getConexion()) {

			PreparedStatement declaracionPreparadaSQL = conexion.prepareStatement(sql);

			declaracionPreparadaSQL.setString(1, admin.getNombre());
			declaracionPreparadaSQL.setString(2, admin.getApellido());
			declaracionPreparadaSQL.setString(3, admin.getDocumento().getTipoDocumento());
			declaracionPreparadaSQL.setInt(4, admin.getDocumento().getNumeroDocumento());
			declaracionPreparadaSQL.setDate(5, Date.valueOf(admin.getFechaNacimiento()));
			declaracionPreparadaSQL.setDate(6, Date.valueOf(admin.getFechaCargo()));
			declaracionPreparadaSQL.setDouble(7, admin.getSueldo());

			if (declaracionPreparadaSQL.executeUpdate() > 0) {
				return true;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return false;

	}

	@Override
	public List<Persona> listar() {

		String sql = "select nombre, apellido, tipoDocumento, numeroDocumento, fechaNacimiento, fechaCargo, sueldo "
				+ "from administrativo";

		List<Persona> lista = new ArrayList<>();

		try (Connection conexion = getConexion()) {

			PreparedStatement pst = conexion.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();

			while (rs.next()) {
				String nombre = rs.getString("nombre");
				String apellido = rs.getString("apellido");
				String tipoDocumento = rs.getString("tipoDocumento");
				Integer numeroDocumento = rs.getInt("numeroDocumento");
				LocalDate fechaNacimiento = rs.getDate("fechaNacimiento").toLocalDate();
				LocalDate fechaCargo = rs.getDate("fechaCargo").toLocalDate();
				Double sueldo = rs.getDouble("sueldo");

				Administrativo administrativo = new Administrativo(nombre, apellido,
						new Documento(tipoDocumento, numeroDocumento), fechaNacimiento, fechaCargo, sueldo);

				lista.add(administrativo);

			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return lista;
	}

	
	public List<Persona> listar(boolean esOrdenadoBaseDeDatos) {

		List<Persona> lista = listar();

		if (!esOrdenadoBaseDeDatos) {
			lista.sort((e1, e2) -> ((Double) ((Administrativo) e1).getSueldo())
					.compareTo((Double) ((Administrativo) e2).getSueldo()));
		}

		return lista;
	}

}
