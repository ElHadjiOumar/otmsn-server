package com.javaws.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.javaws.entities.User;
import com.javaws.jdbc.DBGPRS;
import com.javaws.jdbc.DBHLR;
import com.javaws.jdbc.DBIN;

public class UserDao {
	
	public void createUserHlr(User user) throws Exception {
		
		Connection connection = DBHLR.getConnection() ;
		String queryCreeDemande = "INSERT INTO t_userhlr(nom,prenom,nin,date_creation,numero,type) VALUES (?,?,?,?,?,?)";

	    PreparedStatement preparedStatement = connection.prepareStatement(queryCreeDemande);
	    preparedStatement.setString(1, user.getNom());
	    preparedStatement.setString(2, user.getPrenom());
	    preparedStatement.setString(3, user.getNin());
	    preparedStatement.setString(4, user.getDate_creation());
	    preparedStatement.setString(5, user.getNumero());
	    preparedStatement.setString(6, user.getType());
	    
	    int i=preparedStatement.executeUpdate();  
	    System.out.println(i+" Enregistrement user dans bd hlr effectue"); 
	    	    	    
	    connection.close();
	    	
	}
	
	public void createUserIn(User user) throws Exception {
		
		Connection connection = DBIN.getConnection() ;
		String queryCreeDemande = "INSERT INTO t_userin(nom,prenom,nin,date_creation,numero,type) VALUES (?,?,?,?,?,?)";

	    PreparedStatement preparedStatement = connection.prepareStatement(queryCreeDemande);
	    preparedStatement.setString(1, user.getNom());
	    preparedStatement.setString(2, user.getPrenom());
	    preparedStatement.setString(3, user.getNin());
	    preparedStatement.setString(4, user.getDate_creation());
	    preparedStatement.setString(5, user.getNumero());
	    preparedStatement.setString(6, user.getType());
	    
	    int i=preparedStatement.executeUpdate();  
	    System.out.println(i+" Enregistrement user dans bd in effectue"); 
	    	    	    
	    connection.close();
	    	
	}
	public void createUserGprs(User user) throws Exception {
		
		Connection connection = DBGPRS.getConnection() ;
		String queryCreeDemande = "INSERT INTO t_usergprs(nom,prenom,nin,date_creation,numero,type) VALUES (?,?,?,?,?,?)";

	    PreparedStatement preparedStatement = connection.prepareStatement(queryCreeDemande);
	    preparedStatement.setString(1, user.getNom());
	    preparedStatement.setString(2, user.getPrenom());
	    preparedStatement.setString(3, user.getNin());
	    preparedStatement.setString(4, user.getDate_creation());
	    preparedStatement.setString(5, user.getNumero());
	    preparedStatement.setString(6, user.getType());
	    
	    int i=preparedStatement.executeUpdate();  
	    System.out.println(i+" Enregistrement user dans bd gprs effectue"); 
	    	    	    
	    connection.close();
	    	
	}


	
}
