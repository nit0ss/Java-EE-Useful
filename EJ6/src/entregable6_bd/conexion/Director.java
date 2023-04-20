package entregable6_bd.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Director {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url="jdbc:mysql://localhost:3306/bdpersonas";
		String user="root";
		String pwd="1212";
		
		try {
			Connection conexion = DriverManager.getConnection(url,user,pwd);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("===========Conexion perdida===========");
			e.printStackTrace();
		}finally{
			System.out.println("Conexion exitosa");
			
		}
	
		
	
	}
	
	

}
