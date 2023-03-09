package BANCO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class insert {
	public static void main(String[] args) {
		try {
			/*
			subprotocolo: mysql 
			host: localhost 
			puerto: 3306
			base de datos: banco 
			usuario: banco 
			contraseña: fullstack
			*/
			

			Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/banco", "banco", "fullstack");
			// obtención de un objeto de tipo Statement
			Statement instruccion = conexion.createStatement();
			// construir sentencia SQL
			String query = "SELECT * FROM cliente WHERE saldo > 500 ORDER BY id DESC";
	
			// ejecutar instrucción con el método execute
			boolean resultado = instruccion.execute(query);
			// si es true, entonces la instrucción devuelve un objeto de tipo ResultSet
			if (resultado) {
			ResultSet resultados2 = instruccion.getResultSet();
			System.out.println("Listado de gestores (con execute): ");
			while (resultados2.next()) {
			System.out.println("Gestor " + resultados2.getInt("id")); System.out.println("Usuario: " + resultados2.getString("usuario")); System.out.println("Password: " + resultados2.getString("password")); System.out.println("Correo: " + resultados2.getString("correo")); System.out.println("...");
			} }
			
		} catch (SQLException e) { 
			e.printStackTrace();
		}
		
	}}