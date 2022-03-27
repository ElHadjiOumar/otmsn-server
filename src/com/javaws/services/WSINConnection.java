package com.javaws.services;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import com.javaws.dao.UserDao;
import com.javaws.entities.User;

@WebService(name="WSINConnection",targetNamespace="http://services.inconnection.com")

public class WSINConnection {
	
	@WebMethod
	public void creerUserIn(
			@WebParam(name="nom")String nom,
			@WebParam(name="prenom")String prenom,
			@WebParam(name="nin")String nin,
			@WebParam(name="date_creation")String date_creation,
			@WebParam(name="numero")String numero,
			@WebParam(name="type")String type) throws Exception {
		
		UserDao dao = new UserDao();
		User user = new User(nom, prenom, nin, date_creation, numero, type);
		
		dao.createUserIn(user);
		
		
	}
}