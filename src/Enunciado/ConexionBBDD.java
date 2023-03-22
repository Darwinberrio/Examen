package Enunciado;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBBDD {

	public static void main() throws ClassNotFoundException, SQLException {
		// Registramos la clase
        Class.forName("org.sqlite.JDBC");
        
        // URL
		String url = "jdbc:sqlite:C:\\SQLlite\\lite";
		// con
		try(Connection con = DriverManager.getConnection(url)){
				
//			crear una aplicacion crud
//			Añadir - Eliminar y Listar
//			Personas (jugadores de baloncesto)
										
			  
				var Listar = con.prepareStatement("SELECT * FROM Jugadores;");
				var resultSet = Listar.executeQuery();
				while(resultSet.next()) {
					System.out.println(resultSet.getInt(1));
					System.out.println(resultSet.getString(2));
					System.out.println(resultSet.getString(3));
					System.out.println(resultSet.getInt(4));
					System.out.println(resultSet.getDouble(5));
					
				
			}
			
			
			
		}

	}

	
	
}
