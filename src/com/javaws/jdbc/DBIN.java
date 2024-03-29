package com.javaws.jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBIN {
	private static Connection connection = null;

	public static Connection getConnection () throws Exception {
		try {
			// Chargement du driver jdbc mysql
			Class.forName ("com.mysql.cj.jdbc.Driver");
 
			// Ouverture de la connexion
			connection = DriverManager.getConnection ("jdbc:mysql://localhost/otmns_in?serverTimezone=UTC", "root", "");

			return connection;
		} catch (ClassNotFoundException e) {
			throw new Exception ("Driver Class not found : '" + e.getMessage () + "' ");
		} catch (SQLException e) {
			throw new Exception ("Error : Unable to open connection with database : " + e.getMessage());
		}
	}
}
