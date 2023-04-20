package entregable6_bd.crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Delete {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url = "jdbc:mysql://localhost:3306/bdpersonas";
		String user = "root";
		String pwd = "1212";

		String query = "DELETE FROM persona WHERE Nombre='Jorge'";

		try (Connection conexion = DriverManager.getConnection(url, user, pwd);
				Statement sentencia = conexion.createStatement();) {
			if (sentencia.executeUpdate(query) > 0) {
				System.out.println("Registro borrado");
			} else
				System.out.println("Registro inexsitente");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

	}

}
