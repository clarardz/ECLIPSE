package TIENDA;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CRUD {
	@SuppressWarnings("null")
	public static void main(String[] args) {
		try {
			Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/tienda", "root", "");
			
			 // CREATE
			PreparedStatement create = conexion.prepareStatement("INSERT INTO Clientes(id,Nombre, Correo) VALUES (?,?,?)");
			create.setString(1, "5");
			create.setString(2, "LuegoTeBorro");
			create.setString(3, "nose@correo.com");
			create.executeUpdate();
			
			
			 // READ
			PreparedStatement consultaPreparada = conexion.prepareStatement("SELECT * from Clientes WHERE  id = ?");
			
			consultaPreparada.setInt(1, 4);
	
			ResultSet resultados = consultaPreparada.executeQuery(); 
			while (resultados.next()) {
			System.out.println("Cliente " + resultados.getInt("id")); 
			System.out.println("Nombre: " + resultados.getString("Nombre"));
			System.out.println("Correo: " + resultados.getString("Correo")); 
			System.out.println("...");
			}
			 // UPDATE
			PreparedStatement update = conexion.prepareStatement("UPDATE Clientes SET Correo = ? WHERE id = ?;");
			update.setString(1, "correoupdated@gmail.com");
			update.setInt(2, 4); 
			   update.executeUpdate();
			   
			 // DELETE
			 PreparedStatement delete  = conexion.prepareStatement("DELETE FROM Clientes WHERE id = ?;");
			 delete.setString(1, "5");
			 delete.executeUpdate();
			   
		} catch (SQLException e) { 
			e.printStackTrace();
		}
		
	}}