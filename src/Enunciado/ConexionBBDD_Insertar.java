package Enunciado;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBBDD_Insertar {
	
	public static void main(int id, String nombre, String equipo, int numero, double altura) throws ClassNotFoundException, SQLException {
		// Registramos la clase
        Class.forName("org.sqlite.JDBC");
        
        // URL
		String url = "jdbc:sqlite:C:\\SQLlite\\lite";
		// con
		try(Connection con = DriverManager.getConnection(url)){

		
		var Insert = con.prepareStatement("INSERT INTO Jugadores VALUES(?,?,?,?,?);");
		Insert.setInt(1, id);
		Insert.setString(2, nombre);
		Insert.setString(3, equipo);
		Insert.setInt(4, numero);
		Insert.setDouble(5, altura);
		Integer Filas = Insert.executeUpdate();
		}
	
	}
}
