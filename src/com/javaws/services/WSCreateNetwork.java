package com.javaws.services;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import com.javaws.dao.UserDao;
import com.javaws.entities.User;

@WebService(name="WSCreateNetwork",targetNamespace="http://services.createnetwork.com")

public class WSCreateNetwork {

	@WebMethod
	public void creerUserGPRS(
			@WebParam(name="nom")String nom,
			@WebParam(name="prenom")String prenom,
			@WebParam(name="nin")String nin,
			@WebParam(name="date_creation")String date_creation,
			@WebParam(name="numero")String numero,
			@WebParam(name="type")String type) throws Exception {
		
		UserDao dao = new UserDao();
		User user = new User(nom, prenom, nin, date_creation, numero, type);
		
		dao.createUserGprs(user);
		
		
	}
}
