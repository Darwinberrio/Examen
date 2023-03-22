package Enunciado;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBBDD_Borrar {

	public static void main(int id) throws ClassNotFoundException, SQLException {
		// Registramos la clase
        Class.forName("org.sqlite.JDBC");
        
        // URL
		String url = "jdbc:sqlite:C:\\SQLlite\\lite";
		// con
		try(Connection con = DriverManager.getConnection(url)){
				
//			crear una aplicacion crud
//			Añadir - Eliminar y Listar
//			Personas (jugadores de baloncesto)
					
				var Delete = con.prepareStatement("DELETE FROM Jugadores WHERE ID =?;");
				Delete.setInt(1, id);
				Integer Filas = Delete.executeUpdate();
		}				
			  
	}

}
