package pack;

import java.sql.*;


public abstract class CrudOperations {

	private static String tableName = "empleados";

	protected static Connection getConnection() throws SQLException {
		String url="jdbc:mysql://localhost:3306/bdpersonas";
		String user="root";
		String pwd="1212";
		Connection conexion = null;

		try {
			conexion = DriverManager.getConnection(url, user, pwd);
			

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("===========Conexion perdida===========");
			e.printStackTrace();
		}finally {System.out.println("Conexion exitosa");}
		return conexion;

	}

	public static void recuperar() {
		String query = "SELECT * FROM " + tableName;
		try (Connection conexion = getConnection(); Statement stmt = conexion.createStatement();) {

			ResultSet rs = stmt.executeQuery(query);

			while (rs.next()) {
				int id = rs.getInt("id");
				String nombre = rs.getString("nombre");
				String apellido1 = rs.getString("apellido1");
				String apellido2 = rs.getString("apellido2");
				Date fechanacimiento = rs.getDate("fechanacimiento");
				double salario = rs.getDouble("salario");

				System.out.println(id + ", " + nombre + ", " + apellido1 + ", " + apellido2 + ", " + fechanacimiento
						+ ", " + salario);

			}
			conexion.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void insertar(int id, String nombre, String apellido1, String apellido2, Date fechanacimiento,
			double salario) {
		String query = "INSERT INTO " + tableName
				+ " (id, nombre, apellido1, apellido2, fechanacimiento, salario) VALUES (" + id + ", '" + nombre
				+ "', '" + apellido1 + "', '" + apellido2 + "', '" + fechanacimiento + "', " + salario + ")";
		try (Connection con = getConnection(); Statement stmt = con.createStatement();) {

			int result = stmt.executeUpdate(query);
			if (result > 0) {
				System.out.println(result + " registro(s) insertado(s)");
			} else {
				System.out.println("Registro no encontrado");
			}
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void eliminar(int id) {
		String query = "DELETE FROM " + tableName + " WHERE id = " + id;
		try (Connection con = getConnection(); Statement stmt = con.createStatement()) {

			int result = stmt.executeUpdate(query);
			if (result > 0) {
				System.out.println(result + " registro(s) actualizado(s)");
			} else {
				System.out.println("Registro no encontrado");
			}
			con.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void update(int id, double salario) {
		//String query = "UPDATE " + tableName + " SET salario = " + salario + " WHERE id = '" + id + "'";
		String query = "UPDATE " + tableName + " SET salario = " + salario + " WHERE id = " + id;
		try (Connection con = getConnection(); Statement stmt = con.createStatement();) {

			int result = stmt.executeUpdate(query);
			System.out.println(result + " registro(s) actualizado(s)");
			con.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void recuperarId(int idIn) {
		
		String query = "SELECT * FROM " + tableName + " WHERE id = '" + idIn + "'";
		try (Connection conexion = getConnection(); Statement stmt = conexion.createStatement();) {

			ResultSet rs = stmt.executeQuery(query);

			while (rs.next()) {
				int id = rs.getInt("id");
				String nombre = rs.getString("nombre");
				String apellido1 = rs.getString("apellido1");
				String apellido2 = rs.getString("apellido2");
				Date fechanacimiento = rs.getDate("fechanacimiento");
				double salario = rs.getDouble("salario");

				System.out.println(id + ", " + nombre + ", " + apellido1 + ", " + apellido2 + ", " + fechanacimiento
						+ ", " + salario);

			}
			conexion.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
