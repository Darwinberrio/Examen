package Enunciado;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class CRUD {
	
	static List<String> opcion = new ArrayList<>();

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
//		Examen- prueba
//		crear una aplicacion crud
//		Añadir - Eliminar y Listar
//		Personas (jugadores de baloncesto)
		
//		Atributos de las personas 
		
//		id -numero identificativo
//		nombre
//		equipo
//		numero(numero camiseta)
//		alturaç
		
		JOptionPane.showConfirmDialog(null, " APLICACION C:R:U:D \n Estas modificando la base de datos \n ¿Deseas continuar?");
		
		Integer opcion = pedirTexto();		
		
		System.out.print(opcion);	
		
		if(opcion.equals(1)) {
			
			String campo1 = JOptionPane.showInputDialog("ID");
			int id = Integer.parseInt(campo1);
			String nombre = JOptionPane.showInputDialog("Nombre");
			String equipo = JOptionPane.showInputDialog("Equipo");
			String campo2 = JOptionPane.showInputDialog("Numero");
			int numero = Integer.parseInt(campo2);
			String campo3 = JOptionPane.showInputDialog("Altura");
			double altura = Double.parseDouble(campo3);
			
			
			ConexionBBDD_Insertar.main( id,  nombre,  equipo,  numero,  altura);
			
			devolverMensaje(opcion);
		}
		if(opcion.equals(2)) {
			
			String campo1 = JOptionPane.showInputDialog("introduzca el ID del campo que desea borrar");
			int id = Integer.parseInt(campo1);
			
			ConexionBBDD_Borrar.main(id);
			
			devolverMensaje(opcion);
			
		}
		if(opcion.equals(3)) {
			ConexionBBDD.main();
			devolverMensaje(opcion);
		}		
	}
		

	public static Integer pedirTexto() {
		Integer opcion;
		do {
			try {

				String texto = JOptionPane.showInputDialog("Elige una opción \n 1-Añadir \n 2-Eliminar \n 3-Listar", null);
				opcion = Integer.parseInt(texto);
				if (opcion.equals(1) || opcion.equals(2) || opcion.equals(3)) {
					return opcion;						
					
				} else {
						JOptionPane.showMessageDialog(null, "No me has metido una opcion valida");
				}

			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Ehhhh no me has metido un número");
			}
		} while (true);
	}

	public static void devolverMensaje(Integer variable) {

		switch (variable) {
		case 1: {
			JOptionPane.showMessageDialog(null, "Has añadido un nuevo jugador");
			break;
		}
		case 2: {
			JOptionPane.showMessageDialog(null, "Has eliminado un jugador");
			break;
		}
		case 3: {
			JOptionPane.showMessageDialog(null, "Has listado un campo de jugador");
			break;
		}

		}
	}
}
