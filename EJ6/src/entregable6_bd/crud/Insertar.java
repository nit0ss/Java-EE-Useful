package entregable6_bd.crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Insertar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url = "jdbc:mysql://localhost:3306/bdpersonas";
		String user = "root";
		String pwd = "1212";

		String query = "INSERT INTO persona (ID,Nombre,Apellidos,Edad) values('01','Jorge','Gil',33)";

		try (Connection conexion = DriverManager.getConnection(url, user, pwd);
				Statement sentencia = conexion.createStatement();) {
			sentencia.executeUpdate(query);
			System.out.println("Registro insertado");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
