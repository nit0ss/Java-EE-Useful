package entregable6_bd.crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Recuperar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url = "jdbc:mysql://localhost:3306/bdpersonas";
		String user = "root";
		String pwd = "1212";

		String query = "SELECT * FROM persona";

		try (Connection conexion = DriverManager.getConnection(url, user, pwd);
				Statement sentencia = conexion.createStatement();) {

			ResultSet rs = sentencia.executeQuery(query);
			System.out.println("Registro actualizado");
			
			while (rs.next()) {
				System.out.print(rs.getString("Nombre") +" ");
				System.out.print(rs.getString("Apellidos"));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

	}

	/*
	 * SELECT ----> executeQuery(query) : devuelve -> Resultset
	 * INSERT/UPDATE,DELETE----> executeUpdate(query) : devuelve -> INT (filas
	 * afectadas) Otro: SQL---> execute(query) ----> boolean
	 */

}
